package com.java.development.sixteen_annotation_lamda.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/*
 * 
    * @ClassName: Ex02
    * @Description: 定义一个可以用来接收用户登录信息的Annotation。
    * 				其中用户名和密码要求通过Annotation设置到验证的方法中，如下所示：
    * 				@LoginInfo(name="用户名",password="密码")
    * 				public boolean login(String name,String password){}
    * 				之后编写程序由键盘输入用户的登录信息，并通过login()方法判断输入的用户名和密码是否正确
    * @author Administrator
    * @date 2018年11月12日
    *
 */

public class Ex02 {
	@Retention(RetentionPolicy.RUNTIME)
	@LoginInfo
	@interface LoginInfo {// 自定义Annotation
		public String name() default "java";

		public String password() default "mldn";
	}

	public static class Verify {// 验证类
		@LoginInfo
		public boolean login(String n, String p) {
			Class<?> c = null;
			try {
				c = Class.forName("com.java.development.sixteen_annotation_lamda.exercises.Ex02$Verify");
				Method toM = c.getMethod("login", String.class, String.class);// 取得login()方法
				if (toM.isAnnotationPresent(LoginInfo.class)) {
					LoginInfo l = null;// 声明自定义的Annotation对象
					// 取得自定义的Annotation
					l = toM.getAnnotation(LoginInfo.class);
					String name = l.name();
					String password = l.password();
					if (name.equals(n) && password.equals(p)) {
						return true;
					}
				}
			} catch (ClassNotFoundException | NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
			return false;

		}
	}

	public static void main(String[] args) {
		BufferedReader buf = null;
		buf = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				System.out.print("请输入用户名：");
				String name = buf.readLine();
				System.out.print("请输入密码：");
				String password = buf.readLine();
				Verify v = new Verify();
				if (v.login(name, password)) {
					System.out.println("登录成功！");
					break;
				} else {
					System.out.println("登录失败！");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
