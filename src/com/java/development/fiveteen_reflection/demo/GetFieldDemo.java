package com.java.development.fiveteen_reflection.demo;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
 * 
    * @ClassName: GetFieldDemo
    * @Description: 取得Person类中的属性
    * @author Administrator
    * @date 2018年11月11日
    *
 */
public class GetFieldDemo {

	public static void main(String[] args) {
		Class<?> c1 = null;// 声明Class对象
		try {
			c1 = Class.forName("com.java.development.fiveteen_reflection.demo.Person");// 实例化Class对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		{// 普通代码块
			Field f[] = c1.getDeclaredFields();// 得到本类属性
			for (int i = 0; i < f.length; i++) {// 循环输出
				Class<?> r = f[i].getType();// 取得属性的类型
				System.out.print("本类属性：");
				int mo = f[i].getModifiers();// 得到修饰符数字
				System.out.print(Modifier.toString(mo) + " ");// 还原修饰符
				System.out.print(r.getName() + " ");// 输出属性类型
				System.out.print(f[i].getName());// 输出属性名称
				System.out.println(";");// 输出“;”
			}
		}
		System.out.println("-----------------------------");
		{// 普通代码块
			Field f[] = c1.getFields();// 得到父类公共属性
			for (int i = 0; i < f.length; i++) {// 循环输出
				Class<?> r = f[i].getType();// 取得属性的类型
				System.out.print("公共属性：");
				int mo = f[i].getModifiers();// 得到修饰符数字
				System.out.print(Modifier.toString(mo) + " ");// 还原修饰符
				System.out.print(r.getName() + " ");// 输出属性类型
				System.out.print(f[i].getName());// 输出属性名称
				System.out.println(";");// 输出“;”
			}
		}
	}

}
