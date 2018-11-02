package com.java.development.sixteen_annotation_lamda.inherited;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
 * 
    * @ClassName: ReflectInheritedDemo
    * @Description: @Inherited注释的用法
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class ReflectInheritedDemo {
	@Documented
	@Inherited // 此Annotation可以被继承
	@Retention(RetentionPolicy.RUNTIME) // 此Annotation在类执行时依然有效
	public @interface MyInheritedAnnotation {
		public String name();// 定义name变量接收内容
	}

	@MyInheritedAnnotation(name = "贾利鑫") // 使用自定义的Annotation
	public class Person {// 定义Person类

	}

	public class Student extends Person {// 继承Person类

	}
	public static void main(String[] args) {
		// 通过反射取出全部的Annotation
		Class<?> c = null;// 取得Class实例
		try {
			c = Class.forName("com.java.development.sixteen_annotation_lamda.inherited.ReflectInheritedDemo$Student");
			Annotation ann[] = c.getAnnotations();// 取得中的注解
			for (Annotation a : ann) {// 输出全部Annotation
				System.out.println(a);
			}
			if (c.isAnnotationPresent(MyInheritedAnnotation.class)) {
				MyInheritedAnnotation mda = null;// 声明自定义的Annotation对象
				// 取得自定义的Annotation，此Annotation是从父类继承而来
				mda = c.getAnnotation(MyInheritedAnnotation.class);
				String name = mda.name();// 得到自定义Annotation指定变量内容
				System.out.println("name = " + name);// 输出name变量的内容
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
