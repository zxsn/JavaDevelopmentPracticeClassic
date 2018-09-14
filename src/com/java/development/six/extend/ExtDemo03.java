/** 
 * projectName:Java开发实战经典 
 * fileName:ExtDemo03.java 
 * packageName:com.java.development.six.extend 
 * date:2018年9月20日下午6:43:29 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.extend;

/**   
 * @title: ExtDemo03.java 
 * @package com.java.development.six.extend 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月20日 下午6:43:29 
 * @version: V1.0   
*/
class Person {
    private String name;
    private int    age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

class Student extends Person {
    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

}

public class ExtDemo03 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月20日 下午6:43:29
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("贾利鑫");
        stu.setAge(25);
        stu.setSchool("清华大学");
        System.out
            .println("姓名：" + stu.getName() + "\n年龄：" + stu.getAge() + "\n学校：" + stu.getSchool());

    }

}
