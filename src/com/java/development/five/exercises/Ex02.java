/** 
 * projectName:Java开发实战经典 
 * fileName:Ex02.java 
 * packageName:com.java.development.five.exercises 
 * date:2018年9月17日下午6:35:40 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.exercises;

/**   
 * @title: Ex02.java 
 * @package com.java.development.five.exercises 
 * @description: TODO定义并测试一个代表员工的Employee类。员工属性包括“编号”，“姓名”，“基本薪水”，“薪水增长额”，还包括计算薪水增长额以及计算增长后的工资总额的操作方法。
 * @author: zxsn
 * @date: 2018年9月17日 下午6:35:40 
 * @version: V1.0   
*/
class Employee {
    private String eno;    //编号
    private String ename;  //姓名
    private float  esalary;//基本薪水
    private float  time;   //工作时间

    public Employee(String eno, String ename, float esalary, float time) {
        super();
        this.eno = eno;
        this.ename = ename;
        this.esalary = esalary;
        this.time = time;
    }

    public String getEno() {
        return eno;
    }

    public void setEno(String eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public float getEsalary() {
        return esalary;
    }

    public void setEsalary(int esalary) {
        this.esalary = esalary;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "[编号：" + eno + ", 姓名：" + ename + ", 基本薪水：" + esalary + ", 工作年限：" + time + "]";
    }

    public void inctell(float time) {//计算增长额
        System.out.println("增长额 = " + "工作年限*200");
        System.out.println("增长额为：" + time * 200);
    }

    public void total(float esalary, float time) {
        System.out.println("工资总额 = " + "基本薪水+工作年限*200");
        System.out.println("工资总额为：" + (esalary + time * 200));
    }

}

public class Ex02 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午6:35:40
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Employee e = new Employee("001", "贾利鑫", 5000f, 5f);
        System.out.println("员工信息如下：" + e);
        e.inctell(e.getTime());
        e.total(e.getEsalary(), e.getTime());

    }

}
