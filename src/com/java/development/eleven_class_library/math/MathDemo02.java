
/**  
* @Title: MathDemo02.java
* @Package com.java.development.eleven_class_library.math
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月19日
* @version V1.0  
*/

package com.java.development.eleven_class_library.math;

/**
* @ClassName: MathDemo02
* @Description:观察四舍五入
* @author Administrator
* @date 2018年10月19日
*
*/

public class MathDemo02 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        //如果设置的是负数，但小数点后面的内容大于0.5时将自动进位
        System.out.println("15.5四舍五入为：" + Math.round(15.5));
        System.out.println("-15.5四舍五入为：" + Math.round(-15.5));
        System.out.println("-15.51四舍五入为：" + Math.round(-15.51));

    }

}
