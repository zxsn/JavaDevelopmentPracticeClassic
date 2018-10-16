
/**  
* @Title: Ex07.java
* @Package com.java.development.eleven_class_library.exercises
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月24日
* @version V1.0  
*/

package com.java.development.eleven_class_library.exercises;

import java.util.Locale;
import java.util.ResourceBundle;

/**
* @ClassName: Ex07
* @Description:编写程序，实现国际化应用，从命令行输入国家的代号，
* 例如1表示中国，2表示美国，然后根据输入代号的不同调用不同的资源文件显示信息
* @author Administrator
* @date 2018年10月24日
*
*/

public class Ex07 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {//javac -encoding UTF-8 Ex07.java
        //java com.java.development.eleven_class_library.exercises.Ex07 1
        //在命令行执行时，要在src目录下执行命令且资源文件也在此处。
        Locale zhLoc = new Locale("zh", "CN");//表示中国地区
        Locale usLoc = new Locale("en", "US");//表示美国地区
        //找到各个国家对应的资源文件
        ResourceBundle zhrb = ResourceBundle.getBundle("Setting", zhLoc);
        ResourceBundle enrb = ResourceBundle.getBundle("Setting", usLoc);
        //System.out.println("从命令行输入国家的代号（代号只能是1或者2）：");
        if ("1".equals(args[0])) {
            System.out.println("中文设置：" + zhrb.getString("info"));
        } else if ("2".equals(args[0])) {
            System.out.println("美国设置：" + enrb.getString("info"));
        } else {
            System.out.println("输入格式错误，正确的格式为：java Ex07 n (n代表1或者2)");
        }
    }

}
