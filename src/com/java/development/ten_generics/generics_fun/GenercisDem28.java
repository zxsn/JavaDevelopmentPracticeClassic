
/**  
* @Title: GenercisDem28.java
* @Package com.java.development.ten_generics.generics_fun
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月17日
* @version V1.0  
*/

package com.java.development.ten_generics.generics_fun;

/**
* @ClassName: GenercisDem28
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月17日
*
*/

public class GenercisDem28 {

    class Info<T> {//内部泛型类
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
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        GenercisDem28 gd = new GenercisDem28();
        Info<String> i1 = gd.new Info<String>();
        Info<String> i2 = gd.new Info<String>();
        i1.setVar("HELLO");
        i2.setVar("贾利鑫");
        add(i1, i2);

    }

    /**
     * @param <T>
    * @Title: add
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param @param i1
    * @param @param i2    参数
    * @return void    返回类型
    * @throws
    */

    public static <T> void add(Info<T> i1, Info<T> i2) {
        System.out.println(i1.getVar() + " " + i2.getVar());

    }

}
