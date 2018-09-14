/** 
 * projectName:Java开发实战经典 
 * fileName:RefDemo02.java 
 * packageName:com.java.development.five.reference 
 * date:2018年9月14日上午10:08:59 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.reference;

/**   
 * @title: RefDemo02.java 
 * @package com.java.development.five.reference 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月14日 上午10:08:59 
 * @version: V1.0   
*/
public class RefDemo02 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月14日 上午10:08:59
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        String str1 = "hello";
        System.out.println("fun()方法调用之前：" + str1);
        fun(str1);
        System.out.println("fun()方法调用之后：" + str1);

    }

    /**
     *@title fun 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月14日 上午10:11:08
     *@param str1
     *@throws 
     */
    public static void fun(String str2) {
        str2 = "MLDN";

    }

}
