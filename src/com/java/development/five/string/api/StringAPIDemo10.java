/** 
 * projectName:Java开发实战经典 
 * fileName:StringAPIDemo10.java 
 * packageName:com.java.development.five.string.api 
 * date:2018年9月14日上午9:54:25 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.string.api;

/**   
 * @title: StringAPIDemo10.java 
 * @package com.java.development.five.string.api 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月14日 上午9:54:25 
 * @version: V1.0   
*/
public class StringAPIDemo10 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月14日 上午9:54:25
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        String str1 = "**HELLO";
        String str2 = "HELLO**";
        if (str1.startsWith("**")) {
            System.out.println("(**HELLO)以 ** 开头");
        }
        if (str2.endsWith("**")) {
            System.out.println("(HELLO**)以 ** 结尾");
        }

    }

}
