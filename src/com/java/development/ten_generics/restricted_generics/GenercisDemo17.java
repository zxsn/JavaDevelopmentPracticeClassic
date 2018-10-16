
/**  
* @Title: GenercisDemo17.java
* @Package com.java.development.ten_generics
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月16日
* @version V1.0  
*/

package com.java.development.ten_generics.restricted_generics;

import com.java.development.ten_generics.security_warning.Info;

/**
* @ClassName: GenercisDemo17
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月16日
*
*/

public class GenercisDemo17 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Info<Integer> i1 = new Info<Integer>();
        Info<Float> i2 = new Info<Float>();
        i1.setVar(30);
        i2.setVar(30.1f);
        fun(i1);
        fun(i2);

    }

    /**
    * @Title: fun
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param @param i    参数
    * @return void    返回类型
    * @throws
    */

    private static void fun(Info<? extends Number> temp) {//使用通配符解决
        System.out.println("内容：" + temp);

    }

}
