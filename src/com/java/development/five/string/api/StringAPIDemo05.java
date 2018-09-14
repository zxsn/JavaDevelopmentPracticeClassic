/** 
 * projectName:Java开发实战经典 
 * fileName:StringAPIDemo05.java 
 * packageName:com.java.development.five.string.api 
 * date:2018年9月13日下午7:35:58 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.string.api;

/**   
 * @title: StringAPIDemo05.java 
 * @package com.java.development.five.string.api 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月13日 下午7:35:58 
 * @version: V1.0   
*/
public class StringAPIDemo05 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月13日 下午7:35:58
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        String str1 = "abcdefgcgh";
        System.out.println(str1.indexOf("c"));
        System.out.println(str1.indexOf("c", 3));
        System.out.println(str1.indexOf("x"));
    }

}
