/** 
 * projectName:Java开发实战经典 
 * fileName:Exercises6.java 
 * packageName:com.java.development.first 
 * date:2018年9月11日下午5:00:39 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.first;

/**   
 * @title: Exercises6.java 
 * @package com.java.development.first 
 * @description: TODO定义一个包含10个元素的数组，对其进行赋值，使每个元素的值等于其下标，然后输出
 * 最后将这个数组倒置（即首尾交换）后输出。
 * @author: zxsn
 * @date: 2018年9月11日 下午5:00:39 
 * @version: V1.0   
*/
public class Exercises6 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月11日 下午5:00:39
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        int temp[] = new int[10];

        init(temp); //初始化数组
        System.out.print("原数组：");
        print(temp); //打印数组
        System.out.print("方法一：");
        print(reverse(temp)); //方法一
        System.out.print("方法二：");
        print(reverseT(temp));
    }

    /**
     *@title reverseT 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月11日 下午5:22:57
     *@param temp
     *@return
     *@throws 
     */
    private static int[] reverseT(int[] array) {
        int foot = 0;
        int head = 0;
        if (array.length % 2 == 0) {//如果是偶数个数中间无中间点
            foot = array.length / 2;//求出中间元素位置
            head = foot - 1;//求从前面开始计算的个数
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[head];
                array[head] = array[foot];
                array[foot] = temp;
                head--;
                foot++;
            }
        } else {//如果是奇数个数中间正好存在一个中间点
            foot = array.length / 2;
            head = foot;
            for (int i = 0; i < array.length / 2 + 1; i++) {
                int temp = array[head];
                array[head] = array[foot];
                array[foot] = temp;
                head--;
                foot++;
            }
        }
        return array;
    }

    /**
     *@title reverse 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月11日 下午5:17:38
     *@param temp
     *@return
     *@throws 
     */
    private static int[] reverse(int[] array) {
        int[] newArray = new int[array.length];
        int foot = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[foot];
            foot--;
        }
        return newArray;
    }

    /**
     *@title print 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月11日 下午5:10:30
     *@param temp
     *@throws 
     */
    private static void print(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            if (array.length - 1 == i) {
                System.out.println(array[i] + "}");
            } else {
                System.out.print(array[i] + ",");

            }

        }
    }

    /**
     *@title init 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月11日 下午5:10:11
     *@param temp
     *@throws 
     */
    private static void init(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

    }

}
