/** 
 * projectName:Java开发实战经典 
 * fileName:PolDemo03.java 
 * packageName:com.java.development.six.polymorphic 
 * date:2018年9月21日下午4:31:17 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.polymorphic;

/**   
 * @title: PolDemo03.java 
 * @package com.java.development.six.polymorphic 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月21日 下午4:31:17 
 * @version: V1.0   
*/
public class PolDemo03 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月21日 下午4:31:17
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        A a = new A();
        B b = (B) a; //运行时报错。在进行下转型之前，必须发生向上转型
        b.fun1();
        b.fun2();
        b.fun3();
    }

}
