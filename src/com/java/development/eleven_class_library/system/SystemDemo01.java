
/**  
* @Title: SystemDemo01.java
* @Package com.java.development.eleven_class_library.system
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月19日
* @version V1.0  
*/

package com.java.development.eleven_class_library.system;

/**
* @ClassName: SystemDemo01
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月19日
*
*/

public class SystemDemo01 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();//取得开始计算之前的时间
        long sum = 0;
        for (int i = 0; i < 30000000; i++) {
            sum += i;

        }
        long endTime = System.currentTimeMillis();
        System.out.println("求和为：" + sum);
        //结束时间减去开始时间
        System.out.println("计算所花费的时间：" + (endTime - startTime) + "毫秒");

    }

}
