/** 
 * projectName:Java开发实战经典 
 * fileName:Ex04.java 
 * packageName:com.java.development.six.exercises 
 * date:2018年9月27日下午7:17:52 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.exercises;

//员工类
class Employees {
    private String name;
    private int    age;
    private char   sex;

    public Employees() {
    }

    public Employees(String name, int age, char sex) {
        this.name = name;//姓名
        this.age = age;//年龄
        this.sex = sex;//性别
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public String toString() {
        return "雇员姓名：" + this.getName() + "，年龄：" + this.getAge() + "，性别：" + this.getSex();
    }
}

//管理层
class Management extends Employees {
    private String job;       //职务
    private float  yearSalary;//年薪

    public Management() {
    }

    public Management(String name, int age, char sex, String job, float yearSalary) {
        super(name, age, sex);
        this.job = job;
        this.yearSalary = yearSalary;
    }

    public String getJob() {
        return job;
    }

    public float getYearSalary() {
        return yearSalary;
    }

    @Override
    public String toString() {
        return super.toString() + "，职务：" + job + "，年薪：" + yearSalary;
    }

}

//职员类
class Staff extends Employees {
    private String department;    //部门
    private float  monthlySalary; //月薪

    public Staff() {
    }

    public Staff(String name, int age, char sex, String department, float monthlySalary) {
        super(name, age, sex);
        this.department = department;
        this.monthlySalary = monthlySalary;
    }

    public String getDepartment() {
        return department;
    }

    public float getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return super.toString() + "，部门：" + department + "，月薪：" + monthlySalary;
    }

}

/**   
 * @title: Ex04.java 
 * @package com.java.development.six.exercises 
 * @description: TODO定义员工类，具有姓名，年龄，性别属性，并具有构造方法，显示数据方法， 
 * 定义管理层类，继承员工类，并有自己的属性：职务，年薪。
 * 定义职员类，继承员工类，并有自己的属性：所属部门，月薪。 
 * @author: zxsn
 * @date: 2018年9月27日 下午7:17:52 
 * @version: V1.0   
*/
public class Ex04 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月27日 下午7:17:52
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Management m = new Management("张三", 26, '男', "总监", 300000f);
        Staff s = new Staff("如花", 24, '女', "业务部", 6000f);
        System.out.println(m);
        System.out.println(s);

    }

}
