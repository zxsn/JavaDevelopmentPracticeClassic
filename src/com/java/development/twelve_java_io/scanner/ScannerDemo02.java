
/**  
* @Title: ScannerDemo02.java
* @Package com.java.development.twelve_java_io.scanner
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月28日
* @version V1.0  
*/

package com.java.development.twelve_java_io.scanner;

import java.util.Scanner;

/**
    * @ClassName: ScannerDemo02
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月28日
    *
    */

public class ScannerDemo02 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");//修改输入数据的分隔符
        System.out.print("输入数据：");
        String str = scan.next();
        System.out.println("输入的数据：" + str);
        scan.close();

    }

}
