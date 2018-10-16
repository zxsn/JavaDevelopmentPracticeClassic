
/**  
* @Title: Ex02.java
* @Package com.java.development.eleven_class_library.exercises
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月24日
* @version V1.0  
*/

package com.java.development.eleven_class_library.exercises;

import java.util.Random;

/**
    * @ClassName: Ex02
    * @Description:利用Random类产生5个1~30之间（包括1和20）的随机整数。
    * @author Administrator
    * @date 2018年10月24日
    *
    */

public class Ex02 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Random rand = new Random();
        int data[] = new int[5];//开辟一个包含7个元素的数组，保存生成的数字
        int foot = 0;//为数组操作下标
        data[3] = 1;//包括1
        data[4] = 20;//包括20
        while (foot < 3) {
            int temp = rand.nextInt(30) + 1;//随机数是产生0~29的数字
            if (!isRepeat(data, temp)) {//判断是否重复
                data[foot++] = temp;
            }
        }
        java.util.Arrays.sort(data);//排序
        for (int i = 0; i < data.length; i++) {
            System.out.print(i < data.length - 1 ? data[i] + "、" : data[i]);
        }

    }

    /**
    * @Title: isRepeat
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param @param data
    * @param @param temp
    * @param @return    参数
    * @return boolean    返回类型
    * @throws
    */

    private static boolean isRepeat(int[] temp, int num) {
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == num) {
                return true;
            }
        }
        return false;
    }

}
