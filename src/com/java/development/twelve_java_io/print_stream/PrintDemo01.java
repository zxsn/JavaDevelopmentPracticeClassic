
/**  
* @Title: PrintDemo01.java
* @Package com.java.development.twelve_java_io.print_stream
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月27日
* @version V1.0  
*/

package com.java.development.twelve_java_io.print_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
* @ClassName: PrintDemo01
* @Description:使用PrintStream输出
* @author Administrator
* @date 2018年10月27日
*
*/

public class PrintDemo01 {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        PrintStream ps = null;
        //此时通过FileOutputStream实例化，意味着所有的输出是向文件之中打印
        ps = new PrintStream(new FileOutputStream(new File("d:" + File.separator + "test.txt")));
        ps.print("hello ");
        ps.println("world!!!");
        ps.print("1 + 1 = " + 2);
        ps.close();
    }

}
