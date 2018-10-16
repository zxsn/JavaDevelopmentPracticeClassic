
/**  
* @Title: RegexDemo08.java
* @Package com.java.development.eleven_class_library.regex
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月23日
* @version V1.0  
*/

package com.java.development.eleven_class_library.regex;

/**
* @ClassName: RegexDemo08
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月23日
*
*/

public class RegexDemo08 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        String info = "LXH:98|MLDN:90|LI:100";
        String s[] = info.split("\\|");//安照“|”拆分
        System.out.println("字符串的拆分：");
        for (int i = 0; i < s.length; i++) {
            String s2[] = s[i].split(":");//按照“:”拆分
            System.out.println("\t|-" + s2[0] + "\t" + s2[1]);
        }

    }

}
