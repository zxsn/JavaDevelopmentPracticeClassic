
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

/**
* @ClassName: ExecDemo02
* @Description: 完成一个专门处理输入数据的类，只能得到整数和字符串
* @author Administrator
* @date 2018年10月27日
*
*/

public class ExecDemo02 {
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
        ExecDemo02 ed = new ExecDemo02();
        InputData input = ed.new InputData();
        i = input.getInt("请输入第一个数字：", "输入的数据必须是数字，请重新输入！");
        j = input.getInt("请输入第二个数字：", "输入的数据必须是数字，请重新输入！");
        System.out.println(i + " + " + j + " = " + (i + j));
    }

}
