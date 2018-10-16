
/**  
* @Title: Point.java
* @Package com.java.development.ten_generics.ok
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月16日
* @version V1.0  
*/

package com.java.development.ten_generics.application;

/**
* @ClassName: Point
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月16日
*
*/

public class Point<T> {
    private T var;

    /**
     * 创建一个新的实例 Point.
     *
     */

    public Point() {
        super();
    }

    /**
     * 创建一个新的实例 Point.
     *
     * @param var
     */

    public Point(T var) {
        this.var = var;
    }

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

}
