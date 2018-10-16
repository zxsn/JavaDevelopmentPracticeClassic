
/**  
* @Title: Person.java
* @Package com.java.development.ten_generics.example
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月18日
* @version V1.0  
*/

package com.java.development.ten_generics.example;

/**
* @ClassName: Person
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月18日
*
*/

public class Person<T extends Info> {
    private T info;

    /**
     * 创建一个新的实例 Person.
     *
     * @param info
     */

    public Person(T info) {
        this.setInfo(info);
    }

    /**
    * @return info
    */

    public T getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */

    public void setInfo(T info) {
        this.info = info;
    }

    /* (非 Javadoc)
    * 
    * 
    * @return
    * @see java.lang.Object#toString()
    */

    @Override
    public String toString() {
        return this.info.toString();
    }

}
