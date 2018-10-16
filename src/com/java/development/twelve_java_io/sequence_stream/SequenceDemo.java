
/**  
* @Title: SequenceDemo.java
* @Package com.java.development.twelve_java_io.sequence_stream
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月28日
* @version V1.0  
*/

package com.java.development.twelve_java_io.sequence_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;

/**
    * @ClassName: SequenceDemo
    * @Description: 合并两个文件
    * @author Administrator
    * @date 2018年10月28日
    *
    */

public class SequenceDemo {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        InputStream is1 = null;//输入流1
        InputStream is2 = null;//输入流2
        OutputStream os = null;//输出流
        SequenceInputStream sis = null;//合并流
        is1 = new FileInputStream("d:" + File.separator + "demo.txt");
        is2 = new FileInputStream("d:" + File.separator + "test.txt");
        os = new FileOutputStream("d:" + File.separator + "ab.txt");
        sis = new SequenceInputStream(is1, is2);//实例化合并流
        int temp = 0;
        while ((temp = sis.read()) != -1) {//循环输出
            os.write(temp);//保存内容
        }
        //关闭顺序，遵循出栈规则
        sis.close();
        is1.close();
        is2.close();
        os.close();
    }

}
