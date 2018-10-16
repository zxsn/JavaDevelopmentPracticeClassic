
/**  
* @Title: GenercisDemo23.java
* @Package com.java.development.ten_generics
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月16日
* @version V1.0  
*/

package com.java.development.ten_generics.restricted_generics;

import com.java.development.ten_generics.security_warning.Info;

/**
* @ClassName: GenercisDemo23
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月16日
*
*/

public class GenercisDemo23 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Info<String> i1 = new Info<String>();
        @SuppressWarnings("unused")
        Info<Object> i2 = null;
        //i2 = i1;//编译报错：类型不匹配：不能从 Info<String> 转换为 Info<Object>

    }

}
