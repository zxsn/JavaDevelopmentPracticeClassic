
/**  
* @Title: SystemDemo06.java
* @Package com.java.development.twelve_java_io.system
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月27日
* @version V1.0  
*/

package com.java.development.twelve_java_io.system;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
    * @ClassName: SystemDemo06
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月27日
    *
    */

public class SystemDemo06 {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        System.setOut(
            new PrintStream(new FileOutputStream(new File("d" + File.separator + "test.txt"))));//输出重定向
        System.out.print("www.mldnjava.cn");//输出时不在向屏幕上输出
        System.out.println("，李兴华");//而是向指定的重定向位置输出
    }

}
