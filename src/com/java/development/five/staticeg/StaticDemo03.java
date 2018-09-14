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
class Person3 {
    private String        name;
    private int           age;
    private static String country = "A城"; //使用static定义城市属性，有默认值

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info() {
        System.out.println("姓名：" + this.name + "，年龄：" + this.age + "，城市：" + Person3.getCountry());
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Person3.country = country;
    }
}

public class StaticDemo03 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月14日 上午11:42:50
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Person3 p1 = new Person3("张三", 30);
        Person3 p2 = new Person3("李四", 31);
        Person3 p3 = new Person3("王五", 32);
        System.out.println("------------------修改之前-------------------");
        p1.info();
        p2.info();
        p3.info();
        Person3.setCountry("B城");
        System.out.println("------------------修改之后-------------------");
        p1.info();
        p2.info();
        p3.info();

    }

}
