package com.java.development.thirteen_classset.map;

import java.util.HashMap;
import java.util.Map;

/*
 * 
    * @ClassName: HashMapDemo07
    * @Description: 声明Person对象->String映射
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class HashMapDemo07 {
	public class Person {
		private String name;
		private int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String toString() {
			return "姓名：" + this.name + "；年龄：" + this.age;
		}
	}
	public static void main(String[] args) {
		HashMapDemo07 hmd = new HashMapDemo07();
		Map<Person, String> map = null;// 声明Map对象
		map = new HashMap<Person, String>();// 实例化Map对象
		Person per = hmd.new Person("贾利鑫", 25);
		map.put(per, "jialixin");// 增加内容
		System.out.println(map.get(per));// 查找内容
	}

}
