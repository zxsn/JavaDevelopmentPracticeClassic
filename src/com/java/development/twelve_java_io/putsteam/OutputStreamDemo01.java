
/**  
* @Title: OutputStreamDemo01.java
* @Package com.java.development.twelve_java_io.outputsteam
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月25日
* @version V1.0  
*/

package com.java.development.twelve_java_io.putsteam;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
* @ClassName: OutputStreamDemo01
* @Description: 向文件中写入字符串
* @author Administrator
* @date 2018年10月25日
*
*/

public class OutputStreamDemo01 {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        //第1步：使用File类找到一个文件
        File f = new File("d:" + File.separator + "test.txt");//声明File对象
        //第2步，通过子类实例化父类对象
        OutputStream out = null;//准备好一个输出的对象
        out = new FileOutputStream(f);//通过对象多态性，进行实例化
        //第3步，进行写操作
        String str = "Hello World!!!";//准备一个字符串
        byte b[] = str.getBytes();//只能输出byte数组，所以将字符串变为byte数组
        out.write(b);
        //第4步，关闭输入流
        out.close();

    }

}
