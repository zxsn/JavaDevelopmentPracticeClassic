
/**  
* @Title: GenercisDemo19.java
* @Package com.java.development.ten_generics.toplimit
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月16日
* @version V1.0  
*/

package com.java.development.ten_generics.restricted_generics.toplimit;

class Info<T extends Number> {
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

}

/**
* @ClassName: GenercisDemo19
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月16日
*
*/

public class GenercisDemo19 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Info<Integer> i = new Info<Integer>();
        i.setVar(10);
        System.out.println("内容：" + i.getVar());

    }

}
