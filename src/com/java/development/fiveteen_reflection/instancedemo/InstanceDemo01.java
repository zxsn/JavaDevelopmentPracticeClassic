package com.java.development.fiveteen_reflection.instancedemo;

/*
 * 
    * @ClassName: InstanceDemo01
    * @Description: 通过Clas类实例化对象
    * @author Administrator
    * @date 2018年11月10日
    *
 */
public class InstanceDemo01 {
	public static class Person {
		private String name;
		private int age;

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

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName("com.java.development.fiveteen_reflection.instancedemo.InstanceDemo01$Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Person per = null;
		try {
			per = (Person) c.newInstance();// 实例化Person对象
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		per.setName("贾利鑫");
		per.setAge(25);
		System.out.println(per);
	}

}
