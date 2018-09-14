/** 
 * projectName:Java开发实战经典 
 * fileName:Ex06_02.java 
 * packageName:com.java.development.five.exercises 
 * date:2018年9月19日下午7:06:50 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.exercises;

/**   
 * @title: Ex06_02.java 
 * @package com.java.development.five.exercises 
 * @description: TODO将“MLDN JAVA”字符串中的“JAVA”替换为“J2EE”。
 * @author: zxsn
 * @date: 2018年9月19日 下午7:06:50 
 * @version: V1.0   
*/
public class Ex06_02 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月19日 下午7:06:50
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        String str = "MLDN JAVA";
        System.out.println("原字符串为：" + str);
        String newStr = str.replace("JAVA", "J2EE");
        System.out.println("替换后的字符串为：" + newStr);

    }

}
