
/**  
* @Title: DateDemo05.java
* @Package com.java.development.eleven_class_library.date
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月19日
* @version V1.0  
*/

package com.java.development.eleven_class_library.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
* @ClassName: DateDemo05
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月19日
*
*/

public class DateDemo05 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        String strDate = "2018-10-19 16:20:03.365";//定义日期和时间的字符串
        //准备一个模板，从字符串中提取日期数字
        String pat1 = "yyyy-MM-dd HH:mm:ss.SSS";
        //准备第二个模板，将提取后的日期数字变为指定的格式
        String pat2 = "yyyy年MM月dd日  HH时mm分ss秒SSS毫秒";
        SimpleDateFormat sdf1 = new SimpleDateFormat(pat1);//实例化模板对象
        SimpleDateFormat sdf2 = new SimpleDateFormat(pat2);//实例化模板对象
        Date d = null;
        try {
            d = sdf1.parse(strDate);//将给定字符串中的日期提取出来
        } catch (ParseException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        System.out.println(sdf2.format(d));//将日期转化为新的格式
    }

}
