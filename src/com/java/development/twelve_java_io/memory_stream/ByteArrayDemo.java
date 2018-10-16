
/**  
* @Title: ByteArrayDemo.java
* @Package com.java.development.twelve_java_io.memory_stream
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月25日
* @version V1.0  
*/

package com.java.development.twelve_java_io.memory_stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
    * @ClassName: ByteArrayDemo
    * @Description:使用内存操作流完成一个大写字母转换成小写的程序
    * @author Administrator
    * @date 2018年10月25日
    *
    */

public class ByteArrayDemo {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        String str = "HELLOWORLD";//定义一个都是大写字母的字符串
        ByteArrayInputStream bis = null;//声明一个内存的输入流
        ByteArrayOutputStream bos = null;//声明一个内存的输出流
        bis = new ByteArrayInputStream(str.getBytes());//向内存中输出内容
        bos = new ByteArrayOutputStream();//准备从ByteArrayInputStream读取数据
        int temp = 0;
        while ((temp = bis.read()) != -1) {
            char c = (char) temp;//将读取的数字变为字符
            bos.write(Character.toLowerCase(c));//将字符变为小写
        }
        String newStr = bos.toString();//读取内容
        try {
            bis.close();//这个流可以不关闭
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(newStr);

    }

}
