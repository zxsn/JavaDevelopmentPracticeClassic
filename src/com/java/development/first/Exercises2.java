/** 
 * projectName:Java开发实战经典 
 * fileName:Exercises2.java 
 * packageName:com.java.development.first 
 * date:2018年9月11日上午11:08:30 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.first;

/**   
 * @title: Exercises2.java 
 * @package com.java.development.first 
 * @description: TODO定义一个由整数组成的数组，要求求出其中的奇数个数和偶数个数
 * @author: zxsn
 * @date: 2018年9月11日 上午11:08:30 
 * @version: V1.0   
*/
public class Exercises2 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月11日 上午11:08:30
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        //定义一个由整数组成的数组，要求求出其中的奇数个数和偶数个数

        int[] array = { 1, 6, 7, 0, 2, 3, 4, 3, 7, 3 };
        System.out.print("数组是：");
        System.out.print("{");
        //打印数组
        for (int i = 0; i < array.length; i++) {
            if (array.length - 1 == i) {
                System.out.println(array[i] + "}");
            } else {
                System.out.print(array[i] + ",");

            }
        }
        //统计奇偶个数
        count(array);

    }

    /**
     * @param even 
     * @param odd 
     *@title count 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月11日 下午2:18:31
     *@param array
     *@throws 
     */
    private static void count(int[] array) {
        int odd = 0, even = 0; //定义奇数、偶数计数变量
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("数组中，奇数有" + odd + "个、偶数有" + even + "个。");

    }

}
