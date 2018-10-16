
/**  
* @Title: RandomDemo02.java
* @Package com.java.development.eleven_class_library.random
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月19日
* @version V1.0  
*/

package com.java.development.eleven_class_library.random;

import java.util.Random;

/**
* @ClassName: RandomDemo02
* @Description:编写36选7的彩票程序
* @author Administrator
* @date 2018年10月19日
*
*/

public class RandomDemo02 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Random r = new Random();
        int data[] = new int[7];
        int foot = 0;//数组下标
        while (foot < 7) {
            int temp = r.nextInt(37);
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
    * @Description:判断是否存在有重复的内容，但是不允许保存0
    * @param @param data 已经保存的数据
    * @param @param temp 新生成的数据
    * @param @return    参数
    * @return boolean    返回类型
    * @throws
    */

    private static boolean isRepeat(int temp[], int num) {
        if (num == 0) {//没有必要判断了
            return true;//直接返回，随后的代码都不再执行了
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == num) {
                return true;
            }
        }
        return false;
    }

}
