
/**  
* @Title: BufferReaderDemo01.java
* @Package com.java.development.twelve_java_io.bufferedreader
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月27日
* @version V1.0  
*/

package com.java.development.twelve_java_io.bufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* @ClassName: BufferReaderDemo01
* @Description:从键盘输入数据
* @author Administrator
* @date 2018年10月27日
*
*/

public class BufferReaderDemo01 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        BufferedReader bufr = null;//声明BufferedReader对象
        bufr = new BufferedReader(new InputStreamReader(System.in));//实例化BudfferedReader
        String str = null;
        System.out.print("请输入内容：");
        try {
            str = bufr.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("输入的内容为：" + str);
    }

}
