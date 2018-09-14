/** 
 * projectName:Java开发实战经典 
 * fileName:PolDemo04.java 
 * packageName:com.java.development.six.polymorphic 
 * date:2018年9月21日下午4:34:45 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.polymorphic;

/**   
 * @title: PolDemo04.java 
 * @package com.java.development.six.polymorphic 
 * @description: TODO设计一个方法，要求此方法可以接受A类的任意子类方法，并调用方法。（不使用多态）
 * @author: zxsn
 * @date: 2018年9月21日 下午4:34:45 
 * @version: V1.0   
*/
public class PolDemo04 {
    public static void main(String[] args) {

        fun(new B());
        fun(new C());
    }

    /**
     *@title fun 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月21日 下午4:38:16
     *@param b
     *@throws 
     */
    public static void fun(B b) {
        b.fun1();

    }

    /**
     *@title fun 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月21日 下午4:38:47
     *@param c
     *@throws 
     */
    public static void fun(C c) {
        c.fun1();
    }
}
