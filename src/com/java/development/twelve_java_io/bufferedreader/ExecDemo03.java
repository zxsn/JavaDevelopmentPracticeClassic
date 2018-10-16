
/**  
* @Title: ExecDemo02.java
* @Package com.java.development.twelve_java_io.bufferedreader
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月27日
* @version V1.0  
*/

package com.java.development.twelve_java_io.bufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
* @ClassName: ExecDemo02
* @Description: 完成一个专门处理输入数据的类，只能得到整数和字符串
* 扩充InputData，使之可以输入整数、小数、字符串、日期
* @author Administrator
* @date 2018年10月27日
*
*/

public class ExecDemo03 {

    public class InputData {
        private BufferedReader buf = null;

        /**
         * 创建一个新的实例 InputData.
         *
         */

        public InputData() {//类的构造方法中，实例化BufferedReader对象
            this.buf = new BufferedReader(new InputStreamReader(System.in));
        }

        public String getString(String info) {
            String temp = null;
            System.out.print(info);//打印提示信息
            try {
                temp = buf.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return temp;
        }

        public int getInt(String info, String err) {//得到以一个整数的输入数据
            int temp = 0;
            String str = null;
            boolean flag = true;//定义一个循环的处理标志
            while (flag) {
                str = this.getString(info);
                if (str.matches("^\\d+$")) {//判断输入的是否是数字
                    temp = Integer.parseInt(str);//将字符串变为数字
                    flag = false;
                } else {
                    System.out.println(err);//出现错误，则打印传递进的错误信息
                }
            }
            return temp;

        }

        public float getFloat(String info, String err) {//得到以一个小数的输入数据
            float temp = 0;
            String str = null;
            boolean flag = true;//定义一个循环的处理标志
            while (flag) {
                str = this.getString(info);
                if (str.matches("^\\d+.?\\d+$")) {//判断输入的是否是小数
                    temp = Float.parseFloat(str);//将字符串变为小数
                    flag = false;
                } else {
                    System.out.println(err);//出现错误，则打印传递进的错误信息
                }
            }
            return temp;

        }

        public Date getDate(String info, String err) {//得到以一个日期的数据
            Date d = null;
            String str = null;
            boolean flag = true;
            while (flag) {
                str = this.getString(info);
                if (str.matches("\\d{4}-(1?[0-2]|0?[1-9])-(0?[1-9]|(1|2)[0-9]|30|31)")) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    try {
                        d = sdf.parse(str);//将字符串变为Date型数据
                        flag = false;
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println(err);
                }

            }
            return d;

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
        int i = 0;
        int j = 0;
        float f = 0f;
        Date d = null;
        ExecDemo03 ed = new ExecDemo03();
        InputData input = ed.new InputData();
        i = input.getInt("请输入第一个数字：", "输入的数据必须是数字，请重新输入！");
        j = input.getInt("请输入第二个数字：", "输入的数据必须是数字，请重新输入！");
        f = input.getFloat("请输入第三个字符串（小数）：", "输入的数据必须是小数，请重新输入！");
        d = input.getDate("请输入第四个字符串（日期 格式：yyyy-MM-dd）：", "输入的数据必须是日期格式，请重新输入！");

        System.out.println(i + " + " + j + " = " + (i + j));
        System.out.println("输入的小数为：" + f);
        System.out.println("输入的日期为：" + new SimpleDateFormat("yyyy-MM-dd").format(d));
    }

}
