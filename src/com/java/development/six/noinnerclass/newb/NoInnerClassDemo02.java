/** 
 * projectName:Java开发实战经典 
 * fileName:NoInnerClassDemo02.java 
 * packageName:com.java.development.six.noinnerclass.newb 
 * date:2018年9月27日下午4:06:32 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.noinnerclass.newb;

/**   
 * @title: NoInnerClassDemo02.java 
 * @package com.java.development.six.noinnerclass.newb 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月27日 下午4:06:32 
 * @version: V1.0   
*/
interface A {
    public void printInfo();
}

class X {
    /**
     *@title fun1 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月27日 下午4:07:44
     *@throws 
     */
    public void fun1() {
        this.fun2(new A() { //匿名内部类

            @Override
            public void printInfo() {
                System.out.println("Hello World!!!");

            }

        });

    }

    public void fun2(A a) {
        a.printInfo();
    }
}

public class NoInnerClassDemo02 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月27日 下午4:06:32
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        new X().fun1();

    }

}
