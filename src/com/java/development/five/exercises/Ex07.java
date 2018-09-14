/** 
 * projectName:Java开发实战经典 
 * fileName:Ex07.java 
 * packageName:com.java.development.five.exercises 
 * date:2018年9月20日下午3:43:45 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.exercises;

/**   
 * @title: Ex07.java 
 * @package com.java.development.five.exercises 
 * @description: TODO5-7 编写一个公司员工类。 
1、数据成员：员工号、姓名、薪水、部门。 
2、方法： 
①利用构造方法设置信息。 
-单参，只传递员工号，则员工姓名：无名氏，薪水：0，部门：未定。 
-双参，传递员工号，姓名，则员工薪水为1000，部门：后勤。 
-4参，传递员工号、姓名、部门、薪水。 
-无参，则均为空值。 
②显示信息。
 * @author: zxsn
 * @date: 2018年9月20日 下午3:43:45 
 * @version: V1.0   
*/
class Employee1 {
    private String no;
    private String name;
    private float  salary;
    private String department;

    public Employee1() {
        super();
    }

    public Employee1(String no) {
        super();
        this.no = no;
        this.name = "无名氏";
        this.salary = 0;
        this.department = "未定";
    }

    public Employee1(String no, String name) {
        super();
        this.no = no;
        this.name = name;
        this.salary = 1000;
        this.department = "后勤";
    }

    public Employee1(String no, String name, float salary, String department) {
        super();
        this.no = no;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void print() {
        System.out.println("员工编号为：" + no);
        System.out.println("员工姓名为：" + name);
        System.out.println("员工薪水为：" + salary);
        System.out.println("员工部门为：" + department);
    }

}

public class Ex07 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月20日 下午3:43:45
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1();
        emp1.print();
        Employee1 emp2 = new Employee1("001");
        emp2.print();
        Employee1 emp3 = new Employee1("002", "张三");
        emp3.print();
        Employee1 emp4 = new Employee1("003", "李四", 3000f, "开发部");
        emp4.print();

    }

}
