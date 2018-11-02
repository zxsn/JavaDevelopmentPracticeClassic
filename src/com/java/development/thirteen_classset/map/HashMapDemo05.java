package com.java.development.thirteen_classset.map;

import java.util.HashMap;
import java.util.Map;

/*
 * 
    * @ClassName: HashMapDemo05
    * @Description: String->Person映射
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class HashMapDemo05 {
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
		HashMapDemo05 hmd = new HashMapDemo05();
		Map<String, Person> map = null;// 声明Map对象
		map = new HashMap<String, Person>();// 实例化Map对象
		map.put("jialixin", hmd.new Person("贾利鑫", 25));// 增加内容
		System.out.println(map.get("jialixin"));// 查找内容
	}

}
