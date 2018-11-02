package com.java.development.fiveteen_reflection.invoke;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * 
    * @ClassName: InvokeSayHelloDemo
    * @Description: 调用Person中的sayHello()方法
    * @author Administrator
    * @date 2018年11月11日
    *
 */
public class InvokeSayHelloDemo {

	public static void main(String[] args) {
		Class<?> c1 = null;
		try {
			c1 = Class.forName("com.java.development.fiveteen_reflection.invoke.Person");
			Method met = c1.getMethod("sayHello", String.class, int.class);//此方法需要两个参数
			String rv = null;
			//调用方法，必须传递对象实例，同时传递两个参数值
			@SuppressWarnings("deprecation") // 弃用警告
			Person per = (Person) c1.newInstance();
			rv = (String) met.invoke(per, "贾利鑫", 25);
			System.out.println(rv);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
					| InstantiationException|ClassNotFoundException | NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
