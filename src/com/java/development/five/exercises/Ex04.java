/** 
 * projectName:Java开发实战经典 
 * fileName:Ex04.java 
 * packageName:com.java.development.five.exercises 
 * date:2018年9月17日下午7:33:44 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.exercises;

/**   
 * @title: Ex04.java 
 * @package com.java.development.five.exercises 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月17日 下午7:33:44 
 * @version: V1.0   
*/
class Dog {
    private String name;
    private String color;
    private int    age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     *@title print 
     *@description: TODO设计一个Dog类，有名字、颜色、年龄等属性，定义构造方法来初始化类的这些属性，定义方法输出Dog信息。编写应用程序使用Dog类。
     *@author: zxsn
     *@date: 2018年9月19日 下午5:41:35
     *@throws 
     */
    public void print() {
        System.out.println("小狗的名字叫：" + this.name + "，它是" + this.color + "的，今年" + this.age + "岁了。");

    }

}

public class Ex04 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午7:33:44
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Dog d = new Dog("小白", "白色", 3);
        d.print();
    }

}
