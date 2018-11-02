package com.java.development.thirteen_classset.collection_print;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 
    * @ClassName: IteratorDemo01
    * @Description：Iterator：迭代输出
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class IteratorDemo01 {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();// 实例化List接口
		all.add("hello");// 增加元素
		all.add("_");// 增加元素
		all.add("world");// 增加元素
		Iterator<String> iter = all.iterator();// 直接实例化Iterator接口
		int i = 0;// 计数
		while (iter.hasNext()) {
			System.out.print(i < all.size() - 1 ? iter.next() + "、" : iter.next());
			i++;
		}
	}

}
