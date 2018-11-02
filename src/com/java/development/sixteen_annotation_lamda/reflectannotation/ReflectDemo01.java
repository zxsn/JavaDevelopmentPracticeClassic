package com.java.development.sixteen_annotation_lamda.reflectannotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/*
 * 
    * @ClassName: ReflectDemo01
    * @Description: 使用反射机制取得全部的Annotation
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class ReflectDemo01 {
	public class SimpleBeanOne {// 定义一个简单类
		@SuppressWarnings({}) // 使用@SuppressWarnings的Annotation
		@Deprecated // 使用@Deprecated的Annotation
		@Override // 使用@Override的Annotation
		public String toString() {// 覆写toString()方法
			return "Hello,Jia Lixin!!!";
		}
	}
	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName(
					"com.java.development.sixteen_annotation_lamda.reflectannotation.ReflectDemo01$SimpleBeanOne");
			Method toM = c.getMethod("toString");// 取得toString()方法
			Annotation an[] = toM.getAnnotations();// 取得全部的Annotation
			for (Annotation a : an) {
				System.out.println(a);// 取得输出信息
			}
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

	}

}
