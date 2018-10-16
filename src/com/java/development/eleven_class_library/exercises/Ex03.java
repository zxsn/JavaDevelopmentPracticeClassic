
/**  
* @Title: Ex03.java
* @Package com.java.development.eleven_class_library.exercises
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月24日
* @version V1.0  
*/

package com.java.development.eleven_class_library.exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* @ClassName: Ex03
* @Description: 输入一个E-mail地址，然后使用正则表达式验证该E-mail地址是否正确
* @author Administrator
* @date 2018年10月24日
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
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入E-mail地址：");
        String str = sc.nextLine();
        sc.close();
        String regex = "(\\w+)([-+.]\\w+)*@(\\w+)([-.]\\w+)*\\.\\w+([-.]\\w+)*";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        if (m.matches()) {
            System.out.println("邮箱格式合法！");
        } else {
            System.out.println("邮箱格式不合法！");
        }

    }

}
