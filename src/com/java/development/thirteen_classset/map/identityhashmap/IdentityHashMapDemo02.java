package com.java.development.thirteen_classset.map.identityhashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 
    * @ClassName: IdentityHashMapDemo02
    * @Description: 对象可以重复（不覆写equals和hashCode方法）
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class IdentityHashMapDemo02 {
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
		IdentityHashMapDemo02 hmd = new IdentityHashMapDemo02();
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
