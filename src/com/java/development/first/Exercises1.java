
/**  
* @Title: Exercises1.java
* @Package com.java.development.first
* @Description: TODO(用一句话描述该文件做什么)
* @author houdo
* @date 2018年9月11日
* @version V1.0  
*/

package com.java.development.first;

/**
* @ClassName: Exercises1
* @Description: 习题一
* 编写程序求1！+2！+...+30！的和并显示，要求使用方法完成
* @author houdo
* @date 2018年9月11日
*
*/

public class Exercises1 {

    public static void main(String[] args) {
        // 编写程序求1！+2！+...+30！的和并显示，要求使用方法完成
        double sum = 0;
        int end = 30;

        System.out.print("1！+2！+...+30！=");

        for (int i = 1; i <= end; i++) {
            sum += factorial(i);
        }
        System.out.print(sum);
    }

    /**
     * @return 
    * @Title: factorial
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param @param i    参数
    * @return void    返回类型
    * @throws
    */

    private static double factorial(int i) {
        // 阶乘的计算
        if (i == 1) {
            return 1;
        }
        double temp = i * factorial(i - 1);
        return temp;

    }

}
