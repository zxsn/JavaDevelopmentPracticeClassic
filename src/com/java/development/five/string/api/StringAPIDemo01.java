/** 
 * projectName:Java开发实战经典 
 * fileName:StringAPIDemo01.java 
 * packageName:com.java.development.five.string 
 * date:2018年9月13日下午7:08:49 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.string.api;

/**   
 * @title: StringAPIDemo01.java 
 * @package com.java.development.five.string 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月13日 下午7:08:49 
 * @version: V1.0   
*/
public class StringAPIDemo01 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月13日 下午7:08:49
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        String str1 = "hello";
        char c[] = str1.toCharArray(); //将字符串变为字符数组
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + "\t");

        }
        System.out.println("");
        String str2 = new String(c); //将全部字符数组变为String
        String str3 = new String(c, 0, 3); //将部分字符串变成String
        System.out.println(str2);
        System.out.println(str3);
    }

}
