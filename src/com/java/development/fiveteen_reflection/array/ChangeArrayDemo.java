package com.java.development.fiveteen_reflection.array;

import java.lang.reflect.Array;

/*
 * 
    * @ClassName: ChangeArrayDemo
    * @Description: 修改数组的大小
    * @author Administrator
    * @date 2018年11月11日
    *
 */
public class ChangeArrayDemo {

	public static void main(String[] args) {
		int temp[] = { 1, 2, 3 };// 声明一个整型数组
		int newTemp[] = (int[]) arrayInc(temp, 5);// 扩大数组长度
		print(newTemp);
		System.out.println("\n--------------------------");
		String t[] = { "lxh", "mldn", "mldnjava" };// 声明一个字符串数组
		String nt[] = (String[]) arrayInc(t, 8);
		print(nt);
	}

	private static void print(Object obj) {
		Class<?> c = obj.getClass();// 通过数组得到Class对象
		if (!c.isArray()) {// 判断对象是否是数组
			return;
		}
		Class<?> arr = c.getComponentType();// 取得数组的Class
		System.out.println(arr.getName() + "数组的长度是：" + Array.getLength(obj));// 输出数组信息
		for (int i = 0; i < Array.getLength(obj); i++) {
			System.out.print(i < Array.getLength(obj) - 1 ? Array.get(obj, i) + "," : Array.get(obj, i));
		}
	}

	private static Object arrayInc(Object obj, int len) {// 修改数组大小
		Class<?> c = obj.getClass();// 通过数组得到Class对象w
		Class<?> arr = c.getComponentType();// 得到数组的Class对象
		Object newO = Array.newInstance(arr, len);// 重新开辟新的数组大小
		int co = Array.getLength(obj);// 取得数组长度
		System.arraycopy(obj, 0, newO, 0, co);// 复制数组内容
		return newO;
	}

}
