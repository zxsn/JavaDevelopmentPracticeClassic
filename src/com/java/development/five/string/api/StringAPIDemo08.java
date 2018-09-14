/** 
 * projectName:Java开发实战经典 
 * fileName:StringAPIDemo08.java 
 * packageName:com.java.development.five.string.api 
 * date:2018年9月14日上午9:47:24 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.string.api;

/**   
 * @title: StringAPIDemo08.java 
 * @package com.java.development.five.string.api 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月14日 上午9:47:24 
 * @version: V1.0   
*/
public class StringAPIDemo08 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月14日 上午9:47:24
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        String str1 = "hello world";
        String s[] = str1.split(" "); //按空格进行字符串的拆分
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);

        }
    }

}
