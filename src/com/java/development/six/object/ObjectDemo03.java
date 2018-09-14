/** 
 * projectName:Java开发实战经典 
 * fileName:ObjectDemo03.java 
 * packageName:com.java.development.six.object 
 * date:2018年9月27日下午12:35:24 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.object;

/**   
 * @title: ObjectDemo03.java 
 * @package com.java.development.six.object 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月27日 下午12:35:24 
 * @version: V1.0   
*/
class Person2 {
    private String name;
    private int    age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (this == obj) {//比较地址是否相等
            return true;
        }
        if (!(obj instanceof Person2)) {//判断传进来的对象是否是Person2的实例
            return false;

        }
        Person2 per = (Person2) obj;//Object->Person2，向下转型
        if (per.name.equals(this.name) && per.age == this.age) {
            return true;
        } else {
            return false;
        }

    }

    public String toString() {
        return "姓名：" + this.name + "；年龄：" + this.age;

    }
}

public class ObjectDemo03 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月27日 下午12:35:24
     *@param args
     *@throws 
     */
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        Person2 per1 = new Person2("贾利鑫", 25);
        Person2 per2 = new Person2("贾利鑫", 25);
        System.out.println(per1.equals(per2) ? "是同一个人！" : "不是同一个人！");
        System.out.println(per1.equals("hello") ? "是同一个人！" : "不是同一个人！");

    }

}
