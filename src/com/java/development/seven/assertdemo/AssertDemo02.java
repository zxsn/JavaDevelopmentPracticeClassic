/** 
 * projectName:Java开发实战经典 
 * fileName:AssertDemo01.java 
 * packageName:com.java.development.seven.assertdemo 
 * date:2018年9月28日下午5:13:29 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.seven.assertdemo;

/**   
 * @title: AssertDemo01.java 
 * @package com.java.development.seven.assertdemo 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月28日 下午5:13:29 
 * @version: V1.0   
*/
public class AssertDemo02 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月28日 下午5:13:29
     *@param args
     *@throws 
     */
    public static void main(String[] args) { //javac -encoding UTF-8 AssertDemo02.java           
        int x[] = { 1, 2, 3 }; //java -ea com.java.development.seven.assertdemo.AssertDemo02
        assert x.length == 0 : "数组长度不为0";//Exception in thread "main" java.lang.AssertionError: 数组长度不为0
        //at com.java.development.seven.assertdemo.AssertDemo02.main(AssertDemo02.java:30)

    }

}
