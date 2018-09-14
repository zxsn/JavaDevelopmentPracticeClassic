/** 
 * projectName:Java开发实战经典 
 * fileName:PolDemo01.java 
 * packageName:com.java.development.six.polymorphic 
 * date:2018年9月21日下午4:22:14 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.polymorphic;

/**   
 * @title: PolDemo01.java 
 * @package com.java.development.six.polymorphic 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月21日 下午4:22:14 
 * @version: V1.0   
*/
public class PolDemo01 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月21日 下午4:22:14
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        B b = new B();
        A a = b; //线上转型  子类-->父类
        a.fun1();

    }

}
