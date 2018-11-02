package com.java.development.thirteen_classset.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 
    * @ClassName: TestDemo02
    * @Description: 范例1————一对多关系
    * @author Administrator
    * @date 2018年11月6日
    *
 */
public class TestDemo {
	public class Student {// 定义学生类
		private String name;
		private int age;
		private School school;// 一个学生属于一个学校

		public Student(String name, int age) {// 通过构造设置内容
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

		public School getSchool() {// 返回所在学校
			return school;
		}

		public void setSchool(School school) {// 设置所在学校
			this.school = school;
		}

		public String toString() {
			return "学生姓名：" + this.name + "；学生年龄：" + this.age;
		}
	}

	public class School {// 定义学校类
		private String name;
		private List<Student> allStudents;// 一个学校有多个学生

		public School() {// 无参构造
			this.allStudents = new ArrayList<Student>();// 实例化List集合
		}

		public School(String name) {
			this(); // 调用无参构造
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<Student> getAllStudents() {// 得到全部的学生
			return allStudents;
		}

		public String toString() {
			return "学校名称：" + this.name;
		}
	}
	public static void main(String[] args) {
		TestDemo td = new TestDemo();
		School sch = td.new School("清华大学");
		Student s1 = td.new Student("张三", 21);
		Student s2 = td.new Student("李四", 22);
		Student s3 = td.new Student("王五", 23);
		sch.getAllStudents().add(s1);// 在学校中加入学生
		sch.getAllStudents().add(s2);// 在学校中加入学生
		sch.getAllStudents().add(s3);// 在学校中加入学生
		s1.setSchool(sch);// 一个学生属于一个学校
		s2.setSchool(sch);// 一个学生属于一个学校
		s3.setSchool(sch);// 一个学生属于一个学校
		System.out.println(s1.getSchool());
		// 实例化Iterator对象，用于输出全部的学生信息
		Iterator<Student> iter = sch.getAllStudents().iterator();
		while (iter.hasNext()) {// 迭代输出
			Student stu = iter.next();
			System.out.println("\t|" + stu);
		}
	}

}
