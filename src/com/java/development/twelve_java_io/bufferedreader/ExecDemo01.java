
/**  
* @Title: ExecDemo01.java
* @Package com.java.development.twelve_java_io.bufferedreader
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月27日
* @version V1.0  
*/

package com.java.development.twelve_java_io.bufferedreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
* @ClassName: ExecDemo01
* @Description: 输入两个数字，并让两个数字相加
* @author Administrator
* @date 2018年10月27日
*
*/

public class ExecDemo01 {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        int i = 0;
        int j = 0;
        BufferedReader buf = null;
        buf = new BufferedReader(new InputStreamReader(System.in));//接收键盘的输入数据
        String str = null;//准备接收数据
        System.out.print("请输入第一个数子：");
        str = buf.readLine();
        i = Integer.parseInt(str);//将字符串变为int型
        System.out.print("请输入第二个数字：");
        str = buf.readLine();
        j = Integer.parseInt(str);
        System.out.println(i + " + " + j + " = " + (i + j));
    }

}
