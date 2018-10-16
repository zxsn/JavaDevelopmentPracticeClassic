
/**  
* @Title: InfoImpl.java
* @Package com.java.development.ten_generics.generics_interface
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月17日
* @version V1.0  
*/

package com.java.development.ten_generics.generics_interface.way1;

/**
* @ClassName: InfoImpl
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月17日
*
*/

public class InfoImpl<T> implements Info<T> {
    private T var;

    /**
     * 创建一个新的实例 InfoImpl.
     *
     */

    public InfoImpl(T var) {//通过构造方法设置属性的内容
        this.setVar(var);
    }

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

}
