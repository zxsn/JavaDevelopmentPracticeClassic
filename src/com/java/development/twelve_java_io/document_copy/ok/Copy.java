
/**  
* @Title: Copy.java
* @Package com.java.development.twelve_java_io.document_copy
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月25日
* @version V1.0  
*/

package com.java.development.twelve_java_io.document_copy.ok;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
* @ClassName: Copy
* @Description:实现文件复制功能
* @author Administrator
* @date 2018年10月25日
*
*/

public class Copy {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {//javac -encoding UTF-8 Copy.java
        //java com.java.development.twelve_java_io.document_copy.ok.Copy d:\test.txt d:\demo.txt
        if (args.length != 2) {//判断是否是两个参数
            System.out.println("输入的参数不正确。");
            System.out.println("例：java Copy 源文件路径 目标文件路径");
            System.exit(1);//系统退出
        }
        File f1 = new File(args[0]);//源文件的File对象
        File f2 = new File(args[1]);//目标文件的File对象
        if (!f1.exists()) {
            System.out.println("源文件不存在！");
            System.exit(1);//系统退出
        }
        InputStream input = null;//准备好输入流对象，读取源文件
        OutputStream out = null;//准备好输出流对象，写入目标文件
        try {
            input = new FileInputStream(f1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            out = new FileOutputStream(f2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (input != null && out != null) {//判断输入或输出是否准备好
            int temp = 0;
            byte data[] = new byte[1024];//每次读取1024字节
            try {
                while ((temp = input.read(data)) != -1) {//开始复制
                    out.write(data, 0, temp);//边读边写
                }
                System.out.println("复制完成！");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("复制失败！");
            }
            try {
                input.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
