/** 
 * projectName:Java开发实战经典 
 * fileName:StringDemo10.java 
 * packageName:com.java.development.five.string 
 * date:2018年9月13日下午7:05:15 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.string;

/**   
 * @title: StringDemo10.java 
 * @package com.java.development.five.string 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月13日 下午7:05:15 
 * @version: V1.0   
*/
public class StringDemo10 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月13日 下午7:05:15
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        String str1 = "JiaLiXin";
        for (int i = 0; i < 100; i++) {
            str1 += i;

        }
        System.out.println(str1);
    }

}
