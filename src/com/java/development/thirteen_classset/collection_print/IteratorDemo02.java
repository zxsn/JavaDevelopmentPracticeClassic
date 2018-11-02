package com.java.development.thirteen_classset.collection_print;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 
    * @ClassName: IteratorDemo02
    * @Description：Iterator：删除指定元素
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class IteratorDemo02 {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();// 实例化List接口
		all.add("hello");// 增加元素
		all.add("_");// 增加元素
		all.add("world");// 增加元素
		Iterator<String> iter = all.iterator();// 直接实例化Iterator接口
		int i = 0;// 计数
		int num = 0;// 删除统计
		while (iter.hasNext()) {
			String str = iter.next();// 取出内容
			if ("_".equals(str)) {// 判断内容是否为“_”
				iter.remove();// 删除当前元素
				num++;
				continue;// 跳出当前循环
			}
			System.out.print(i < all.size() - num - 1 ? str + "、" : str);
			i++;
		}
		System.out.println("\n删除之后的集合：" + all);
	}

}
