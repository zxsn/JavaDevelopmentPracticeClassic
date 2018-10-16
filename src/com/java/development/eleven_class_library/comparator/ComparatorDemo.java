
/**  
* @Title: ComparatorDemo.java
* @Package com.java.development.eleven_class_library.comparator
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月21日
* @version V1.0  
*/

package com.java.development.eleven_class_library.comparator;

class Student {
    private String name;
    private int    age;
    private float  score;

    /**
     * 创建一个新的实例 Student.
     *
     * @param name
     * @param age
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
    * @see java.lang.Object#hashCode()
    */

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    /* (非 Javadoc)
    * 
    * 
    * @param obj
    * @return
    * @see java.lang.Object#equals(java.lang.Object)
    */

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Student))
            return false;
        Student other = (Student) obj;
        if (other.name.equals(this.name) && other.age == this.age && other.score == this.score) {
            return true;
        } else {
            return false;
        }
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

}

/**
* @ClassName: ComparatorDemo
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月21日
*
*/

public class ComparatorDemo {

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
        java.util.Arrays.sort(stu, new StudentComparator());//进行排序
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i]);
        }

    }

}
