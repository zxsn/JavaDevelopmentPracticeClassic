
/**  
* @Title: Person.java
* @Package com.java.development.twelve_java_io.serializable.externalizable
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月29日
* @version V1.0  
*/

package com.java.development.twelve_java_io.serializable.externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
    * @ClassName: Person
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月29日
    *
    */

public class Person implements Externalizable {
    private String name;
    private int    age;

    /**
     * 创建一个新的实例 Person.
     *
     */

    public Person() {//必须定义无参构造
    }

    /* (非 Javadoc)
    * 
    * 
    * @param arg0
    * @throws IOException
    * @throws ClassNotFoundException
    * @see java.io.Externalizable#readExternal(java.io.ObjectInput)
    */

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
        return "姓名：" + name + "；年龄：" + age;
    }

    //覆写此方法，根据需要，读取内容，反序列化时使用
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = (String) in.readObject();//读取姓名属性
        this.age = (int) in.readObject();//读取年龄

    }

    /* (非 Javadoc)
    * 
    * 
    * @param arg0
    * @throws IOException
    * @see java.io.Externalizable#writeExternal(java.io.ObjectOutput)
    */
    //覆写此方法，根据需要，可以保存属性或具体内容，序列化时使用
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.name);//保存姓名属性
        out.writeInt(this.age);//保存年龄属性
    }

}
