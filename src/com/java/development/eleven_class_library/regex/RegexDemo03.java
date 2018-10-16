
/**  
* @Title: RegexDem03.java
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
* @ClassName: RegexDem03
* @Description:验证一个字符串是否是一个合法的日期格式
* @author Administrator
* @date 2018年10月23日
*
*/

public class RegexDemo03 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        String str1 = "2018-10-23";
        String str2 = "2018-14-5";
        String regex = "\\d{4}-(1?[0-2]|0?[1-9])-(0?[1-9]|(1|2)[0-9]|30|31)";//没有考虑闰年和2月
        Pattern p = Pattern.compile(regex);
        Matcher m1 = p.matcher(str1);
        Matcher m2 = p.matcher(str2);
        if (m1.matches()) {
            System.out.println(str1 + "\t日期格式合法！");
        } else
            System.out.println(str2 + "\t日期格式不合法！");

        if (m2.matches()) {
            System.out.println(str1 + "\t日期格式合法！");
        } else
            System.out.println(str2 + "\t日期格式不合法！");

    }

}
