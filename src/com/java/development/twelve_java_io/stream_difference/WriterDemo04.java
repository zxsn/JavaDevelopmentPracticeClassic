
/**  
* @Title: WriterDemo04.java
* @Package com.java.development.twelve_java_io.stream_difference
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月25日
* @version V1.0  
*/

package com.java.development.twelve_java_io.stream_difference;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

/**
    * @ClassName: WriterDemo04
    * @Description: 强制性清空缓存区
    * @author Administrator
    * @date 2018年10月25日
    *
    */

public class WriterDemo04 {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        //第1步，使用File类找到一个文件
        File f = new File("d:" + File.separator + "test.txt");
        //第2步，通过子类实例化父类对象
        Writer out = null;
        out = new FileWriter(f);
        //第3步，进行写操作
        String str = "Hello World!!!";
        out.write(str);
        out.flush();//强制性清空缓存区中的内容
        //第4步，关闭流操作
        //out.close();//此时没有关闭

    }

}
