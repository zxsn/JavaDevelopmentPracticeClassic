
/**  
* @Title: DateDemo07.java
* @Package com.java.development.eleven_class_library.date
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月19日
* @version V1.0  
*/

package com.java.development.eleven_class_library.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
    * @ClassName: DateDemo07
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月19日
    *
    */

public class DateDemo07 {
    class DateTime {
        //声明日期格式操作对象，直接对new Date()进行实例化
        private SimpleDateFormat sdf = null;

        //得到完整的日期，格式为：yyyy-MM-dd HH:mm:ss.SSS
        public String getDate() {
            this.sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            return this.sdf.format(new Date());

        }

        //得到完整的日期，格式为：yyyy年MM月dd日 HH时mm分ss秒SSS毫秒
        public String getDateComplete() {
            this.sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒");
            return this.sdf.format(new Date());

        }

        //得到时间戳，格式为：yyyyMMddHHmmssSSS
        public String getTimeStamp() {
            this.sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
            return this.sdf.format(new Date());

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
        DateDemo07 dd = new DateDemo07();
        DateTime dt = dd.new DateTime();//实例化DateTime对象
        System.out.println("系统日期：" + dt.getDate());
        System.out.println("中文日期：" + dt.getDateComplete());
        System.out.println("时间戳：" + dt.getTimeStamp());
    }

}
