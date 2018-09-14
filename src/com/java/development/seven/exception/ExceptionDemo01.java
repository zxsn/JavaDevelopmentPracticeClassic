/** 
 * projectName:Java开发实战经典 
 * fileName:ExceptionDemo01.java 
 * packageName:com.java.development.seven.exception 
 * date:2018年9月28日下午3:56:35 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.seven.exception;

/**   
 * @title: ExceptionDemo01.java 
 * @package com.java.development.seven.exception 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月28日 下午3:56:35 
 * @version: V1.0   
*/
public class ExceptionDemo01 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月28日 下午3:56:36
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        System.out.println("================计算开始================");
        int i = 10;
        int j = 0;
        int temp = i / j;
        System.out.println("两数相除的结果：" + temp);
        System.out.println("================计算结束================");

    }

}
