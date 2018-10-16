
/**  
* @Title: GenercisDemo25.java
* @Package com.java.development.ten_generics.generics_interface
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月17日
* @version V1.0  
*/

package com.java.development.ten_generics.generics_interface.way2;

/**
* @ClassName: GenercisDemo25
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月17日
*
*/

public class GenercisDemo25 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Info<String> i = new InfoImpl("贾利鑫");//通过子类实例化此对象，不用指定泛型
        System.out.println("内容：" + i.getVar());

    }

}
