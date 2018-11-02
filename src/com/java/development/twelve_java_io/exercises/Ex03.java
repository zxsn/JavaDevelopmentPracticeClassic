
/**  
* @Title: Ex03.java
* @Package com.java.development.twelve_java_io.exercises
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月31日
* @version V1.0  
*/

package com.java.development.twelve_java_io.exercises;

import java.util.Scanner;

/**
* @ClassName: Ex03
* @Description: 从键盘传入多个字符串到程序中，并将它们按逆序输出在屏幕上。
* 
* @author Administrator
* @date 2018年10月31日
*
*/

public class Ex03 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        String str[] = new String[6];
        int i = 0;
        Scanner input = null;
        input = new Scanner(System.in);
        while (true) {
            System.out.print("请输入字符串：");
            str[i++] = input.nextLine();
            if ("".equals(str[i - 1])) {
                break;
            }

            if (i > (str.length-1)) {
                break;
            }
        }
        for (i = str.length - 1; i >= 0; i--) {
            if (str[i] != null && !"".equals(str[i])) {
                System.out.print(str[i] + "\t");
            }
        }
        input.close();

    }

}
