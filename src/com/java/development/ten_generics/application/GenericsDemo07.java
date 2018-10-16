
/**  
* @Title: GenericsDemo07.java
* @Package com.java.development.ten_generics.ok
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月16日
* @version V1.0  
*/

package com.java.development.ten_generics.application;

/**
* @ClassName: GenericsDemo07
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月16日
*
*/

public class GenericsDemo07 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Point<Integer> p = new Point<Integer>();
        //p.setVar("贾利鑫");//编译报错：类型 Point<Integer> 中的方法 setVar（Integer）对于参数（String）不适用

    }

}
