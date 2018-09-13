/** 
 * projectName:Java开发实战经典 
 * fileName:StringDemo05.java 
 * packageName:com.java.development.five.string 
 * date:2018年9月13日下午6:40:53 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.string;

/**   
 * @title: StringDemo05.java 
 * @package com.java.development.five.string 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月13日 下午6:40:53 
 * @version: V1.0   
*/
public class StringDemo05 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月13日 下午6:40:53
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = str2;
        System.out.println("str1 equals str2--->" + str1.equals(str2));
        System.out.println("str1 equals str3--->" + str1.equals(str3));
        System.out.println("str2 equals str3--->" + str2.equals(str3));

    }

}
