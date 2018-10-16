
/**  
* @Title: ReaderDemo01.java
* @Package com.java.development.twelve_java_io.writer_reader
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月25日
* @version V1.0  
*/

package com.java.development.twelve_java_io.writer_reader;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

/**
    * @ClassName: ReaderDemo01
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月25日
    *
    */

public class ReaderDemo01 {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        //第1步，使用File类找到一个文件
        File f = new File("d:" + File.separator + "test.txt");
        //第2步，通过子类实例化父类对象
        Reader reader = null;
        reader = new FileReader(f);
        //第3步，进行读操作
        char c[] = new char[1024];
        int len = reader.read(c);//将所有内容读到此数组中
        //第4步，关闭流操作
        reader.close();
        System.out.println("内容为：" + new String(c, 0, len));

    }

}
