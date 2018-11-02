package com.java.development.fiveteen_reflection.array;

import java.lang.reflect.Array;

/*
 * 
    * @ClassName: ClassArrayDemo
    * @Description: 取得数组信息并修改数组内容
    * @author Administrator
    * @date 2018年11月11日
    *
 */
public class ClassArrayDemo {

	public static void main(String[] args) {
		int temp[] = { 1, 2, 3 };// 声明一个整型数组
		Class<?> c = temp.getClass().getComponentType();// 取得数组的Class对象
		System.out.println("类型：" + c.getName());// 得到数组名称类型
		System.out.println("长度：" + Array.getLength(temp));// 得到数组长度
		System.out.print("数组内容为：[");
		for (int i = 0; i < Array.getLength(temp); i++) {
			System.out
					.print(i < Array.getLength(temp) - 1 ? Array.get(temp, i) + "," : Array.get(temp, i));
		}
		System.out.println("]");
		System.out.println("第一个内容：" + Array.get(temp, 0));// 得到第一个内容
		Array.set(temp, 0, 6);// 修改第一个内容
		System.out.println("第一个内容：" + Array.get(temp, 0));// 得到第一个内容
	}

}
