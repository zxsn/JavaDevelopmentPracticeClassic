package com.java.development.thirteen_classset.set.repeat;

import java.util.HashSet;
import java.util.Set;

/*
 * 
    * @ClassName: RepeatDemo02
    * @Description: 去掉重复元素
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class RepeatDemo02 {
	public class Person {
		private String name;
		private int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public boolean equals(Object obj) {// 覆写equals()方法
			if (this == obj) {
				return true;
			}
			if (!(obj instanceof Person)) {
				return false;
			}
			Person p = (Person) obj;
			if (this.name.equals(p.name) && this.age == p.age) {
				return true;
			} else {
				return false;
			}

		}

		public int hashCode() {// 覆写hashCode()方法
			return this.name.hashCode() * this.age;

		}
		public String toString() {
			return "姓名：" + this.name + "；年龄：" + this.age;
		}
	}
	public static void main(String[] args) {
		RepeatDemo02 pd = new RepeatDemo02();
		Set<Person> allSet = new HashSet<Person>();// 实例化Set接口对象
		allSet.add(pd.new Person("张三", 30));
		allSet.add(pd.new Person("李四", 31));
		allSet.add(pd.new Person("王五", 32));
		allSet.add(pd.new Person("王五", 32));
		allSet.add(pd.new Person("王五", 32));
		allSet.add(pd.new Person("赵六", 33));
		allSet.add(pd.new Person("孙七", 33));
		System.out.println(allSet);// 输出集合，调用toString()
	}

}
