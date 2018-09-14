/** 
 * projectName:Java开发实战经典 
 * fileName:Node.java 
 * packageName:com.java.development.five.link 
 * date:2018年9月17日下午4:32:36 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.link;

/**   
 * @title: Node.java 
 * @package com.java.development.five.link 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月17日 下午4:32:36 
 * @version: V1.0   
*/
public class Node {
    private String data;
    private Node   next;

    public Node(String data) {
        super();
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
