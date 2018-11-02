package com.java.development.sixteen_annotation_lamda.reflectannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/*
 * 
    * @ClassName: ReflectAnnotationDemo02
    * @Description: 使用反射机制取得指定的Annotation中的内容
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class ReflectAnnotationDemo02 {
	@Retention(RetentionPolicy.RUNTIME) // 此Annotation在类执行时依然有效
	public @interface MyDefaultAnnotationReflect {// 自定义注解
		public String key() default "JLX";// 定义一个key变量

		public String value() default "贾利鑫";
	}

	public class SimpleBeanTwo {
		@SuppressWarnings({}) // 使用@SuppressWarnings的Annotation
		@Deprecated // 使用@Deprecated的Annotation
		@Override // 使用@Override的Annotation
		// 使用自定义的Annotation并设置两个属性内容
		@MyDefaultAnnotationReflect(key = "MLDN", value = "www.mldnjava.cn")
		public String toString() {
			return "Hello,Jia Lixin!!!";
		}
	}
	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName(
					"com.java.development.sixteen_annotation_lamda.reflectannotation.ReflectAnnotationDemo02$SimpleBeanTwo");
			Method toM = c.getMethod("toString");// 取得toString()方法
			if (toM.isAnnotationPresent(MyDefaultAnnotationReflect.class)) {
				MyDefaultAnnotationReflect mda = null;// 声明自定义的Annotation对象
				// 取得自定义的Annotation
				mda = toM.getAnnotation(MyDefaultAnnotationReflect.class);
				String key = mda.key();// 得到Annotation中指定变量的内容
				String value = mda.value();// 得到Annotation中指定变量的内容
				System.out.println("key = " + key);
				System.out.println("value = " + value);
			}
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
