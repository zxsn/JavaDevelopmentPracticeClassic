package com.java.development.thirteen_classset.list.arraylist;

import java.util.ArrayList;
import java.util.List;

/*
 * 
    * @ClassName: ArrayListDemo02
    * @Description:删除对象
    * @author Administrator
    * @date 2018年11月4日
    *
 */
public class ArrayListDemo02 {

	public static void main(String[] args) {
		List<String> allList = null;//声明List对象
		allList = new ArrayList<String>();//实例化List对象，只能是String类型
		allList.add("Hello");//增加元素
		allList.add(0,"World");//增加元素
		allList.add("MLDN");//增加元素
		allList.add("www.mldn.cn");//增加元素
		allList.remove(0);//删除指定位置的元素
		allList.remove("Hello");//删除指定内容的元素
		System.out.println(allList);//输出对象，调用toString()方法
	}

}
