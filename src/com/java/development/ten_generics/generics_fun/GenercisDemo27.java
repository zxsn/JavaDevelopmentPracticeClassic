
/**  
* @Title: GenercisDemo27.java
* @Package com.java.development.ten_generics.generics_fun
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月17日
* @version V1.0  
*/

package com.java.development.ten_generics.generics_fun;

class Info<T extends Number> {
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return this.var.toString();
    }

}

/**
* @ClassName: GenercisDemo27
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月17日
*
*/

public class GenercisDemo27 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Info<Integer> i = fun(30);
        System.out.println(i.getVar());
    }

    /**
    * @Title: fun
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param @param i
    * @param @return    参数
    * @return Info<Integer>    返回类型
    * @throws
    */

    public static <T extends Number> Info<T> fun(T param) {
        Info<T> temp = new Info<T>();
        temp.setVar(param);
        return temp;
    }

}
