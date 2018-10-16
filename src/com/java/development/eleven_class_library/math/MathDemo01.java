
/**  
* @Title: MathDemo01.java
* @Package com.java.development.eleven_class_library.math
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月19日
* @version V1.0  
*/

package com.java.development.eleven_class_library.math;

/**
* @ClassName: MathDemo01
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月19日
*
*/

public class MathDemo01 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        //Math类中的方法都是静态方法，直接使用”类名.方法名称()“的形式调用即可
        System.out.println("求平方根：" + Math.sqrt(9.0));
        System.out.println("求两数的最大值：" + Math.max(10, 30));
        System.out.println("求两数的最小值：" + Math.min(10, 30));
        System.out.println("2的3次方：" + Math.pow(2, 3));
        System.out.println("四舍五入：" + Math.round(33.6));

    }

}
