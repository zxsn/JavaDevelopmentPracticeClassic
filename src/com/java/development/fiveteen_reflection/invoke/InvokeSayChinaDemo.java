package com.java.development.fiveteen_reflection.invoke;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * 
    * @ClassName: InvokeSayChinaDemo
    * @Description: 调用Person类中的sayChina()方法
    * @author Administrator
    * @date 2018年11月11日
    *
 */
public class InvokeSayChinaDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Class<?> c1 = null;
		try {
			c1 = Class.forName("com.java.development.fiveteen_reflection.invoke.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Method met = c1.getMethod("sayChina");//实例化Method对象，此方法没有参数
			met.invoke(c1.newInstance());// 调用方法，必须传递对象实例
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| InstantiationException | NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}

}
