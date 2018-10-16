
/**  
* @Title: DataDemo02.java
* @Package com.java.development.eleven_class_library.data
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月19日
* @version V1.0  
*/

package com.java.development.eleven_class_library.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
* @ClassName: DataDemo02
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月19日
*
*/

public class DateDemo02 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Calendar calendar = null;//声明一个Calendar对象
        calendar = new GregorianCalendar();//通过子类为其实例化
        System.out.println("年：" + calendar.get(Calendar.YEAR));
        System.out.println("月：" + (calendar.get(Calendar.MONTH) + 1));//一月的值为0
        System.out.println("日：" + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("时：" + calendar.get(Calendar.HOUR));
        System.out.println("分：" + calendar.get(Calendar.MINUTE));
        System.out.println("秒：" + calendar.get(Calendar.SECOND));
        System.out.println("毫秒：" + calendar.get(Calendar.MILLISECOND));
    }

}
