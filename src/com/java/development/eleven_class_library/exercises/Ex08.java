
/**  
* @Title: Ex08.java
* @Package com.java.development.eleven_class_library.exercises
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月24日
* @version V1.0  
*/

package com.java.development.eleven_class_library.exercises;

/**
* @ClassName: Ex08
* @Description:按照“姓名：年龄：成绩|姓名：年龄：成绩”的格式定义字符串
* “张三：21：98|李四：22：89|王五：20：70”，要求将每组值分别保存在Student对象之中，
* 并对这些对象进行排序，排序的原则为：按照成绩由高到低排序，如果成绩相等，则按照年龄由低到高排序。
* @author Administrator
* @date 2018年10月24日
*
*/
class Student implements Comparable<Student> {
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
    * @return age
    */

    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */

    public void setAge(int age) {
        this.age = age;
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
        return name + "\t" + age + "\t" + score;
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
            if (this.age > stu.age) {//年龄由低到高
                return 1;
            } else if (this.age < stu.age) {
                return -1;
            } else {
                return 0;
            }
        }
    }

}

public class Ex08 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        String str = "张三:20:90.0|李四:22:90.0|王五:20:99.0|赵六:20:70.0|孙七:22:100.0";//题中无法确定是否排序
        String s[] = str.split("\\|");//按照|拆分
        Student stu[] = new Student[s.length];//创建Student对象数组
        for (int i = 0; i < s.length; i++) {
            String data[] = s[i].split("\\:");//按照:拆分
            stu[i] = new Student(data[0], Integer.parseInt(data[1]), Float.parseFloat(data[2]));
        }
        java.util.Arrays.sort(stu);//排序
        System.out.println("姓名" + "\t年龄" + "\t成绩");
        for (Student student : stu) {
            System.out.println(student);
        }
    }

}
