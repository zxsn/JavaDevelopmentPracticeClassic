package com.java.development.thirteen_classset.list.arraylist;

import java.util.ArrayList;
import java.util.List;

/*
 * 
    * @ClassName: ArrayListDemo04
    * @Description: 将集合变为对象数组
    * @author Administrator
    * @date 2018年11月4日
    *
 */
public class ArrayListDemo04 {

	public static void main(String[] args) {
		List<String> allList = null;//声明List对象
		allList = new ArrayList<String>();//实例化List对象，只能是String类型
		allList.add("Hello");//增加元素
		allList.add(0,"World");//增加元素
		allList.add("MLDN");//增加元素
		allList.add("www.mldn.cn");//增加元素
		String str[] = allList.toArray(new String[] {});//指定的泛型类型
		System.out.print("指定数组类型：");//信息输出
		for (int i = 0; i < str.length; i++) {//输出字符串数组中的内容
			System.out.print(i < str.length -1 ? str[i]+"、":str[i]);
		}
		System.out.println();
		System.out.print("返回对象数组：");
		Object obj[] = allList.toArray(); 
		for (int i = 0; i < obj.length; i++) {
			String temp = (String) obj[i];
			System.out.print(i < obj.length -1 ?temp+"、":temp);
		}
	}

}
