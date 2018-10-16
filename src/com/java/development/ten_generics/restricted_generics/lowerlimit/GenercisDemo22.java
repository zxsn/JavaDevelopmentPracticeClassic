
/**  
* @Title: GenercisDemo21.java
* @Package com.java.development.ten_generics.lowerlimit
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月16日
* @version V1.0  
*/

package com.java.development.ten_generics.restricted_generics.lowerlimit;

/**
* @ClassName: GenercisDemo21
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月16日
*
*/

public class GenercisDemo22 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Info<Integer> i = new Info<Integer>();
        i.setVar(10);
        //fun(i);//编译报错：类型 GenercisDemo22 中的方法 fun（Info<? super String>）对于参数（Info<Integer>）不适用

    }

    /**
    * @Title: fun
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param @param i1    参数
    * @return void    返回类型
    * @throws
    */

    @SuppressWarnings("unused")
    private static void fun(Info<? super String> temp) {
        System.out.println("内容：" + temp);

    }

}
