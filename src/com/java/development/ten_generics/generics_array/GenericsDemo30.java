
/**  
* @Title: GenericsDemo30.java
* @Package com.java.development.ten_generics.generics_array
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月18日
* @version V1.0  
*/

package com.java.development.ten_generics.generics_array;

/**
* @ClassName: GenericsDemo30
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月18日
*
*/

public class GenericsDemo30 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Integer i[] = fun1(1, 2, 3, 4, 5, 6);
        fun2(i);

    }

    /**
    * @Title: fun2
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param @param i    参数
    * @return void    返回类型
    * @throws
    */

    private static <T> void fun2(T param[]) {//接收泛型数组
        System.out.println("接受泛型数组：");
        int i = 0;
        for (T t : param) {
            if (param.length == (i + 1)) {
                System.out.print(t);
            } else
                System.out.print(t + "、");
            i++;
        }
        System.out.println();

    }

    /**
     * @param <T>
    * @Title: fun1
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param @return    参数
    * @return Integer []    返回类型
    * @throws
    */

    @SafeVarargs
    public static <T> T[] fun1(T... arg) {//接收可变参数，返回泛型数组
        return arg;
    }

}
