
/**  
* @Title: Ex04.java
* @Package com.java.development.eleven_class_library.exercises
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月24日
* @version V1.0  
*/

package com.java.development.eleven_class_library.exercises;

import java.util.Random;

/**
* @ClassName: Ex04
* @Description:编写程序，用0~1之间的随机数来模拟掷硬币试验，
* 统计掷1000次后出现正、反面的次数并输出。
* @author Administrator
* @date 2018年10月24日
*
*/

public class Ex04 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Random rand = new Random();
        int i = 0;
        int num = 0;//统计正面出现的次数
        while (i++ < 1000) {
            int temp = rand.nextInt(2);//产生一个0~1的随机整数
            if (temp == 1) {
                num++;
            }
        }
        System.out.println("统计结果为：");
        System.out.print("\t|-正面次数：" + num + "\t反面次数：" + (1000 - num));
    }

}
