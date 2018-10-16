
/**  
* @Title: GenercisDemo12.java
* @Package com.java.development.ten_generics
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月16日
* @version V1.0  
*/

package com.java.development.ten_generics.wildcard;

import com.java.development.ten_generics.security_warning.Info;

/**
* @ClassName: GenercisDemo12
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月16日
*
*/

public class GenercisDemo12 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Info<String> i = new Info<String>();
        i.setVar("贾利鑫");
        //fun(i);//编译出错：类型 GenercisDemo12 中的方法 fun（Info<Object>）对于参数（Info<String>）不适用

    }

    /**
    * @Title: fun
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param @param i    参数
    * @return void    返回类型
    * @throws
    */

    @SuppressWarnings("unused")
    private static void fun(Info<Object> temp) {
        System.out.println("内容：" + temp);

    }

}
