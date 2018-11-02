
package com.java.development.thirteen_classset.collection_print;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * 
    * @ClassName: ListIteratorDemo01
    * @Description:进行双向迭代输出
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class ListIteratorDemo01 {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();// 实例化List接口
		all.add("hello");// 增加元素
		all.add("_");// 增加元素
		all.add("world");// 增加元素
		ListIterator<String> iter = all.listIterator();// 实例化ListIterator接口
		System.out.print("由前向后输出：");
		int i = 0;// 计数
		while (iter.hasNext()) {
			String str = iter.next();// 取出内容
			System.out.print(i < all.size() - 1 ? str + "、" : str);
			i++;
		}
		System.out.print("\n由后向前输出：");// 必须先有由前向后的输出
		int j = 0;
		while (iter.hasPrevious()) {
			String str = iter.previous();// 取出内容
			System.out.print(j < all.size() - 1 ? str + "、" : str);
			j++;
		}
	}

}
