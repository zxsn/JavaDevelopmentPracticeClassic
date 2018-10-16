
/**  
* @Title: RegexDemo07.java
* @Package com.java.development.eleven_class_library.regex
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月23日
* @version V1.0  
*/

package com.java.development.eleven_class_library.regex;

/**
* @ClassName: RegexDemo07
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月23日
*
*/

public class RegexDemo07 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        String info = "LXH:98|MLDN:90|LI:100";
        String s[] = info.split("|");//没有转义，拆分错误
        System.out.println("字符串的拆分：");
        for (int i = 0; i < s.length; i++) {
            System.out.print(i < s.length - 1 ? s[i] + "，" : s[i]);
        }

    }

}
