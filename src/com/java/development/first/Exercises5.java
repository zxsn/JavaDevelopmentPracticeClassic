/** 
 * projectName:Java开发实战经典 
 * fileName:Exercises5.java 
 * packageName:com.java.development.first 
 * date:2018年9月11日下午4:52:35 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.first;

/**   
 * @title: Exercises5.java 
 * @package com.java.development.first 
 * @description: TODO给出10个整数（int型），然后任意查询一个数字是否存在该10个数字内
 * @author: zxsn
 * @date: 2018年9月11日 下午4:52:35 
 * @version: V1.0   
*/
public class Exercises5 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月11日 下午4:52:35
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        int array[] = { 1, 6, 7, 0, 2, 3, 4, 3, 7, 3 };
        if (search(array, 7)) {
            System.out.println("这个整数存在此数组。");
        } else
            System.out.println("这个整数不存在此数组。");
    }

    /**
     *@title search 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月11日 下午4:54:19
     *@param array
     *@param i
     *@throws 
     */
    private static boolean search(int[] array, int val) {
        boolean flag = false; //默认表示不存在
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                flag = true;
            }
        }
        return flag;

    }

}
