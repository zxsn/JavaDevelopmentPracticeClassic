
/**  
* @Title: DateDemo04.java
* @Package com.java.development.eleven_class_library.date
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月19日
* @version V1.0  
*/

package com.java.development.eleven_class_library.date;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
    * @ClassName: DateDemo04
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月19日
    *
    */

public class DateDemo04 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        DateFormat df1 = null;//声明DateFormat对象
        DateFormat df2 = null;
        df1 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD, new Locale("zh", "CN"));//取得日期，并设置日期显示风格
        df2 = DateFormat.getDateTimeInstance(DateFormat.YEAR_FIELD, DateFormat.ERA_FIELD,
            new Locale("zh", "CN"));//取得日期时间
        System.out.println("DATE:" + df1.format(new Date()));
        System.out.println("DATETIME:" + df2.format(new Date()));

    }

}
