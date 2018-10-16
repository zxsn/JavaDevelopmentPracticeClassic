
/**  
* @Title: GenercisDemo18.java
* @Package com.java.development.ten_generics
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月16日
* @version V1.0  
*/

package com.java.development.ten_generics.restricted_generics;

import com.java.development.ten_generics.security_warning.Info;

/**
* @ClassName: GenercisDemo18
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月16日
*
*/

public class GenercisDemo18 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Info<String> i = new Info<String>();
        i.setVar("hello");
        //fun(i);//编译报错：类型 GenercisDemo18 中的方法 fun（Info<? extends Number>）对于参数（Info<String>）不适用

    }

    /**
    * @Title: fun
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param @param i    参数
    * @return void    返回类型
    * @throws
    */

    @SuppressWarnings("unused")
    private static void fun(Info<? extends Number> temp) {//使用通配符解决
        System.out.println("内容：" + temp);

    }

}
