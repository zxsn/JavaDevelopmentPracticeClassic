
/**  
* @Title: MathDemo03.java
* @Package com.java.development.eleven_class_library.math
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月19日
* @version V1.0  
*/

package com.java.development.eleven_class_library.math;

/**
* @ClassName: MathDemo03
* @Description:实现指定位数的四舍五入
* @author Administrator
* @date 2018年10月19日
*
*/

public class MathDemo03 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        System.out.println(round(-15.678139, 2));//-15.68

    }

    /**
    * @Title: round
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param @param num 要进行四舍五入操作的数字
    * @param @param scale 保留的小数位
    * @param @return    参数
    * @return char []    返回类型
    * @throws
    */

    public static double round(double num, int scale) {

        return Math.round(num * Math.pow(10.0, scale)) / Math.pow(10.0, scale);
    }

}
