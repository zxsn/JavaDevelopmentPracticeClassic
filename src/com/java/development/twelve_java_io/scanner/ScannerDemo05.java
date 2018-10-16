
/**  
* @Title: ScannerDemo05.java
* @Package com.java.development.twelve_java_io.scanner
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月28日
* @version V1.0  
*/

package com.java.development.twelve_java_io.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
    * @ClassName: ScannerDemo05
    * @Description: 读取文件test.txt文件
    * @author Administrator
    * @date 2018年10月28日
    *
    */

public class ScannerDemo05 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        File f = new File("d:" + File.separator + "test.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuffer str = new StringBuffer();//用于接收数据
        while (scan.hasNext()) {//判断是否还有内容
            str.append(scan.next()).append("\n");//取出内容
        }
        System.out.println(str);
    }

}
