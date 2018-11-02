package com.java.development.fiveteen_reflection.instancedemo;

import java.lang.reflect.Constructor;

/*
 * 
    * @ClassName: InstanceDemo03
    * @Description: 调用类中的有参构造
    * @author Administrator
    * @date 2018年11月10日
    *
 */
public class InstanceDemo03 {
	public static class Person {
		private String name;
		private int age;

		public Person(String name, int age) {
			this.setName(name);
			this.setAge(age);
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

		@Override
		public String toString() {
			return "姓名：" + name + ", 年龄：" + age;
		}

	}
	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName("com.java.development.fiveteen_reflection.instancedemo.InstanceDemo03$Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Person per = null;
		Constructor<?> cons[] = null;// 声明一个表示构造方法的数组
		cons = c.getConstructors();// 通过反射，取得全部构造
		try {
			// 因为只有一个构造，所有数组下标为0
			per = (Person) cons[0].newInstance("贾利鑫", 25);// 实例化Person对象（必须存在无参构造方法）
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(per);
	}

}
