package com.java.development.fiveteen_reflection.demo;

import java.lang.reflect.Constructor;

/*
 * 
    * @ClassName: GetConstructorDemo01
    * @Description: 取得Person类中的全部构造方法
    * @author Administrator
    * @date 2018年11月11日
    *
 */
public class GetConstructorDemo01 {

	public static void main(String[] args) {
		Class<?> c1 = null;// 声明Class对象
		try {
			c1 = Class.forName("com.java.development.fiveteen_reflection.demo.Person");// 实例化Class对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Constructor<?>[] c = c1.getConstructors();// 得到全部构造
		for (int i = 0; i < c.length; i++) {
			System.out.println("Person中的构造方法：" + c[i]);
		}
	}

}
