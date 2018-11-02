package com.java.development.thirteen_classset.map;

import java.util.HashMap;
import java.util.Map;

/*
 * 
    * @ClassName: HashMapDemo06
    * @Description: Person->String映射
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class HashMapDemo06 {
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
		HashMapDemo06 hmd = new HashMapDemo06();
		Map<Person, String> map = null;// 声明Map对象
		map = new HashMap<Person, String>();// 实例化Map对象
		map.put(hmd.new Person("贾利鑫", 25), "jialixin");// 增加内容
		System.out.println(map.get(hmd.new Person("贾利鑫", 25)));// 查找内容
	}

}
