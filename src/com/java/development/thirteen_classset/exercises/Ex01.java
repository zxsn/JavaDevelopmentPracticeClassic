package com.java.development.thirteen_classset.exercises;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 
    * @ClassName: Ex01
    * @Description: 编写学生类，该类定义了3个属性：学号、姓名、成绩。
         * 可以通过构造方法设置3个属性的内容，并覆写Object类中的toString()方法，
         * 在List集合中加入5个学生对象，并将内容输出，之后使用比较器将对象的内容
         * 进行排序并显示在屏幕上
    * @author Administrator
    * @date 2018年11月6日
    *
 */
public class Ex01 {
	public class Student implements Comparable<Student> {
		private int stNo;
		private String name;
		private float score;

		public Student(int stNo, String name, float score) {
			this.stNo = stNo;
			this.name = name;
			this.score = score;
		}

		public int getStNo() {
			return stNo;
		}

		public void setStNo(int stNo) {
			this.stNo = stNo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getScore() {
			return score;
		}

		public void setScore(float score) {
			this.score = score;
		}

		public String toString() {
			return "学号：" + this.stNo + "；姓名：" + this.name + "；成绩：" + this.score;
		}
		@Override
		public int compareTo(Student stu) {
			if (this.score > stu.score) {// 按成绩由高到低排序
				return -1;
			} else if (this.score < stu.score) {
				return 1;
			} else {
				// 某个属性没有进行比较指定的话，则会认为是同一个对象
				return this.name.compareTo(stu.name);
			}
		}

	}
	public static void main(String[] args) {
		Ex01 e1 = new Ex01();
		Set<Student> allSet = new TreeSet<Student>();//实例化Set接口对象
		allSet.add(e1.new Student(1, "张三", 96.5f));
		allSet.add(e1.new Student(2, "李四", 93.5f));
		allSet.add(e1.new Student(3, "王五", 97.5f));
		allSet.add(e1.new Student(4, "赵六", 98.5f));
		allSet.add(e1.new Student(5, "孙七", 96.5f));
		Iterator<Student> iter = allSet.iterator();// 实例化Iterator对象
		System.out.println("按成绩由高到低输出：");
		while (iter.hasNext()) {
			Student stu = iter.next();
			System.out.println(stu);
		}
	}

}
