package com.java.development.thirteen_classset.collection_print;

import java.util.Enumeration;
import java.util.Vector;

/*
 * 
    * @ClassName: EnumerationDemo
    * @Description: 使用Enumeration输出
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class EnumerationDemo {

	public static void main(String[] args) {
		Vector<String> all = new Vector<String>();// 实例化Vector对象
		all.add("hello");
		all.add("_");
		all.add("world");
		Enumeration<String> enu = all.elements();// 实例化Enumeration
		int i = 0;
		while (enu.hasMoreElements()) {
			System.out.print(i < all.size() - 1 ? enu.nextElement() + "、" : enu.nextElement());
			i++;
		}
	}

}
