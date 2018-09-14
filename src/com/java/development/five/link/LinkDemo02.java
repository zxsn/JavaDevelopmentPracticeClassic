/** 
 * projectName:Java开发实战经典 
 * fileName:LinkDemo02.java 
 * packageName:com.java.development.five.link 
 * date:2018年9月17日下午4:40:21 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.link;

/**   
 * @title: LinkDemo02.java 
 * @package com.java.development.five.link 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月17日 下午4:40:21 
 * @version: V1.0   
*/
class Link {
    class Node {
        private String data;
        private Node   next;

        public Node(String data) {
            super();
            this.data = data;
        }

        /**
         *@title add 
         *@description: TODO
         *@author: zxsn
         *@date: 2018年9月17日 下午4:46:49
         *@param newNode
         *@throws 
         */
        public void add(Node newNode) {
            if (this.next == null) {
                this.next = newNode;
            } else {
                this.next.add(newNode);
            }

        }

        /**
         *@title print 
         *@description: TODO
         *@author: zxsn
         *@date: 2018年9月17日 下午4:51:32
         *@throws 
         */
        public void print() {
            System.out.print(this.data + "\t");
            if (this.next != null) {
                this.next.print();
            }

        }

        /**
         *@title delete 
         *@description: TODO
         *@author: zxsn
         *@date: 2018年9月17日 下午4:57:51
         *@param root
         *@param data2
         *@throws 
         */
        public void delete(Node previous, String data) {
            if (data.equals(this.data)) {
                previous.next = this.next;
            } else {
                if (this.next != null) {
                    this.next.delete(this, data);
                }
            }

        }

        /**
         * @param data 
         *@title search 
         *@description: TODO
         *@author: zxsn
         *@date: 2018年9月17日 下午5:02:58
         *@return
         *@throws 
         */
        public boolean search(String data) {
            if (data.equals(this.data)) {
                return true;
            } else {
                if (this.next != null) {
                    return this.next.search(data);
                } else {

                    return false;
                }
            }
        }

    }

    private Node root;

    /**
     *@title addNode 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午4:44:45
     *@param string
     *@throws 
     */
    public void addNode(String data) {
        Node newNode = new Node(data);
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.root.add(newNode);
        }

    }

    /**
     *@title printNode 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午4:50:39
     *@throws 
     */
    public void printNode() {
        if (this.root != null) {
            this.root.print();
        }

    }

    /**
     *@title deleteNode 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午4:54:17
     *@param string
     *@throws 
     */
    public void deleteNode(String data) {
        if (this.contains(data)) {
            if (this.root.data.equals(data)) {
                this.root = this.root.next;
            } else {
                this.root.next.delete(root, data);
            }
        }

    }

    /**
     *@title contains 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午4:54:55
     *@param data
     *@return
     *@throws 
     */
    boolean contains(String name) {

        return this.root.search(name);
    }

}

public class LinkDemo02 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午4:40:21
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Link l = new Link();
        l.addNode("A");
        l.addNode("B");
        l.addNode("C");
        l.addNode("D");
        l.addNode("E");
        System.out.println("====================删除节点之前======================");
        l.printNode();
        l.deleteNode("C");
        l.deleteNode("D");
        System.out.println();
        System.out.println("====================删除节点之后======================");
        l.printNode();
        System.out.println();
        System.out.println("查询节点：" + l.contains("A"));
    }

}
