/** 
 * projectName:Java开发实战经典 
 * fileName:NoInnerClassDemo01.java 
 * packageName:com.java.development.six.noinnerclass 
 * date:2018年9月27日下午3:58:04 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.noinnerclass.old;

/**   
 * @title: NoInnerClassDemo01.java 
 * @package com.java.development.six.noinnerclass 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月27日 下午3:58:04 
 * @version: V1.0   
*/
interface A {
    public void printInfo();
}

class B implements A {

    /**   
     * @title: printInfo
     * @description: TODO   
     * @see com.java.development.six.noinnerclass.old.A#printInfo()     
     */
    @Override
    public void printInfo() {
        System.out.println("Hello World!!!");

    }

}

class X {
    public void fun1() {
        this.fun2(new B());
    }

    public void fun2(A a) {
        a.printInfo();
    }
}

public class NoInnerClassDemo01 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月27日 下午3:58:04
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        new X().fun1();//实例化X类对象并调用fun1()方法

    }

}
