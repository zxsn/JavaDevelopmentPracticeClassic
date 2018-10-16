
/**  
* @Title: GenercisDemo25.java
* @Package com.java.development.ten_generics.generics_interface
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月17日
* @version V1.0  
*/

package com.java.development.ten_generics.generics_interface.way1;

/**
* @ClassName: GenercisDemo25
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月17日
*
*/

public class GenercisDemo24 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Info<String> i = new InfoImpl<String>("贾利鑫");
        System.out.println("内容：" + i.getVar());

    }

}
