
/**  
* @Title: RandomAccessFileDemo02.java
* @Package com.java.development.twelve_java_io.randomaccessfile
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月25日
* @version V1.0  
*/

package com.java.development.twelve_java_io.randomaccessfile;

import java.io.File;
import java.io.RandomAccessFile;

/**
* @ClassName: RandomAccessFileDemo02
* @Description:使用RandomAccessFile类读取数据
* @author Administrator
* @date 2018年10月25日
*
*/

public class RandomAccessFileDemo02 {

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
        RandomAccessFile rdf = null;
        rdf = new RandomAccessFile(f, "r");//只读方式读取文件
        String name = null;
        int age = 0;
        byte b[] = new byte[8];//准备空间读取姓名
        rdf.skipBytes(12);//跳过12个字节读取
        for (int i = 0; i < b.length; i++) {
            b[i] = rdf.readByte();//循环读取前8个内容
        }
        name = new String(b);//将读取出来的byte数组变为ZString
        age = rdf.readInt();//读取数字
        System.out.println("第二个人的信息 --> 姓名：" + name + "；年龄：" + age);
        rdf.seek(0);//指针回到文件的开头
        for (int i = 0; i < b.length; i++) {
            b[i] = rdf.readByte();//循环读取前8个内容
        }
        name = new String(b);//将读取出来的byte数组变为ZString
        age = rdf.readInt();//读取数字
        System.out.println("第一个人的信息 --> 姓名：" + name + "；年龄：" + age);
        rdf.skipBytes(12);//读完指针在第二个人信息的开头，再跳12字节到第三个人信息的开头
        for (int i = 0; i < b.length; i++) {
            b[i] = rdf.readByte();//循环读取前8个内容
        }
        name = new String(b);//将读取出来的byte数组变为ZString
        age = rdf.readInt();//读取数字
        System.out.println("第三个人的信息 --> 姓名：" + name + "；年龄：" + age);

        rdf.close();

    }

}
