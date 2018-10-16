
/**  
* @Title: Demo.java
* @Package com.java.development.ten_generics.generics_nesting
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月18日
* @version V1.0  
*/

package com.java.development.ten_generics.generics_nesting;

/**
* @ClassName: Demo
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月18日
*
*/

public class Demo<S> {
    private S info;

    public Demo(S info) {
        this.setInfo(info);
    }

    public S getInfo() {
        return info;
    }

    public void setInfo(S info) {
        this.info = info;
    }

}
