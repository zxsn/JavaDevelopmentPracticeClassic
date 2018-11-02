package com.java.development.fiveteen_reflection.demo;

/*
 * 
    * @ClassName: GetInterfaceDemo
    * @Description: 取得实现类的全部接口
    * @author Administrator
    * @date 2018年11月11日
    *
 */
public class GetInterfaceDemo {

	public static void main(String[] args) {
		Class<?> c1 = null;// 声明Class对象
		try {
			c1 = Class.forName("com.java.development.fiveteen_reflection.demo.Person");// 实例化Class对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class<?> c[] = c1.getInterfaces();// 取得实现的全部接口
		for (int i = 0; i < c.length; i++) {
			System.out.println("实现的接口名称：" + c[i].getName());
		}
	}

}
