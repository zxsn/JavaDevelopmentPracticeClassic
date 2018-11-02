package com.java.development.fiveteen_reflection.demo;

/*
 * 
    * @ClassName: GetSuperClassDemo
    * @Description: 取得父类
    * @author Administrator
    * @date 2018年11月11日
    *
 */
public class GetSuperClassDemo {

	public static void main(String[] args) {
		Class<?> c1 = null;// 声明Class对象
		try {
			c1 = Class.forName("com.java.development.fiveteen_reflection.demo.Person");// 实例化Class对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class<?> c2 = c1.getSuperclass();// 取得父类
		System.out.println("父类名称：" + c2.getName());
	}

}
