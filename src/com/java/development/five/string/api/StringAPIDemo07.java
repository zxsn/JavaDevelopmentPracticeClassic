/** 
 * projectName:Java开发实战经典 
 * fileName:StringAPIDemo07.java 
 * packageName:com.java.development.five.string.api 
 * date:2018年9月13日下午7:45:24 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.string.api;

/**   
 * @title: StringAPIDemo07.java 
 * @package com.java.development.five.string.api 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月13日 下午7:45:24 
 * @version: V1.0   
*/
public class StringAPIDemo07 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月13日 下午7:45:24
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        String str1 = "hello world";
        System.out.println(str1.substring(6)); //从第7个位置开始截取
        System.out.println(str1.subSequence(0, 5)); //截取0~5个位置的内容

    }

}
