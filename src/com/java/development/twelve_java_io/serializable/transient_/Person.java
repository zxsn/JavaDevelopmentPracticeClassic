
/**  
* @Title: Person.java
* @Package com.java.development.twelve_java_io.serializable.transient_
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月29日
* @version V1.0  
*/

package com.java.development.twelve_java_io.serializable.transient_;

import java.io.Serializable;

/**
    * @ClassName: Person
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月29日
    *
    */

public class Person implements Serializable {

    /**
    * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
    */

    private static final long serialVersionUID = 1L;
    private transient String  name;                 //此属性将不被序列化
    private int               age;

    /**
     * 创建一个新的实例 Person.
     *
     * @param name
     * @param age
     */

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /* (非 Javadoc)
     * 
     * 
     * @return
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "姓名：" + this.name + "；年龄：" + this.age;
    }
}
