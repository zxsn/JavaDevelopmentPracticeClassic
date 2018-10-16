
/**  
* @Title: SystemDemo07.java
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
    * @ClassName: SystemDemo07
    * @Description:为用户保存错误信息
    * @author Administrator
    * @date 2018年10月27日
    *
    */

public class SystemDemo07 {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        String str = "hello";
        try {
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            try {
                System.setOut(new PrintStream(
                    new FileOutputStream(new File("d:" + File.separator + "err.log"))));//输出重定向
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            System.out.println(e);//输出错误，保存文件之中
        }

    }

}
