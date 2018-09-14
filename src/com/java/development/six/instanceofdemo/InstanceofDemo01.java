/** 
 * projectName:Java开发实战经典 
 * fileName:InstanceofDemo01.java 
 * packageName:com.java.development.six.polymorphic 
 * date:2018年9月21日下午5:14:08 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.instanceofdemo;

import com.java.development.six.polymorphic.A;
import com.java.development.six.polymorphic.B;

/**   
 * @title: InstanceofDemo01.java 
 * @package com.java.development.six.polymorphic 
 * @description: TODO验证instanceof关键字的作用
 * @author: zxsn
 * @date: 2018年9月21日 下午5:14:08 
 * @version: V1.0   
*/
public class InstanceofDemo01 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月21日 下午5:14:08
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        A a1 = new B(); //通过向上转型实例化A类对象
        System.out.println("A a1 = new B():" + (a1 instanceof A));
        System.out.println("A a1 = new B():" + (a1 instanceof B));
        A a2 = new A(); //通过A类的构造实例化本类对象
        System.out.println("A a2 = new A():" + (a2 instanceof A));
        System.out.println("A a2 = new A():" + (a2 instanceof B));

    }

}
