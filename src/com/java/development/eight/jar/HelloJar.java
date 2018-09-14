/** 
 * projectName:Java开发实战经典 
 * fileName:Hello.java 
 * packageName:com.java.development.eight.jar 
 * date:2018年9月29日上午10:46:57 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.eight.jar;

/**   
 * @title: Hello.java 
 * @package com.java.development.eight.jar 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月29日 上午10:46:57 
 * @version: V1.0   
*/
public class HelloJar {//javac -d . HelloJar.java	编译
    public String getInfo() {//jar -cvf my.jar com	打包
        return "Hello World!!!";
    }
}
