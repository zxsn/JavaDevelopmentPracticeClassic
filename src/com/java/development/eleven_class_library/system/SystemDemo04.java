
/**  
* @Title: SystemDemo05.java
* @Package com.java.development.eleven_class_library.system
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月19日
* @version V1.0  
*/

package com.java.development.eleven_class_library.system;

class Person {
    private String name;
    private int    age;

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
        return "姓名：" + this.name + "，年龄：" + this.age;
    }

    /* (非 Javadoc)
    * 
    * 
    * @throws Throwable
    * @deprecated
    * @see java.lang.Object#finalize()
    */

    @Override
    protected void finalize() throws Throwable {//对象释放空间时默认调用此函数
        System.out.println("对象被释放 --> " + this);//直接打印对象调用toString
    }

}

/**
* @ClassName: SystemDemo05
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月19日
*
*/

public class SystemDemo04 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Person per = new Person("贾利鑫", 25);
        per = null;//断开引用，释放空间
        System.gc();//强制性释放空间
    }

}
