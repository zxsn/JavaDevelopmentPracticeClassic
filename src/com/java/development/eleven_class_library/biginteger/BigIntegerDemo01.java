
/**  
* @Title: BigIntegerDemo01.java
* @Package com.java.development.eleven_class_library.biginteger
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月19日
* @version V1.0  
*/

package com.java.development.eleven_class_library.biginteger;

import java.math.BigInteger;

/**
    * @ClassName: BigIntegerDemo01
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月19日
    *
    */

public class BigIntegerDemo01 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("123456789");
        BigInteger bi2 = new BigInteger("987654321");
        System.out.println("加法操作：" + bi2.add(bi1));
        System.out.println("减法操作：" + bi2.subtract(bi1));
        System.out.println("乘法操作：" + bi2.multiply(bi1));
        System.out.println("除法操作：" + bi2.divide(bi1));
        System.out.println("最大数：" + bi2.max(bi1));
        System.out.println("最小数：" + bi2.min(bi1));
        BigInteger result[] = bi2.divideAndRemainder(bi1);
        System.out.println("商是：" + result[0] + "；余数是：" + result[1]);

    }

}
