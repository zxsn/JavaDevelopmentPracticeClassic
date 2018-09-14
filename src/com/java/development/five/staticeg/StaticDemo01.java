/** 
 * projectName:Java开发实战经典 
 * fileName:StaticDemo01.java 
 * packageName:com.java.development.five.staticeg 
 * date:2018年9月14日上午11:42:50 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.staticeg;

/**   
 * @title: StaticDemo01.java 
 * @package com.java.development.five.staticeg 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月14日 上午11:42:50 
 * @version: V1.0   
*/
class Person1 {
    String name;
    int    age;
    String country = "A城";

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info() {
        System.out.println("姓名：" + this.name + "，年龄：" + this.age + "，城市：" + this.country);
    }
}

public class StaticDemo01 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月14日 上午11:42:50
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Person1 p1 = new Person1("张三", 30);
        Person1 p2 = new Person1("李四", 31);
        Person1 p3 = new Person1("王五", 32);
        p1.info();
        p2.info();
        p3.info();

    }

}
