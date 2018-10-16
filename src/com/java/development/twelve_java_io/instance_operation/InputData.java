
/**  
* @Title: InputData.java
* @Package com.java.development.twelve_java_io.instance_operation
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月29日
* @version V1.0  
*/

package com.java.development.twelve_java_io.instance_operation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
    * @ClassName: InputData
    * @Description: 输入数据类
    * @author Administrator
    * @date 2018年10月29日
    *
    */

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
