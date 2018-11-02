package com.java.development.fiveteen_reflection.invoke;

interface China {
	public static final String NATIONAL = "China";// 定义全局常量
	public static final String AUTHOR = "贾利鑫";// 定义全局常量

	public void sayChina();// 定义无参的抽象方法

	public String sayHello(String name, int age);
}

public class Person implements China {
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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
	public void sayChina() {
		System.out.println("作者：" + AUTHOR + "；国籍:" + NATIONAL);

	}

	@Override
	public String sayHello(String name, int age) {
		return name + "，你好！我今年" + age + "岁了！";
	}

}
