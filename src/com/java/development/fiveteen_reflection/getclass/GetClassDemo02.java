package com.java.development.fiveteen_reflection.getclass;

/*
 * 
    * @ClassName: GetClassDemo02
    * @Description: 实例化Class类对象
    * @author Administrator
    * @date 2018年11月10日
    *
 */
public class GetClassDemo02 {
	static class X {

	}
	public static void main(String[] args) {
		Class<?> c1 = null;
		Class<?> c2 = null;
		Class<?> c3 = null;
		try {
			c1 = Class.forName("com.java.development.fiveteen_reflection.getclass.GetClassDemo02$X");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		c2 = new X().getClass();// 通过Object类中的方法实例化
		c3 = X.class;// 通过类.Class实例化
		System.out.println("类名称：" + c1.getName());
		System.out.println("类名称：" + c2.getName());
		System.out.println("类名称：" + c3.getName());
	}

}
