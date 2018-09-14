/** 
 * projectName:Java开发实战经典 
 * fileName:StringAPIDemo12.java 
 * packageName:com.java.development.five.string.api 
 * date:2018年9月14日上午10:00:43 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.string.api;

/**   
 * @title: StringAPIDemo12.java 
 * @package com.java.development.five.string.api 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月14日 上午10:00:43 
 * @version: V1.0   
*/
public class StringAPIDemo12 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月14日 上午10:00:43
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        String str = "hello";
        String newStr = str.replace("l", "x");
        System.out.println("替换之后的结果是：" + newStr);

    }

}
