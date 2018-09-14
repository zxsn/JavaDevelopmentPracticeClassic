/** 
 * projectName:Java开发实战经典 
 * fileName:CodeDemo01.java 
 * packageName:com.java.development.five.codeblock 
 * date:2018年9月17日上午10:05:10 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.codeblock;

/**   
 * @title: CodeDemo01.java 
 * @package com.java.development.five.codeblock 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月17日 上午10:05:10 
 * @version: V1.0   
*/
public class CodeDemo01 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 上午10:05:10
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        {
            int x = 30;
            System.out.println("普通代码块-->x = " + x);
        }
        int x = 100;
        System.out.println("普通代码块之外-->x = " + x);

    }

}
