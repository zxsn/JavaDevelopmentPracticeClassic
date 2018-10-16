
/**  
* @Title: SystemDemo01.java
* @Package com.java.development.twelve_java_io.system
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月27日
* @version V1.0  
*/

package com.java.development.twelve_java_io.system;

import java.io.IOException;
import java.io.OutputStream;

/**
    * @ClassName: SystemDemo01
    * @Description: 使用OutputStream向屏幕上输出
    * @author Administrator
    * @date 2018年10月27日
    *
    */

public class SystemDemo01 {

    /**
        * @Title: main
        * @Description:使用OutputStream向屏幕上输出
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        OutputStream out = System.out;
        try {
            out.write("hello world!!!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
