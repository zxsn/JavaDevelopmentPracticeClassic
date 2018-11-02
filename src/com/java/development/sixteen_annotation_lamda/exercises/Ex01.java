package com.java.development.sixteen_annotation_lamda.exercises;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/*
 * 
    * @ClassName: Ex01
    * @Description: 将工厂设计模式使用Annotation进行讲解，
    *  				所有的需要的子类通过注释的形式配置到工厂之中
    * @author Administrator
    * @date 2018年11月12日
    *
 */
interface Fruit {
	public void eat();
}

class Apple implements Fruit {

	@Override
	public void eat() {
		System.out.println("***吃苹果。");
	}

}

class Orange implements Fruit {

	@Override
	public void eat() {
		System.out.println("***吃橘子。");
	}

}

public class Ex01 {

	@Retention(RetentionPolicy.RUNTIME) // 此Annotation在类执行时依然有效
	public @interface MyDefaultAnnotationReflect {// 自定义Annotation
		// 定义一个className变量，并设置默认值
		public String name() default "com.java.development.sixteen_annotation_lamda.exercises.Apple";
	}

	public static class Factory {
		@SuppressWarnings("deprecation")
		@MyDefaultAnnotationReflect(name = "com.java.development.sixteen_annotation_lamda.exercises.Orange")
		public static Fruit getInstance() {
			// 利用反射取得指定Annotation
			Class<?> c = null;
			Fruit c1 = null;
			try {
				c = Class.forName("com.java.development.sixteen_annotation_lamda.exercises.Ex01$Factory");
				Method toM = c.getMethod("getInstance");
				
				if (toM.isAnnotationPresent(MyDefaultAnnotationReflect.class)) {
					MyDefaultAnnotationReflect mda = null;
					mda = toM.getAnnotation(MyDefaultAnnotationReflect.class);// 取得指定的Annotation
					String name = mda.name();// 取得Annotation中的name
					c1 = (Fruit) Class.forName(name).newInstance();
				}
			} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
					| IllegalAccessException e) {
				e.printStackTrace();
			}
			return c1;

		}
	}

	public static void main(String[] args) {
		Fruit f = Factory.getInstance();
		f.eat();
	}
}
