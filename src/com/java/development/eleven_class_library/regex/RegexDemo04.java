
/**  
* @Title: RegexDemo04.java
* @Package com.java.development.eleven_class_library.regex
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月23日
* @version V1.0  
*/

package com.java.development.eleven_class_library.regex;

import java.util.regex.Pattern;

/**
* @ClassName: RegexDemo04
* @Description:按照字符串的数字将字符串拆分
* @author Administrator
* @date 2018年10月23日
*
*/

public class RegexDemo04 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        String str = "A1B22C333D4444E55555F";
        String pat = "\\d+";//数字出现一次或多次（定义验证规则）
        Pattern p = Pattern.compile(pat);//实例化Pattern类
        String s[] = p.split(str);//进行字符串拆分
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + "\t");
        }
    }

}
