
/**  
* @Title: ScannerDemo04.java
* @Package com.java.development.twelve_java_io.scanner
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月28日
* @version V1.0  
*/

package com.java.development.twelve_java_io.scanner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
* @ClassName: ScannerDemo04
* @Description:得到日期
* @author Administrator
* @date 2018年10月28日
*
*/

public class ScannerDemo04 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入日期（yyyy-MM-dd）：");
        String str = null;
        Date date = null;
        String regex = "^\\d{4}-(1?[0-2]|0?[1-9])-(0?[1-9]|(1|2)[0-9]|30|31)$";
        if (scan.hasNext(regex)) {
            str = scan.next(regex);
            try {
                date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("输入的日期格式错误！");
        }
        System.out.println(date);
        scan.close();
    }

}
