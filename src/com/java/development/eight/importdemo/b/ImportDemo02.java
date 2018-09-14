/** 
 * projectName:Java开发实战经典 
 * fileName:ImportDemo02.java 
 * packageName:com.java.development.eight.importdemo.b 
 * date:2018年9月29日上午10:33:43 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.eight.importdemo.b;

/**   
 * @title: ImportDemo02.java 
 * @package com.java.development.eight.importdemo.b 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月29日 上午10:33:43 
 * @version: V1.0   
*/
public class ImportDemo02 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月29日 上午10:33:43
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        com.java.development.eight.importdemo.c.Demo d = new com.java.development.eight.importdemo.c.Demo();
        System.out.println(d.getInfo());
    }

}
