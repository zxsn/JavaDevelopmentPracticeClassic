
/**  
* @Title: ScannerDemo01.java
* @Package com.java.development.twelve_java_io.scanner
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月28日
* @version V1.0  
*/

package com.java.development.twelve_java_io.scanner;

import java.util.Scanner;

/**
* @ClassName: ScannerDemo01
* @Description:输入数据
* @author Administrator
* @date 2018年10月28日
*
*/

public class ScannerDemo01 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//从键盘接收数据
        System.out.print("输入数据：");
        String str = scan.next();//会将空格当作一个分隔符
        System.out.println("输入的数据：" + str);
        scan.close();
    }

}
