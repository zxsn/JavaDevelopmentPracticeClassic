/** 
 * projectName:Java开发实战经典 
 * fileName:ImportJarDemo.java 
 * packageName:com.java.development.eight.jar 
 * date:2018年9月29日上午10:54:50 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.eight.jar;

/**   
 * @title: ImportJarDemo.java 
 * @package com.java.development.eight.jar 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月29日 上午10:54:50 
 * @version: V1.0   
*/
public class ImportJarDemo {//PowerShell无法测试，只能在命令行测试

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月29日 上午10:54:50
     *@param args
     *@throws 
     */
    public static void main(String[] args) {//set classpath=.;D:\Java\eclipse\追鑫少年\Java开发实战经典\src\com\java\development\eight\jar\my.jar
        Hello hello = new Hello();//javac -d . ImportJarDemo.java
        System.out.println(hello.getInfo());//java com.java.development.eight.jar.ImportJarDemo

    }

}
