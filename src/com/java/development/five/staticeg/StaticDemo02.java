/** 
 * projectName:Java开发实战经典 
 * fileName:StaticDemo01.java 
 * packageName:com.java.development.five.staticeg 
 * date:2018年9月14日上午11:42:50 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.staticeg;

/**   
 * @title: StaticDemo02.java 
 * @package com.java.development.five.staticeg 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月14日 上午11:42:50 
 * @version: V1.0   
*/
class Person2 {
    String        name;
    int           age;
    static String country = "A城"; //使用static定义城市属性，有默认值

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info() {
        System.out.println("姓名：" + this.name + "，年龄：" + this.age + "，城市：" + Person2.country);
    }
}

public class StaticDemo02 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月14日 上午11:42:50
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Person2 p1 = new Person2("张三", 30);
        Person2 p2 = new Person2("李四", 31);
        Person2 p3 = new Person2("王五", 32);
        System.out.println("------------------修改之前-------------------");
        p1.info();
        p2.info();
        p3.info();
        Person2.country = "B城";//此处不合适，类中的公共属性让一个对象修改了。
        System.out.println("------------------修改之后-------------------");
        p1.info();
        p2.info();
        p3.info();

    }

}
