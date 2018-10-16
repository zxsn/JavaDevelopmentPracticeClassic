
/**  
* @Title: GenericsDemo32.java
* @Package com.java.development.ten_generics.example
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月18日
* @version V1.0  
*/

package com.java.development.ten_generics.example;

/**
* @ClassName: GenericsDemo32
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月18日
*
*/

public class GenericsDemo32 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Person<Contact> per = null;//声明Person对象，同时指定Contact类型
        //实例化Person对象，同时设置info的信息
        per = new Person<Contact>(new Contact("涿州市", "18404982481", "072750"));
        System.out.println(per);
    }

}
