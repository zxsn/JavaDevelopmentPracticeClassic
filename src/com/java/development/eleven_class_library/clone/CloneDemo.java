
/**  
* @Title: CloneDemo.java
* @Package com.java.development.eleven_class_library.clone
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月20日
* @version V1.0  
*/

package com.java.development.eleven_class_library.clone;

class Person implements Cloneable {//必须实现Cloneable接口
    private String name = null;

    /**
     * 创建一个新的实例 Person.
     *
     * @param name
     */

    public Person(String name) {
        this.name = name;
    }

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

    /* 需要子类覆写clone方法
    * 
    * 
    * @return
    * @throws CloneNotSupportedException
    * @see java.lang.Object#clone()
    */

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();//具体的克隆操作由父类完成
    }

    /* (非 Javadoc)
    * 
    * 
    * @return
    * @see java.lang.Object#toString()
    */

    @Override
    public String toString() {
        return "姓名：" + this.getName();
    }

}

/**
* @ClassName: CloneDemo
* @Description:对象的克隆操作
* @author Administrator
* @date 2018年10月20日
*
*/

public class CloneDemo {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        Person p1 = new Person("张三");
        Person p2 = (Person) p1.clone();
        p2.setName("李四");
        System.out.println("原始对象：" + p1);
        System.out.println("克隆之后的对象：" + p2);
    }

}
