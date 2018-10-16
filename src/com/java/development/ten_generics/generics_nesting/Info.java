
/**  
* @Title: Info.java
* @Package com.java.development.ten_generics.generics_nesting
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月18日
* @version V1.0  
*/

package com.java.development.ten_generics.generics_nesting;

/**
* @ClassName: Info
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月18日
*
*/

public class Info<T, V> {//指定两个泛型类型
    private T var;
    private V value;

    public Info(T var, V value) {
        this.setVar(var);
        this.setValue(value);
    }

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}
