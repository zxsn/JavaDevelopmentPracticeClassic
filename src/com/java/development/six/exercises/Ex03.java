/** 
 * projectName:Java开发实战经典 
 * fileName:Ex03.java 
 * packageName:com.java.development.six.exercises 
 * date:2018年9月27日下午5:06:53 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.exercises;

/**   
 * @title: Ex03.java 
 * @package com.java.development.six.exercises 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月27日 下午5:06:53 
 * @version: V1.0   
*/
class Person {
    private String name; //姓名
    private String addr; //地址
    private char   sex;  //性别
    private int    age;  //年龄

    public Person() {
    }

    public Person(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    public Person(String name, String addr, char sex, int age) {
        this.name = name;
        this.addr = addr;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddr() {
        return addr;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    String str1 = "姓名：" + this.getName() + "，地址：" + this.getAddr() + "，性别：" + this.getSex() + "，年龄："
                  + this.getAge();

    public void print() { //输出方法
        System.out.println(str1);
    }

}

class Student extends Person {
    private float math;    //数学成绩
    private float english; //英语成绩

    public Student() {
    }

    public Student(float math, float english) {
        this.math = math;
        this.english = english;
    }

    public Student(String name, String addr, char sex, int age, float math, float english) {
        super(name, addr, sex, age);
        this.math = math;
        this.english = english;
    }

    public float getMath() {
        return math;
    }

    public float getEnglish() {
        return english;
    }

    @Override
    public void print() {
        String str2 = str1 + "，数学成绩：" + this.getMath() + "，英语成绩：" + this.getEnglish();
        System.out.println("学生对象：" + str2);
    }

}

public class Ex03 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月27日 下午5:06:53
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Person per1 = new Person();
        Person per2 = new Person("张三", "中国北京市");
        Person per3 = new Person("李四", "美国华盛顿州", '男', 21);

        per1.print();
        per2.print();
        per3.print();

        Student stu1 = new Student();
        Student stu2 = new Student(97f, 73f);
        Student stu3 = new Student("小华", "中国山西省", '女', 19, 86f, 99f);
        stu1.print();
        stu2.print();
        stu3.print();
    }

}
