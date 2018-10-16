
/**  
* @Title: NumberFormatDemo02.java
* @Package com.java.development.eleven_class_library.numberformat
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月19日
* @version V1.0  
*/

package com.java.development.eleven_class_library.numberformat;

import java.text.DecimalFormat;

class FormatDemo {
    public void format1(String pattern, double value) {
        DecimalFormat df = null;
        df = new DecimalFormat(pattern);//实例化对象
        String str = df.format(value);
        System.out.println("使用" + pattern + "格式化数字" + value + "：" + str);
    }
}

/**
* @ClassName: NumberFormatDemo02
* @Description:格式化数字
* @author Administrator
* @date 2018年10月19日
*
*/

public class NumberFormatDemo02 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        FormatDemo fd = new FormatDemo();
        fd.format1("###,###.###", 111222.34567);//当前位置不存在则不显示
        fd.format1("000,000.000", 11222.34567);//当前位置不存在则显示0
        fd.format1("###,###.###￥", 111222.34567);
        fd.format1("000,000.000￥", 11222.34567);
        fd.format1("##.###%", 0.345678);//使用百分位形式
        fd.format1("00.###%", 0.0345678);//使用百分位形式
        fd.format1("###.###\u2030", 0.345678);//使用千分位形式

    }

}
