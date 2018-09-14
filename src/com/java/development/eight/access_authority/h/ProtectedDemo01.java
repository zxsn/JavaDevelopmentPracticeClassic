/** 
 * projectName:Java开发实战经典 
 * fileName:SubHelloDemo.java 
 * packageName:com.java.development.eight.access_authority 
 * date:2018年9月29日下午12:29:30 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.eight.access_authority.h;

import com.java.development.eight.access_authority.g.HelloDemo;

class SubHelloDemo extends HelloDemo {
    public void print() {
        System.out.println("访问受保护属性：" + super.name);
    }
}

/**   
 * @title: ProtectedDemo01.java 
 * @package com.java.development.eight.access_authority 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月29日 下午12:29:30 
 * @version: V1.0   
*/
public class ProtectedDemo01 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月29日 下午12:29:30
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        SubHelloDemo sub = new SubHelloDemo();
        sub.print();

    }

}
