
/**  
* @Title: InputStreamReaderDemo.java
* @Package com.java.development.twelve_java_io.transform_stream
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月25日
* @version V1.0  
*/

package com.java.development.twelve_java_io.transform_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
    * @ClassName: InputStreamReaderDemo
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月25日
    *
    */

public class InputStreamReaderDemo {

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
        Reader reader = null;
        reader = new InputStreamReader(new FileInputStream(f));//将字节流变为字符流
        char c[] = new char[1024];
        int len = reader.read(c);
        reader.close();
        System.out.println("内容为：" + new String(c, 0, len));
    }

}
