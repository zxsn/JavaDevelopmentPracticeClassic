
/**  
* @Title: RegexDemo05.java
* @Package com.java.development.eleven_class_library.regex
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月23日
* @version V1.0  
*/

package com.java.development.eleven_class_library.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
    * @ClassName: RegexDemo05
    * @Description:将全部数字替换成“_”
    * @author Administrator
    * @date 2018年10月23日
    *
    */

public class RegexDemo05 {

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
        Matcher m = p.matcher(str);//实例化Matcher类
        String newString = m.replaceAll("_");
        System.out.println(newString);
    }

}
