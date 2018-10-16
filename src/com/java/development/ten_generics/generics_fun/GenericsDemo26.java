
/**  
* @Title: GenericsDemo26.java
* @Package com.java.development.ten_generics.generics_fun
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月17日
* @version V1.0  
*/

package com.java.development.ten_generics.generics_fun;

class Demo {
    public <T> T fun(T t) {//可以接收任意类型的数据
        return t;

    }
}

/**
* @ClassName: GenericsDemo26
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月17日
*
*/

public class GenericsDemo26 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Demo d = new Demo();
        String str = d.fun("贾利鑫");
        int i = d.fun(25);
        System.out.println(str);
        System.out.println(i);

    }

}
