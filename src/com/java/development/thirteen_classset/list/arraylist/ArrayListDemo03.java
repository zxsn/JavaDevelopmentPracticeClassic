package com.java.development.thirteen_classset.list.arraylist;

import java.util.ArrayList;
import java.util.List;

/*
 * 
    * @ClassName: ArrayListDemo03
    * @Description: 输出全部元素
    * @author Administrator
    * @date 2018年11月4日
    *
 */
public class ArrayListDemo03 {

	public static void main(String[] args) {
		List<String> allList = null;//定义List接口对象
		allList = new ArrayList<String>();//实例化List对象，只能是String类型
		allList.add("Hello");//增加元素
		allList.add("Hello");//增加元素
		allList.add(0,"World");//增加元素
		allList.add("MLDN");//增加元素
		allList.add("www.mldn.cn");//增加元素
		System.out.print("由前向后输出：");//信息输出
		for(int i = 0; i < allList.size(); i++) {//循环输出集合内容
			System.out.print(i < (allList.size() -1) ? allList.get(i)+"、":allList.get(i));
		}
		System.out.println();
		System.out.print("由后向前输出：");//信息输出
		for(int i = allList.size() - 1; i >= 0; i--) {//循环输出集合内容
			System.out.print(i > 0 ? allList.get(i)+"、":allList.get(i));
		}
	}

}
