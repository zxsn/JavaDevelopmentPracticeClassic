/** 
 * projectName:Java开发实战经典 
 * fileName:RefDemo03.java 
 * packageName:com.java.development.five.reference 
 * date:2018年9月14日上午10:12:49 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.reference;

/**   
 * @title: RefDemo03.java 
 * @package com.java.development.five.reference 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月14日 上午10:12:49 
 * @version: V1.0   
*/
class RefDemo03Demo {
    String temp = "hello";
}

public class RefDemo03 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月14日 上午10:12:49
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        RefDemo03Demo d1 = new RefDemo03Demo();
        d1.temp = "world";
        System.out.println("fun()方法调用之前：" + d1.temp);
        fun(d1);
        System.out.println("fun()方法调用之后：" + d1.temp);

    }

    /**
     *@title fun 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月14日 上午10:14:46
     *@param temp
     *@throws 
     */
    public static void fun(RefDemo03Demo d2) {
        d2.temp = "MLDN";

    }

}
