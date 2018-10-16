
/**  
* @Title: GenercisDemo13.java
* @Package com.java.development.ten_generics
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月16日
* @version V1.0  
*/

package com.java.development.ten_generics.wildcard;

import com.java.development.ten_generics.security_warning.Info;

/**
* @ClassName: GenercisDemo13
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月16日
*
*/

public class GenercisDemo13 {

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
        fun(i);

    }

    /**
    * @Title: fun
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param @param i    参数
    * @return void    返回类型
    * @throws
    */

    @SuppressWarnings("rawtypes")
    private static void fun(Info temp) {//警告：Info 是原始类型。应该将对通用类型 Info<T> 的引用参数化
        System.out.println("内容：" + temp);

    }

}
