package com.java.development.fiveteen_reflection.invoke;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * 
    * @ClassName: InvokeSetGetDemo
    * @Description: 调用setter及getter方法
    * @author Administrator
    * @date 2018年11月11日
    *
 */
public class InvokeSetGetDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Class<?> c1 = null;
		Object obj = null;
		try {
			c1 = Class.forName("com.java.development.fiveteen_reflection.invoke.Person");
			obj = c1.newInstance();// 实例化操作对象
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		setter(obj, "name", "贾利鑫", String.class);// 调用setter方法
		setter(obj, "age", 25, int.class);
		System.out.print("姓名：");
		getter(obj, "name");// 调用getter方法
		System.out.print("年龄：");
		getter(obj, "age");
	}

	private static void getter(Object obj, String att) {
		try {
			Method met = obj.getClass().getMethod("get" + initStr(att));
			System.out.println(met.invoke(obj));
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

	}

	private static void setter(Object obj, String att, Object value, Class<?> type) {
		try {
			Method met = obj.getClass().getMethod("set" + initStr(att), type);// 设置方法参数类型
			met.invoke(obj, value);// 调用方法
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}

	private static String initStr(String old) {// 单词首字母大写
		String str = old.substring(0, 1).toUpperCase() + old.substring(1);
		return str;
	}
	
}
