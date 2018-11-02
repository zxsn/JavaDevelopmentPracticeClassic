package com.java.development.thirteen_classset.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 
    * @ClassName: TestMore
    * @Description: 范例2————多对多关系
    * @author Administrator
    * @date 2018年11月6日
    *
 */
public class TestMore {
	public class Student {// 定义学生类
		private String name;
		private int age;
		private List<Course> allCourses;// 定义集合保存全部课程

		public Student() {// 无参构造
			this.allCourses = new ArrayList<Course>();// 实例化List集合
		}

		public Student(String name, int age) {// 通过构造设置属性内容
			this();// 调用无参构造
			this.name = name;
			this.age = age;
		}

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

		public List<Course> getAllCourses() {// 取得全部课程
			return allCourses;
		}

		public String toString() {// 覆写toString()方法
			return "学生姓名：" + this.name + "；年龄：" + this.age;
		}
	}

	public class Course {// 定义课程类
		private String name;
		private int credit;// 学分
		private List<Student> allStudents;// 定义集合保存多个学生

		public Course() {// 无参构造
			this.allStudents = new ArrayList<Student>();
		}

		public Course(String name, int credit) {
			this();// 调用无参构造
			this.name = name;
			this.credit = credit;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getCredit() {
			return credit;
		}

		public void setCredit(int credit) {
			this.credit = credit;
		}

		public List<Student> getAllStudents() {// 取得全部学生
			return allStudents;
		}

		public String toString() {// 覆写toString()方法
			return "课程名称：" + this.name + "；学分：" + this.credit;
		}
	}
	public static void main(String[] args) {
		TestMore tm = new TestMore();
		Course c1 = tm.new Course("英语", 3);
		Course c2 = tm.new Course("计算机", 5);
		Student s1 = tm.new Student("张三", 20);
		Student s2 = tm.new Student("李四", 21);
		Student s3 = tm.new Student("王五", 22);
		Student s4 = tm.new Student("赵六", 23);
		Student s5 = tm.new Student("孙七", 24);
		Student s6 = tm.new Student("钱八", 25);
		// 第一门课程有三人参加，向课程中增加三个学生的信息，同时向学生中增加课程信息
		c1.getAllStudents().add(s1);// 向课程中增加学生信息
		c1.getAllStudents().add(s2);// 向课程中增加学生信息
		c1.getAllStudents().add(s6);// 向课程中增加学生信息
		s1.getAllCourses().add(c1);// 向学生中增加课程信息
		s2.getAllCourses().add(c1);// 向学生中增加课程信息
		s6.getAllCourses().add(c1);// 向学生中增加课程信息
		// 第二门课程中有六人参加，向课程中增加三个学生信息，同时向学生中增加课程信息
		c2.getAllStudents().add(s1);// 向课程中增加学生信息
		c2.getAllStudents().add(s2);// 向课程中增加学生信息
		c2.getAllStudents().add(s3);// 向课程中增加学生信息
		c2.getAllStudents().add(s4);// 向课程中增加学生信息
		c2.getAllStudents().add(s5);// 向课程中增加学生信息
		c2.getAllStudents().add(s6);// 向课程中增加学生信息
		s1.getAllCourses().add(c2);// 向学生中增加课程信息
		s2.getAllCourses().add(c2);// 向学生中增加课程信息
		s3.getAllCourses().add(c2);// 向学生中增加课程信息
		s4.getAllCourses().add(c2);// 向学生中增加课程信息
		s5.getAllCourses().add(c2);// 向学生中增加课程信息
		s6.getAllCourses().add(c2);// 向学生中增加课程信息
		// 输出一门课程的信息，观察一门课程有多少个学生参加
		System.out.println(c1);// 输出第一门课程信息
		Iterator<Student> iter1 = c1.getAllStudents().iterator();// 实例化Iterator对象
		while (iter1.hasNext()) {
			Student stu = iter1.next();
			System.out.println("\t|" + stu);
		}
		//输出一个学生参加的课程信息，观察有多少门课程
		System.out.println(s6);//输出学生信息
		Iterator<Course> iter2 = s6.getAllCourses().iterator();//实例化Iterator对象
		while (iter2.hasNext()) {
			Course c = iter2.next();
			System.out.println("\t|" + c);
		}
	}

}
