package com.java.development.thirteen_classset.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * 
    * @ClassName: CollectionsDemo07
    * @Description: 交换指定位置的元素
    * @author Administrator
    * @date 2018年11月6日
    *
 */
public class CollectionsDemo07 {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		Collections.addAll(all, "1、MLDN", "2、LXH", "3、mldnjava");// 增加内容
		System.out.print("交换之前的集合：");
		Iterator<String> iter = all.iterator();// 实例化Iterator对象
		int i = 0;
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.print(i < all.size() - 1 ? str + "、" : str);
			i++;
		}
		Collections.swap(all, 0, 2);// 交换指定位置的内容
		System.out.print("\n交换之后的集合：");
		iter = all.iterator();// 实例化Iterator对象
		int j = 0;
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.print(j < all.size() - 1 ? str + "、" : str);
			j++;
		}
	}

}
