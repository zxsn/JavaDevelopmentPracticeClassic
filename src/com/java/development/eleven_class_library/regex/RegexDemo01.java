
/**  
* @Title: RegexDemo01.java
* @Package com.java.development.eleven_class_library.regex
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月22日
* @version V1.0  
*/

package com.java.development.eleven_class_library.regex;

/**
* @ClassName: RegexDemo01
* @Description:不使用正则表达式验证
* @author Administrator
* @date 2018年10月22日
*
*/

public class RegexDemo01 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        String str = "1234567890";
        boolean flag = false;
        char c[] = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] > '0' || c[i] < '9') {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("是由数字组成！");
        } else
            System.out.println("不是由数字组成！");
    }

}
