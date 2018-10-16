
/**  
* @Title: Ex05.java
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
* @ClassName: Ex05
* @Description:编写正则表达式判断给定的是否是以一个合法的IP
* @author Administrator
* @date 2018年10月24日
*
*/

public class Ex05 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个IP：");
        String str = sc.nextLine();
        sc.close();
        //IP地址格式可表示为：XXX.XXX.XXX.XXX，XXX取值范围是0-255，
        //前三段加一个.重复了三次，在与最后一段合并及组成IP地址的完整格式。
        //“?:”非获取匹配,匹配冒号后的内容但不获取匹配结果,不进行存储供以后使用。 
        String regex = "((?:(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.){3}(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d))";
        Pattern p = Pattern.compile(regex);//实例化Pattern类
        Matcher m = p.matcher(str);//实例化Matcher类
        if (m.matches()) {//验证字符串是否合法
            System.out.println("IP地址是合法的！");
        } else {
            System.out.println("IP地址是不合法的！");
        }

    }

}
