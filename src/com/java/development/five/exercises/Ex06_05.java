/** 
 * projectName:Java开发实战经典 
 * fileName:Ex06_05.java 
 * packageName:com.java.development.five.exercises 
 * date:2018年9月20日上午9:48:18 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.exercises;

/**   
 * @title: Ex06_05.java 
 * @package com.java.development.five.exercises 
 * @description: TODO清除”Java 技术学习班 20070326 MLDN 老师”中所有的空格。
 * @author: zxsn
 * @date: 2018年9月20日 上午9:48:18 
 * @version: V1.0   
*/
public class Ex06_05 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月20日 上午9:48:18
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        String str = "　Java 技术学习班 20070326 MLDN 老师　";
        //方法一：
        String newStr = str.replace(" ", "").replace("　", "");//只能去掉半角空格后再去掉全角空格
        System.out.println(newStr);
        //方法二：
        String str1 = str.replaceAll("[\\s\\p{Zs}]+", "");
        System.out.println(str1);
    }

}
