
/**  
* @Title: SystemDemo08.java
* @Package com.java.development.twelve_java_io.system
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月27日
* @version V1.0  
*/

package com.java.development.twelve_java_io.system;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
* @ClassName: SystemDemo08
* @Description:为System.err输出重定向
* @author Administrator
* @date 2018年10月27日
*
*/

public class SystemDemo08 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        ByteArrayOutputStream bos = null;//定义内存输出流
        bos = new ByteArrayOutputStream();//实例化内存输出流
        System.setErr(new PrintStream(bos));//System.err输出重定向
        System.err.print("www.mldnjava.cn");//错误输出时，不再向屏幕上输出
        System.err.println("，李兴华");//而是向内存的位置输出
        System.out.println(bos);//打印错误信息
    }

}
