package com.java.development.fiveteen_reflection.invoke;

import java.lang.reflect.Field;

/*
 * 
    * @ClassName: InvokeFieldDemo
    * @Description: 直接操作类中的属性
    * @author Administrator
    * @date 2018年11月11日
    *
 */
public class InvokeFieldDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Class<?> c1 = null;
		Object obj = null;
		Field nameField = null;
		Field ageField = null;
		try {
			c1 = Class.forName("com.java.development.fiveteen_reflection.invoke.Person");
			obj = c1.newInstance();// 实例化对象
			nameField = c1.getDeclaredField("name");// 取得name属性
			ageField = c1.getDeclaredField("age");// 取得age属性
			nameField.setAccessible(true);// 将name属性设置成可被外部访问
			ageField.setAccessible(true);// 将age属性设置成可被外部访问
			nameField.set(obj, "贾利鑫");
			ageField.set(obj, 30);
			System.out.println("姓名：" + nameField.get(obj));
			System.out.println("年龄：" + ageField.get(obj));
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchFieldException
				| SecurityException e) {
			e.printStackTrace();
		}
	}

}
