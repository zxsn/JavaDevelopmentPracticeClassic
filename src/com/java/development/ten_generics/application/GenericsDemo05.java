
/**  
* @Title: GenericsDemo05.java
* @Package com.java.development.ten_generics.ok
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月16日
* @version V1.0  
*/

package com.java.development.ten_generics.application;

/**
* @ClassName: GenericsDemo05
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月16日
*
*/

public class GenericsDemo05 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Point<Integer> p = new Point<Integer>();//里面的var数值为Integer类型
        p.setVar(30);//自动装箱
        System.out.println(p.getVar() * 2);

    }

}
