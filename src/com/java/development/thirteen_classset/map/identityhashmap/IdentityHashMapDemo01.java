package com.java.development.thirteen_classset.map.identityhashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 
    * @ClassName: IdentityHashMapDemo01
    * @Description: Map中的key不允许重复，重复就是覆盖
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class IdentityHashMapDemo01 {
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
			Person per = (Person) obj;
			if (this.name.equals(per.name) && this.age == per.age) {
				return true;
			} else {
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
		IdentityHashMapDemo01 hmd = new IdentityHashMapDemo01();
		Map<Person, String> map = null;// 声明Map对象
		map = new HashMap<Person, String>();// 实例化Map对象
		map.put(hmd.new Person("贾利鑫", 25), "jialixin_1");// 增加内容，此处可以使用匿名对象
		map.put(hmd.new Person("贾利鑫", 25), "jialixin_2");// 增加内容，key重复
		map.put(hmd.new Person("杨幂", 33), "yangmi");// 增加内容
		Set<Map.Entry<Person, String>> allSet = null;// 声明一个Set集合
		allSet = map.entrySet();// 将Map接口实例化为Set接口实例
		Iterator<Map.Entry<Person, String>> iter = null;// 声明Iterator对象
		iter = allSet.iterator();//实例化Iterator对象 
		while(iter.hasNext()) {
			Map.Entry<Person, String> me = iter.next();// 每个对象都是Map.Entry实例
			System.out.println(me.getKey() + "-->" + me.getValue());
		}
	}

}
