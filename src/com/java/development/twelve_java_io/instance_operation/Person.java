
/**  
* @Title: Person.java
* @Package com.java.development.twelve_java_io.serializable
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月29日
* @version V1.0  
*/

package com.java.development.twelve_java_io.instance_operation;

import java.io.Serializable;

/**
    * @ClassName: Person
    * @Description: 定义可序列话的类
    * @author Administrator
    * @date 2018年10月29日
    *
    */

public class Person implements Serializable {

    /**
    * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
    */

    private static final long serialVersionUID = 1L;
    private String            name;
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

    /**
    * @return name
    */

    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
    * @return age
    */

    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名：" + this.name + "；年龄：" + this.age;
    }

}
