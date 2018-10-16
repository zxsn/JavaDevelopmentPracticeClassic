
/**  
* @Title: SystemDemo09.java
* @Package com.java.development.twelve_java_io.system
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月27日
* @version V1.0  
*/

package com.java.development.twelve_java_io.system;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
* @ClassName: SystemDemo09
* @Description: 设置System.in输入重定向
* @author Administrator
* @date 2018年10月27日
*
*/

public class SystemDemo09 {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream(new File("d:" + File.separator + "demo.txt")));//设置输入重定向
        InputStream input = System.in;//从文件中接收数据
        byte b[] = new byte[1024];
        int len = input.read(b);//接收数据
        System.out.println("输入的内容为：" + new String(b, 0, len));
        input.close();
    }

}
