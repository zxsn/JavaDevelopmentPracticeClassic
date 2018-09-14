/** 
 * projectName:Java开发实战经典 
 * fileName:Ex06_06.java 
 * packageName:com.java.development.five.exercises 
 * date:2018年9月20日下午3:12:46 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.exercises;

/**   
 * @title: Ex06_06.java 
 * @package com.java.development.five.exercises 
 * @description: TODO从任意给定的身份证号码中提取此人的出生日期。
 * @author: zxsn
 * @date: 2018年9月20日 下午3:12:46 
 * @version: V1.0   
*/
public class Ex06_06 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月20日 下午3:12:46
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        String str = "210203200703264001";
        String newStr = str.substring(6, 14);
        System.out.println("出生日期为：" + newStr);

    }

}
