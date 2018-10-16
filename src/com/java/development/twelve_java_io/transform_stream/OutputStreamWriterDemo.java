
/**  
* @Title: OutputStreamWriterDemo.java
* @Package com.java.development.twelve_java_io.transform_stream
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月25日
* @version V1.0  
*/

package com.java.development.twelve_java_io.transform_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
    * @ClassName: OutputStreamWriterDemo
    * @Description:将字节输出流变为字符输出流
    * @author Administrator
    * @date 2018年10月25日
    *
    */

public class OutputStreamWriterDemo {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        File f = new File("d:" + File.separator + "test.txt");
        Writer out = null;
        out = new OutputStreamWriter(new FileOutputStream(f));//字节流变为字符流
        out.write("Hello World");//使用字符流输出
        out.close();

    }

}
