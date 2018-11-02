package com.java.development.sixteen_annotation_lamda.systemannotation;

/*
 * 
    * @ClassName: OverrideAnnotationDemo01
    * @Description: 观察@Override注解的作用
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class OverrideAnnotationDemo01 {
	static class Person {// 定义Person类
		public String getInfo() {// 定义getInfo()方法
			return "这是一个Person类。";
		}
	}

	static class Student extends Person {// 子类继承父类
		@Override // 此处明确的指出方法覆写操作
		public String getInfo() {// 覆写父类的方法
			return "这是一个Student类。";
		}
	}
	public static void main(String[] args) {
		Person per = new Student();// 通过子类实例化父类对象
		System.out.println(per.getInfo());// 输出信息
	}

}
