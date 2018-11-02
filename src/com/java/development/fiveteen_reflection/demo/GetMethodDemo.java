package com.java.development.fiveteen_reflection.demo;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
 * 
    * @ClassName: GetMethodDemo
    * @Description: 取得一个类中的全部方法定义
    * @author Administrator
    * @date 2018年11月11日
    *
 */
public class GetMethodDemo {

	public static void main(String[] args) {
		Class<?> c1 = null;
		try {
			c1 = Class.forName("com.java.development.fiveteen_reflection.demo.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Method m[] = c1.getMethods();// 取得全部方法
		for (int i = 0; i < m.length; i++) {
			Class<?> r = m[i].getReturnType();// 得到方法的返回类型
			Class<?> p[] = m[i].getParameterTypes();// 得到全部的参数类型
			int xx = m[i].getModifiers();// 得到方法的修饰符
			System.out.print(Modifier.toString(xx) + " ");// 还原修饰符
			System.out.print(r.getName() + " ");// 输出返回值类型名称
			System.out.print(m[i].getName() + " ");// 输出方法名称
			System.out.print("(");// 输出“(”
			for (int x = 0; x < p.length; x++) {// 循环输出参数
				System.out.print(p[x].getName() + " " + "age" + x);
				if (x < p.length - 1)// 判断是否输出“,”
					System.out.print(",");// 输出“,”
			}
			Class<?> ex[] = m[i].getExceptionTypes();// 得到全部异常抛出
			if (ex.length > 0) {// 判断是否有异常
				System.out.print(") throws ");// 输出“) throws ”
			} else {
				System.out.print(")");// 输出“)”
			}
			for (int j = 0; j < ex.length; j++) {
				System.out.print(ex[j].getName());// 输出异常信息名称
				if (j < ex.length - 1)// 判断是否输出“,”
					System.out.print(",");
			}
			System.out.println();// 换行
		}
	}

}
