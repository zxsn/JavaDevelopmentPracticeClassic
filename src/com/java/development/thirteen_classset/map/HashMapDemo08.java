package com.java.development.thirteen_classset.map;

import java.util.HashMap;
import java.util.Map;

/*
 * 
    * @ClassName: HashMapDemo08
    * @Description: 声明Person对象->String映射
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class HashMapDemo08 {
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
			if(!(obj instanceof Person)) {
				return false;
			}
			Person per = (Person) obj;
			if (this.name.equals(per.name) && this.age == per.age) {
				return true;
			}else {
				return false;
			}
		}

		public int hashCode() {// 覆写hashCode()方法
			return this.name.hashCode() * this.age;// 计算公式
		}
		public String toString() {
			return "姓名：" + this.name + "；年龄：" + this.age;
		}
	}
	public static void main(String[] args) {
		HashMapDemo08 hmd = new HashMapDemo08();
		Map<Person, String> map = null;// 声明Map对象
		map = new HashMap<Person, String>();// 实例化Map对象
		// Person per = hmd.new Person("贾利鑫", 25);
		map.put(hmd.new Person("贾利鑫", 25), "jialixin");// 增加内容，此处可以使用匿名对象
		System.out.println(map.get(hmd.new Person("贾利鑫", 25)));// 查找内容
	}

}
