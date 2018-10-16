
/**  
* @Title: ReaderDemo02.java
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
    * @ClassName: ReaderDemo02
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月25日
    *
    */

public class ReaderDemo02 {

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
        int len = 0;//用于记录读取的数据个数
        char c[] = new char[1024];
        int temp = 0;
        while ((temp = reader.read()) != -1) {
            //将每次的读取内容给temp变量，如果temp的值不是-1，则表示文件没有读完
            c[len++] = (char) temp;
        }
        //第4步，关闭流操作
        reader.close();
        System.out.println("内容为：" + new String(c, 0, len));
    }

}
