
/**  
* @Title: Info.java
* @Package com.java.development.ten_generics.security_warning
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月18日
* @version V1.0  
*/

package com.java.development.ten_generics.security_warning;

/**
* @ClassName: Info
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月18日
*
*/
public class Info<T> {
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
