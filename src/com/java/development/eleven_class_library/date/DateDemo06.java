
/**  
* @Title: DateDemo06.java
* @Package com.java.development.eleven_class_library.date
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月19日
* @version V1.0  
*/

package com.java.development.eleven_class_library.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
* @ClassName: DateDemo06
* @Description: 取得完整日期方式一----基于Calendar类
* @author Administrator
* @date 2018年10月19日
*
*/

public class DateDemo06 {
    class DateTime {
        private Calendar calendar = null;//定义一个Calendar对象，可以取得时间

        public DateTime() {
            this.calendar = new GregorianCalendar();//通过Calendar类的子类实例化
        }

        public String getDate() {//得到完整的日期，格式为：yyyy-MM-dd HH:mm:ss.SSS
            //考虑到要频繁修改字符串，所以使用StringBuffer来提升性能
            StringBuffer buf = new StringBuffer();
            //依次取得时间
            buf.append(calendar.get(Calendar.YEAR)).append("-");
            buf.append(this.addZero(calendar.get(Calendar.MONTH) + 1, 2)).append("-");
            buf.append(this.addZero(calendar.get(Calendar.DAY_OF_MONTH), 2)).append(" ");
            buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY), 2)).append(":");
            buf.append(this.addZero(calendar.get(Calendar.MINUTE), 2)).append(":");
            buf.append(this.addZero(calendar.get(Calendar.SECOND), 2)).append(".");
            buf.append(this.addZero(calendar.get(Calendar.MILLISECOND), 3));

            return buf.toString();

        }

        public String getDateComplete() {//得到完整的日期，格式为：yyyy年MM月dd日 HH时mm分ss秒SSS毫秒
            //考虑到要频繁修改字符串，所以使用StringBuffer来提升性能
            StringBuffer buf = new StringBuffer();
            //依次取得时间
            buf.append(calendar.get(Calendar.YEAR)).append("年");
            buf.append(this.addZero(calendar.get(Calendar.MONTH) + 1, 2)).append("月");
            buf.append(this.addZero(calendar.get(Calendar.DAY_OF_MONTH), 2)).append("日 ");
            buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY), 2)).append("时");
            buf.append(this.addZero(calendar.get(Calendar.MINUTE), 2)).append("分");
            buf.append(this.addZero(calendar.get(Calendar.SECOND), 2)).append("秒");
            buf.append(this.addZero(calendar.get(Calendar.MILLISECOND), 3)).append("毫秒");

            return buf.toString();

        }

        /**
        * @Title: addZero
        * @Description: 考虑到日期中有前导0，所以加上了补0的方法
        * @param @param i
        * @param @param j
        * @param @return    参数
        * @return Object    返回类型
        * @throws
        */

        public String addZero(int num, int len) {
            StringBuffer s = new StringBuffer();
            s.append(num);
            while (s.length() < len) {
                s.insert(0, "0");
            }
            return s.toString();
        }

        public String getTimeStamp() {//得到时间戳，格式为：yyyyMMddHHmmssSSS
            //考虑到要频繁修改字符串，所以使用StringBuffer来提升性能
            StringBuffer buf = new StringBuffer();
            //依次取得时间
            buf.append(calendar.get(Calendar.YEAR));
            buf.append(this.addZero(calendar.get(Calendar.MONTH) + 1, 2));
            buf.append(this.addZero(calendar.get(Calendar.DAY_OF_MONTH), 2));
            buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY), 2));
            buf.append(this.addZero(calendar.get(Calendar.MINUTE), 2));
            buf.append(this.addZero(calendar.get(Calendar.SECOND), 2));
            buf.append(this.addZero(calendar.get(Calendar.MILLISECOND), 3));

            return buf.toString();

        }
    }

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        DateDemo06 dd = new DateDemo06();
        DateTime dt = dd.new DateTime();//实例化DateTime对象
        System.out.println("系统日期：" + dt.getDate());
        System.out.println("中文日期：" + dt.getDateComplete());
        System.out.println("时间戳：" + dt.getTimeStamp());

    }

}
