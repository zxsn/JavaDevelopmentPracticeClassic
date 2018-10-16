
/**  
* @Title: Info.java
* @Package com.java.development.ten_generics.toplimit
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月16日
* @version V1.0  
*/

package com.java.development.ten_generics.restricted_generics.lowerlimit;

/**
 * @ClassName : Info
 * @Description : TODO(这里用一句话描述这个类的作用)
 * @author  Administrator
 * @date  2018年10月16日
 */
public class Info<T> {

    /**
    * @Fields var : TODO(用一句话描述这个变量表示什么)
    */

    private T var;

    /**
    * @return var
    */

    public T getVar() {
        return var;
    }

    /**
     * @param var the var to set
     */

    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return this.var.toString();
    }

}