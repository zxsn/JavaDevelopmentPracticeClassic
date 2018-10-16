
/**  
* @Title: DateDemo03.java
* @Package com.java.development.eleven_class_library.date
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月19日
* @version V1.0  
*/

package com.java.development.eleven_class_library.date;

import java.text.DateFormat;
import java.util.Date;

/**
    * @ClassName: DateDemo03
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月19日
    *
    */

public class DateDemo03 {

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
        df1 = DateFormat.getDateInstance();//取得日期
        df2 = DateFormat.getDateTimeInstance();//取得日期时间
        System.out.println("DATE:" + df1.format(new Date()));
        System.out.println("DATETIME:" + df2.format(new Date()));

    }

}
