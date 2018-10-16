/** 
 * projectName:Java开发实战经典 
 * fileName:Exercises3.java 
 * packageName:com.java.development.first 
 * date:2018年9月11日下午2:33:14 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.first;

/**   
 * @title: Exercises3.java 
 * @package com.java.development.first 
 * @description: TODO现在有如下的一个数组：
 * int oldArray = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
 * 要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组，生成的新数组为：
 * int newArray = {1,3,4,5,6,6,5,4,7,6,7,5};
 * @author: zxsn
 * @date: 2018年9月11日 下午2:33:14 
 * @version: V1.0   
*/
public class Exercises3 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月11日 下午2:33:14
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] oldArray = { 1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5 };

        System.out.print("原数组为：{");

        printArray(oldArray);

        removeZero(oldArray);

    }

    /**
     *@title printArray 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月11日 下午3:39:24
     *@param oldArray
     *@throws 
     */
    public static void printArray(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            if (Array.length - 1 == i) {
                System.out.println(Array[i] + "}");
            } else {
                System.out.print(Array[i] + ",");

            }

        }
    }

    /**
     * @param temp 
     *@title removeZero 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月11日 下午2:45:44
     *@param oldArray
     *@throws 
     */
    public static void removeZero(int[] oldArray) {
        //统计旧数组中0的个数
        int temp = 0;
        for (int i = 0; i < oldArray.length; i++) {
            if (oldArray[i] == 0) {
                temp++;
            }
        }
        //创建新数组
        int newArray[] = null;
        newArray = new int[oldArray.length - temp];
        //给新数组赋值
        int j = 0;
        for (int i = 0; i < oldArray.length; i++) {
            if (oldArray[i] != 0) {
                newArray[j] = oldArray[i];
                j++;
            }
        }
        System.out.print("新的数组为：{");
        printArray(newArray);

    }

}
