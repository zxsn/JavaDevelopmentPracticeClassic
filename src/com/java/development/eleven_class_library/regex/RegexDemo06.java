
/**  
* @Title: RegexDemo06.java
* @Package com.java.development.eleven_class_library.regex
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月23日
* @version V1.0  
*/

package com.java.development.eleven_class_library.regex;

/**
* @ClassName: RegexDemo06
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月23日
*
*/

public class RegexDemo06 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        String str = "A1B22C333D4444E55555F".replaceAll("\\d+", "_");
        boolean temp = "2018-10-23".matches("\\d{4}-(1?[0-2]|0?[1-9])-(0?[1-9]|(1|2)[0-9]|30|31)");
        String s[] = "A1B22C333D4444E55555F".split("\\d+");
        System.out.println("字符串替换操作：" + str);
        System.out.println("字符串验证操作：" + temp);
        System.out.print("字符串拆分：");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + "\t");
        }
    }

}
