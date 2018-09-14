/** 
 * projectName:Java开发实战经典 
 * fileName:PolDemo02.java 
 * packageName:com.java.development.six.polymorphic 
 * date:2018年9月21日下午4:28:47 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.polymorphic;

/**   
 * @title: PolDemo02.java 
 * @package com.java.development.six.polymorphic 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月21日 下午4:28:47 
 * @version: V1.0   
*/
public class PolDemo02 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月21日 下午4:28:47
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        A a = new B();
        B b = (B) a; //向下转型      父类-->子类
        b.fun1();
        b.fun2();
        b.fun3();

    }

}
