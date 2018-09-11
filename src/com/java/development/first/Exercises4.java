/** 
  * projectName:Java开发实战经典 
 * fileName:Exercises4.java 
 * packageName:com.java.development.first 
 * date:2018年9月11日下午4:07:08 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.first;

/**   
 * @title: Exercises4.java 
 * @package com.java.development.first 
 * @description: TODO定义一个整型数组，求出数组元素的和、数组元素的最大值和最小值，并输出所求的结果
 * @author: zxsn
 * @date: 2018年9月11日 下午4:07:08 
 * @version: V1.0   
*/
public class Exercises4 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月11日 下午4:07:08
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        int array[] = { 1, 6, 7, 0, 2, 3, 4, 3, 7, 3 };
        System.out.print("数组为：{");

        printArray(array);

        int max, min, sum;
        min = max = array[0];
        sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("这个数组中元素和为：" + sum + "，最大值为：" + max + "，最小值为：" + min);
    }

    /**
     *@title printArray 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月11日 下午4:30:21
     *@param array
     *@throws 
     */
    private static void printArray(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            if (Array.length - 1 == i) {
                System.out.println(Array[i] + "}");
            } else {
                System.out.print(Array[i] + ",");

            }

        }
    }

}
