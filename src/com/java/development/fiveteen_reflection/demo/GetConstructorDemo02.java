package com.java.development.fiveteen_reflection.demo;

import java.lang.reflect.Constructor;

/*
 * 
    * @ClassName: GetConstructorDemo02
    * @Description: 取得Person类中的全部构造方法（自定义）
    * @author Administrator
    * @date 2018年11月11日
    *
 */
public class GetConstructorDemo02 {

	public static void main(String[] args) {
		Class<?> c1 = null;// 声明Class对象
		try {
			c1 = Class.forName("com.java.development.fiveteen_reflection.demo.Person");// 实例化Class对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Constructor<?>[] con = c1.getConstructors();// 得到全部构造
		for (int i = 0; i < con.length; i++) {
			Class<?> p[] = con[i].getParameterTypes();// 列出构造中的参数类型
			System.out.print("构造方法：");
			System.out.print(con[i].getModifiers() + " ");// 取出权限
			System.out.print(con[i].getName());// 输出构造方法名称
			System.out.print("(");
			for (int j = 0; j < p.length; j++) {
				System.out.print(p[j].getName() + " arg" + i);
				if (j < p.length - 1)// 判断是否要输出“,”
					System.out.print(",");
			}
			System.out.println("){}");// 输出“){}”
		}
	}

}
