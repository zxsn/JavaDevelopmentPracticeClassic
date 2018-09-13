/** 
 * projectName:Java开发实战经典 
 * fileName:StringDemo09.java 
 * packageName:com.java.development.five.string 
 * date:2018年9月13日下午7:02:00 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.string;

/**   
 * @title: StringDemo09.java 
 * @package com.java.development.five.string 
 * @description: TODO字符串的内容不可改变
 * @author: zxsn
 * @date: 2018年9月13日 下午7:02:00 
 * @version: V1.0   
*/
public class StringDemo09 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月13日 下午7:02:00
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        String str = "hello";
        str = str + " world!";
        System.out.println("str = " + str);
    }

}
