/** 
 * projectName:Java开发实战经典 
 * fileName:B.java 
 * packageName:com.java.development.six.polymorphic 
 * date:2018年9月21日下午4:23:48 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.instanceofdemo;

/**   
 * @title: B.java 
 * @package com.java.development.six.instanceofdemo 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月21日 下午4:23:48 
 * @version: V1.0   
*/
public class B extends A {
    public void fun1() { //覆写的方法
        System.out.println("B---->fun1()方法");
    }

    public void fun3() { //自己的方法
        System.out.println("B---->fun3()方法");
    }
}
