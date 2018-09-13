/** 
 * projectName:Java开发实战经典 
 * fileName:StringDemo04.java 
 * packageName:com.java.development.five.string 
 * date:2018年9月13日下午6:02:44 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.string;

/**   
 * @title: StringDemo04.java 
 * @package com.java.development.five.string 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月13日 下午6:02:44 
 * @version: V1.0   
*/
public class StringDemo04 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月13日 下午6:02:44
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = str2;
        System.out.println("str1====>str2-->" + (str1 == str2));
        System.out.println("str1====>str3-->" + (str1 == str3));
        System.out.println("str2====>str3-->" + (str2 == str3));
    }

}
