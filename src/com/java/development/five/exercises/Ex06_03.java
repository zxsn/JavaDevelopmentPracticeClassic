/** 
 * projectName:Java开发实战经典 
 * fileName:Ex06_03.java 
 * packageName:com.java.development.five.exercises 
 * date:2018年9月19日下午9:09:56 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.exercises;

/**   
 * @title: Ex06_03.java 
 * @package com.java.development.five.exercises 
 * @description: TODO取出”Java 技术学习班 20070326” 中的第8个字符。
 * @author: zxsn
 * @date: 2018年9月19日 下午9:09:56 
 * @version: V1.0   
*/
public class Ex06_03 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月19日 下午9:09:56
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        String str = "Java 技术学习班 20070326";
        System.out.println(str);
        char c = str.charAt(8 - 1);
        System.out.println("这个字符串中第8个字符是：" + c);

    }

}
