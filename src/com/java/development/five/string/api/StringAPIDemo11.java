/** 
 * projectName:Java开发实战经典 
 * fileName:StringAPIDemo11.java 
 * packageName:com.java.development.five.string.api 
 * date:2018年9月14日上午9:57:56 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.string.api;

/**   
 * @title: StringAPIDemo11.java 
 * @package com.java.development.five.string.api 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月14日 上午9:57:56 
 * @version: V1.0   
*/
public class StringAPIDemo11 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月14日 上午9:57:56
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        String str1 = "HELLO";
        String str2 = "hello";
        System.out.println("\"HELLO\" equals \"hello\"-->" + str1.equals(str2));
        System.out.println("\"HELLO\" equalsIgnoreCase \"hello\"-->" + str1.equalsIgnoreCase(str2));

    }

}
