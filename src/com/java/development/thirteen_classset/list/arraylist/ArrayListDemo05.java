package com.java.development.thirteen_classset.list.arraylist;

import java.util.ArrayList;
import java.util.List;

/*
 * 
    * @ClassName: ArrayListDemo05
    * @Description:测试其他操作
    * @author Administrator
    * @date 2018年11月4日
    *
 */
public class ArrayListDemo05 {

	public static void main(String[] args) {
		List<String> allList = null;//声明List对象
		allList = new ArrayList<String>();//实例化List对象，只能是String类型
		System.out.println("集合操作前是否为空？"+(allList.isEmpty()?"为空":"不为空"));
		allList.add("Hello");//增加元素
		allList.add(0,"World");//增加元素
		allList.add("MLDN");//增加元素
		allList.add("www.mldn.cn");//增加元素
		System.out.println(allList.contains("Hello")?"\"Hello\"字符串存在！":"\"Hello\"字符串不存在！");
		List<String> allSub = allList.subList(2, 3);//取出里面的部分集合
		System.out.print("集合截取：");
		for (int i = 0; i < allSub.size(); i++) {//截取部分集合
			System.out.print(i < allSub.size() - 1?allSub.get(i)+"、":allSub.get(i));
		}
		System.out.println();
		System.out.println("MLDN字符串的位置："+allList.indexOf("MLDN"));
		System.out.println("集合操作后是否为空？"+(allList.isEmpty()?"为空":"不为空"));
		
	}

}
