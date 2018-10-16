
/**  
* @Title: Ex06.java
* @Package com.java.development.eleven_class_library.exercises
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月24日
* @version V1.0  
*/

package com.java.development.eleven_class_library.exercises;

/**
* @ClassName: Ex06
* @Description:给定下面的HTNML代码：
* <font face="Arial,Serif" size="+2" color="red">
* 要求对内容进行拆分，拆分之后的结果是：
* face Arial,Serif
* size +2
* color red
* @author Administrator
* @date 2018年10月24日
*
*/

public class Ex06 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        String str = "<font face=\"Arial,Serif\" size=\"+2\" color=\"red\">";
        String s[] = str.split(" ");
        System.out.println("字符串拆分：");
        for (int i = 1; i < s.length; i++) {
            String temp[] = s[i].split("=");
            System.out.println(temp[0] + " " + temp[1].replace("\"", "").replace(">", ""));
        }

    }

}
