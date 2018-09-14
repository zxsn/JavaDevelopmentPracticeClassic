/** 
 * projectName:Java开发实战经典 
 * fileName:LinkDemo01.java 
 * packageName:com.java.development.five.link 
 * date:2018年9月17日下午4:32:02 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.link;

/**   
 * @title: LinkDemo01.java 
 * @package com.java.development.five.link 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月17日 下午4:32:02 
 * @version: V1.0   
*/

public class LinkDemo01 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午4:32:02
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Node root = new Node("火车头");
        Node n1 = new Node("车厢-A");
        Node n2 = new Node("车厢-B");
        Node n3 = new Node("车厢-C");

        root.setNext(n1);
        n1.setNext(n2);
        n2.setNext(n3);
        print(root);

    }

    /**
     *@title print 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午4:36:30
     *@param root
     *@throws 
     */
    private static void print(Node node) {
        System.out.println(node.getData() + "\t");
        if (node.getNext() != null) {
            print(node.getNext());
        }

    }

}
