
/**  
* @Title: Ex04.java
* @Package com.java.development.twelve_java_io.exercises
* @Description: 从键盘上输入以下的数据："TOM:89|JERRY:90|TONY:95",
* 数据格式为“姓名：成绩｜姓名：成绩｜姓名：成绩”,
* 对输入的内容按成绩进行排序，并将结果按成绩由高到低排序。
* @author Administrator
* @date 2018年10月31日
* @version V1.0  
*/

package com.java.development.twelve_java_io.exercises;

import java.util.Scanner;

class Student implements Comparable<Student> {
    private String name;
    private float  score;

    /**
     * 创建一个新的实例 Student.
     *
     * @param name
     * @param age
     * @param score
     */

    public Student(String name, float score) {
        this.name = name;
        this.score = score;
    }

    /**
    * @return name
    */

    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
    * @return score
    */

    public float getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */

    public void setScore(float score) {
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
        return name + "\t" + score;
    }

    /* (非 Javadoc)
    * 
    * 
    * @param o
    * @return
    * @see java.lang.Comparable#compareTo(java.lang.Object)
    */

    @Override
    public int compareTo(Student stu) {//覆写comopareTo()方法，实现排序规则的应用
        if (this.score > stu.score) {//成绩由高到低
            return -1;
        } else if (this.score < stu.score) {
            return 1;
        } else {
            return 0;

        }
    }

}

/**
* @ClassName: Ex04
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月31日
*
*/

public class Ex04 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Scanner input = null;
        input = new Scanner(System.in);
        while (true) {
            System.out.println("请输入数据，数据格式为（最少3组）：\n姓名：成绩|姓名：成绩|姓名：成绩|...");
            String str = input.nextLine();
            String regex = "^([\u4e00-\u9fa5]+(\\:|\\：)\\d+\\.?\\d+\\|){2,}([\u4e00-\u9fa5]+(\\:|\\：)\\d+\\.?\\d+)$";
            if (str.matches(regex)) {
                String s[] = str.split("\\|");//按照|拆分
                Student stu[] = new Student[s.length];//创建Student对象数组
                for (int i = 0; i < s.length; i++) {
                    String data[] = s[i].split("\\:|\\：");//按照:拆分
                    stu[i] = new Student(data[0], Float.parseFloat(data[1]));
                }
                java.util.Arrays.sort(stu);//排序
                System.out.println("姓名" + "\t成绩");
                for (Student student : stu) {
                    System.out.println(student);
                }
                break;
            } else
                System.out.println("格式不符合，请重新输入。");
        }
        input.close();
    }

}
