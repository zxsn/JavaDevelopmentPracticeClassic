
/**  
* @Title: GenericsDemo31.java
* @Package com.java.development.ten_generics.generics_nesting
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月18日
* @version V1.0  
*/

package com.java.development.ten_generics.generics_nesting;

/**
* @ClassName: GenericsDemo31
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月18日
*
*/

public class GenericsDemo31 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Demo<Info<String, Integer>> d = null;//将Info作为Demo的泛型类型
        Info<String, Integer> i = null;//Info要指定两个泛型类型
        i = new Info<String, Integer>("贾利鑫", 25);
        d = new Demo<Info<String, Integer>>(i);//在Demo类中设置Info类对象
        System.out.println("内容一：" + d.getInfo().getVar());
        System.out.println("内容二：" + d.getInfo().getValue());

    }

}
