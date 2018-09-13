/** 
 * projectName:Java开发实战经典 
 * fileName:StringAPIDemo03.java 
 * packageName:com.java.development.five.string.api 
 * date:2018年9月13日下午7:21:01 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.string.api;

/**   
 * @title: StringAPIDemo03.java 
 * @package com.java.development.five.string.api 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月13日 下午7:21:01 
 * @version: V1.0   
*/
public class StringAPIDemo03 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月13日 下午7:21:01
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        String str1 = "hello";
        byte b[] = str1.getBytes(); //将字符串变成byte数组
        System.out.println(new String(b));//将全部byte数组变成字符串
        System.out.println(new String(b, 1, 3)); //将部分byte数组变为字符串
    }

}
