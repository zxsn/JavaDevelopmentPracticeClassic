
/**  
* @Title: Ex01.java
* @Package com.java.development.twelve_java_io.exercises
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月30日
* @version V1.0  
*/

package com.java.development.twelve_java_io.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
    * @ClassName: Ex01
    * @Description:编写Java程序，输入3个整数，并求出3个整数的最大值和最小值。
    * @author Administrator
    * @date 2018年10月30日
    *
    */

public class Ex01 {

    public class InputData {
        private BufferedReader buf = null;

        public InputData() {
            buf = new BufferedReader(new InputStreamReader(System.in));
        }

        public String getString(String info) {
            String temp = null;
            System.out.print(info);
            try {
                temp = buf.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return temp;
        }

        public int getInt(String info, String err) {
            int temp = 0;
            String str = null;
            boolean flag = true;
            while (flag) {
                str = this.getString(info);
                if (str.matches("^\\d+$")) {
                    temp = Integer.parseInt(str);
                    flag = false;
                } else {
                    System.out.println(err);
                }
            }
            return temp;

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
        Ex01 e1 = new Ex01();
        int a = 0;
        int b = 0;
        int c = 0;
        InputData input = e1.new InputData();
        a = input.getInt("请输入第一个整数：", "输入的数据必须是整数，请重新输入！");
        b = input.getInt("请输入第二个整数：", "输入的数据必须是整数，请重新输入！");
        c = input.getInt("请输入第三个整数：", "输入的数据必须是整数，请重新输入！");
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        System.out.println("三个整数中，最大的数是：" + max + "，最小的数是：" + min);
    }

}
