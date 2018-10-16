
/**  
* @Title: RegexDemo02.java
* @Package com.java.development.eleven_class_library.regex
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月23日
* @version V1.0  
*/

package com.java.development.eleven_class_library.regex;

import java.util.regex.Pattern;

/**
* @ClassName: RegexDemo02
* @Description:使用正则表达式验证
* @author Administrator
* @date 2018年10月23日
*
*/

public class RegexDemo02 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        String str = "1234567890";
        String regex = "[0-9]+";//正则表达式
        if (Pattern.compile(regex).matcher(str).matches()) {
            System.out.println("是由数字组成！");
        } else {
            System.out.println("不是由数字组成！");
        }

    }

}
