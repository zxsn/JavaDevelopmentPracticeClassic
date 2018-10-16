
/**  
* @Title: ComparableDemo01.java
* @Package com.java.development.eleven_class_library.comparable
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月20日
* @version V1.0  
*/

package com.java.development.eleven_class_library.comparable;

class Student implements Comparable<Student> {//指定类型为Student
    private String name;
    private int    age;
    private float  score;

    /**
     * 创建一个新的实例 Student.
     *
     * @param name
     * @param age
     * @param score
     */

    public Student(String name, int age, float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    /* (非 Javadoc)
    * 
    * 
    * @return
    * @see java.lang.Object#toString()
    */

    @Override
    public String toString() {
        return name + "\t\t" + age + "\t\t" + score;
    }

    /* (非 Javadoc)
     * 
     * 
     * @param o
     * @return
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Student stu) {//覆写compareTo()方法，实现排序规则的应用
        if (this.score > stu.score) {
            return -1;
        } else if (this.score < stu.score) {
            return 1;
        } else {
            if (this.age > stu.age) {
                return 1;
            } else if (this.age < stu.age) {
                return -1;
            } else {
                return 0;
            }
        }
    }

}

/**
* @ClassName: ComparableDemo01
* @Description:使用比较器进行排序操作
* @author Administrator
* @date 2018年10月20日
*
*/

public class ComparableDemo01 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Student stu[] = { new Student("张三", 20, 90.0f), new Student("李四", 22, 90.0f),
                          new Student("王五", 20, 99.0f), new Student("赵六", 20, 70.0f),
                          new Student("孙七", 22, 100.0f) };
        java.util.Arrays.sort(stu);//进行排序
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i]);
        }

    }

}
