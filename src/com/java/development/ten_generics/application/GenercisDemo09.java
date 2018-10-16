
/**  
* @Title: GenercisDemo09.java
* @Package com.java.development.ten_generics
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月16日
* @version V1.0  
*/

package com.java.development.ten_generics.application;

/**
* @ClassName: GenercisDemo09
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月16日
*
*/

public class GenercisDemo09 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Notepad<String, Integer> t = new Notepad<String, Integer>();
        t.setKey("贾利鑫");
        t.setValue(25);
        System.out.println("姓名：" + t.getKey());
        System.out.println("年龄：" + t.getValue());

    }

}
