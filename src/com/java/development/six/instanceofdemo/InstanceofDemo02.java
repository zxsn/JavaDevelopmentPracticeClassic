/** 
 * projectName:Java开发实战经典 
 * fileName:InstanceofDemo02.java 
 * packageName:com.java.development.six.polymorphic 
 * date:2018年9月21日下午5:20:56 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.instanceofdemo;

import com.java.development.six.polymorphic.A;
import com.java.development.six.polymorphic.B;
import com.java.development.six.polymorphic.C;

/**   
 * @title: InstanceofDemo02.java 
 * @package com.java.development.six.polymorphic 
 * @description: TODO在下转型前进行验证
 * @author: zxsn
 * @date: 2018年9月21日 下午5:20:56 
 * @version: V1.0   
*/
public class InstanceofDemo02 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月21日 下午5:20:56
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        fun(new B());
        fun(new C());

    }

    /**
     *@title fun 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月21日 下午5:22:13
     *@param b
     *@throws 
     */
    public static void fun(A a) {
        a.fun1();
        if (a instanceof B) {
            B b = (B) a;
            b.fun3();
        }
        if (a instanceof C) {
            C c = (C) a;
            c.fun5();
        }

    }

}
