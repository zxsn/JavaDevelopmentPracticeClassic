package com.java.development.thirteen_classset.list.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * 
    * @ClassName: ArrayListDemo01
    * @Description: 验证增加数据的操作
    * @author Administrator
    * @date 2018年11月4日
    *
 */
public class ArrayListDemo01 {
	public static void main(String[] args) {
		List<String> allList = null;//定义List对象
		Collection<String> allCollection = null;//定义Collection对象
		allList = new ArrayList<String>();//实例化List对象，只能是String类型
		allCollection = new ArrayList<String>();//实例化Collection对象，只能是String类型
		allList.add("Hello");//从Collection继承的方法
		allList.add(0, "World");//此方法为List扩充的方法
		System.out.println(allList);//输出集合中的内容
		allCollection.add("LXH");//增加数据
		allCollection.add("www.mldn.cn");//增加数据
		allList.addAll(allCollection);//从Collection继承的方法，增加一组对象
		allList.addAll(0, allCollection);//此方法List自定义的，增加一组对象
		System.out.println(allList);//输出对象，调用toString()方法
	}

}
