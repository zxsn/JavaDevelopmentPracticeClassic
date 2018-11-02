package com.java.development.thirteen_classset.list.vector;

import java.util.List;
import java.util.Vector;

/*
 * 
    * @ClassName: VectorDemo01
    * @Description: Vector子类
    * @author Administrator
    * @date 2018年11月4日
    *
 */
public class VectorDemo01 {

	public static void main(String[] args) {
		List<String> allList = null;//声明List对象
		allList = new Vector<String>();//实例化List对象，只能是String类型
		allList.add("Hello");//增加元素
		allList.add(0,"World");//增加元素
		allList.add("MLDN");//增加元素
		allList.add("www.mldn.cn");//增加元素
		for (int i = 0; i < allList.size(); i++) {//循环输出
			System.out.print(i < allList.size() - 1?allList.get(i)+"、":allList.get(i));//通过get()取出每一个元素
		}
	}

}
