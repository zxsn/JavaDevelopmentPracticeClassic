
/**  
* @Title: NumberFormatDemo01.java
* @Package com.java.development.eleven_class_library.numberformat
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月19日
* @version V1.0  
*/

package com.java.development.eleven_class_library.numberformat;

import java.text.NumberFormat;

/**
* @ClassName: NumberFormatDemo01
* @Description:使用当前语言环境格式化数字
* @author Administrator
* @date 2018年10月19日
*
*/

public class NumberFormatDemo01 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        NumberFormat nf = null;
        nf = NumberFormat.getInstance();//得到默认的数字格式显示
        System.out.println("格式化之后的数字：" + nf.format(100000000));
        System.out.println("格式化之后的数字：" + nf.format(1000.345));

    }

}
