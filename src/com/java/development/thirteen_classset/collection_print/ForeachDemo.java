package com.java.development.thirteen_classset.collection_print;

import java.util.ArrayList;
import java.util.List;

/*
 * 
    * @ClassName: ForeachDemo
    * @Description: 使用foreach输出
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class ForeachDemo {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();// 实例化List对象
		all.add("hello");
		all.add("_");
		all.add("world");
		int i = 0;
		for (String str : all) {
			System.out.print(i < all.size() - 1 ? str + "、" : str);
			i++;
		}
	}

}
