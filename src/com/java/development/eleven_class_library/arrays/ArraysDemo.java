
/**  
* @Title: ArraysDemo.java
* @Package com.java.development.eleven_class_library.arrays
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月20日
* @version V1.0  
*/

package com.java.development.eleven_class_library.arrays;

import java.util.Arrays;

/**
    * @ClassName: ArraysDemo
    * @Description:操作Arrays类
    * @author Administrator
    * @date 2018年10月20日
    *
    */

public class ArraysDemo {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        int temp[] = { 3, 5, 7, 9, 1, 2, 6, 8 };
        Arrays.sort(temp);//数组排序
        System.out.println("排序后的数组：");
        System.out.println(Arrays.toString(temp));//以字符串输出数组
        int point = Arrays.binarySearch(temp, 3);//检查数据位置
        System.out.println("元素'3'的位置在：" + point);
        Arrays.fill(temp, 3);//填充数组
        System.out.println("数组填充：");
        System.out.println(Arrays.toString(temp));

    }

}
