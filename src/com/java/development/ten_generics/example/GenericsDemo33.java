
/**  
* @Title: GenericsDemo33.java
* @Package com.java.development.ten_generics.example
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月18日
* @version V1.0  
*/

package com.java.development.ten_generics.example;

/**
* @ClassName: GenericsDemo33
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月18日
*
*/

public class GenericsDemo33 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Person<Introduction> per = null;//声明Person对象，同时指定Contact类型
        //实例化Person对象，同时设置info的信息
        per = new Person<Introduction>(new Introduction("贾利鑫", "女", 25));
        System.out.println(per);
    }

}
