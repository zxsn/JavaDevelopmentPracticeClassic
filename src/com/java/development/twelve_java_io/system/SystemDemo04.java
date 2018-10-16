
/**  
* @Title: SystemDemo04.java
* @Package com.java.development.twelve_java_io.system
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月27日
* @version V1.0  
*/

package com.java.development.twelve_java_io.system;

import java.io.InputStream;

/**
* @ClassName: SystemDemo04
* @Description: 从键盘上读取数据
* @author Administrator
* @date 2018年10月27日
*
*/

public class SystemDemo04 {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        InputStream input = System.in;//从键盘接收数据
        byte b[] = new byte[1024];//开辟空间，接收数据
        System.out.print("请输入内容：");
        int len = input.read(b);//接收数据
        System.out.println("输入的内容为：" + new String(b, 0, len));
        input.close();//此流也可以不用关闭，因为没有警告
    }

}
