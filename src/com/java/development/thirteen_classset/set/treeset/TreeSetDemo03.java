package com.java.development.thirteen_classset.set.treeset;

import java.util.Set;
import java.util.TreeSet;

/*
 * 
    * @ClassName: TreeSetDemo03
    * @Description: 指定排序规则
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class TreeSetDemo03 {
	public class Person implements Comparable<Person> {// 定义Person类
		private String name;// 定义name属性
		private int age;// 定义age属性

		public Person(String name, int age) {// 通过构造方法为属性赋值
			this.name = name;
			this.age = age;
		}

		public String toString() {
			return "姓名：" + this.name + "；年龄：" + this.age;
		}

		@Override
		public int compareTo(Person per) {// 覆写compareTo()方法，指定排序规则
			if (this.age > per.age) {
				return 1;
			} else if (this.age < per.age) {
				return -1;
			} else {
				return 0;
			}
		}
	}
	public static void main(String[] args) {
		TreeSetDemo03 tsd = new TreeSetDemo03();
		Set<Person> allSet = new TreeSet<Person>();// 实例化Set集合，类型为Person
		allSet.add(tsd.new Person("张三", 30));
		allSet.add(tsd.new Person("李四", 31));
		allSet.add(tsd.new Person("王五", 32));
		allSet.add(tsd.new Person("王五", 32));// 重复元素，不能增加
		allSet.add(tsd.new Person("王五", 32));// 重复元素，不能增加
		allSet.add(tsd.new Person("赵六", 33));
		allSet.add(tsd.new Person("孙七", 33));
		System.out.println(allSet);// 输出集合内容
	}

}
