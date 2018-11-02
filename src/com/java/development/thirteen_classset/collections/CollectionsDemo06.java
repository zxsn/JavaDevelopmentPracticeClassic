package com.java.development.thirteen_classset.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * 
    * @ClassName: CollectionsDemo06
    * @Description: 集合排序
    * @author Administrator
    * @date 2018年11月6日
    *
 */
public class CollectionsDemo06 {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		Collections.addAll(all, "1、MLDN", "2、LXH", "X、mldnjava");// 增加内容
		Collections.addAll(all, "B、www.mldn.cn");
		Collections.addAll(all, "A、www.mldnjava.cn");
		System.out.print("排序之前的集合：");
		Iterator<String> iter = all.iterator();// 实例化Iterator对象
		int i = 0;
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.print(i < all.size() - 1 ? str + "、" : str);
			i++;
		}
		Collections.sort(all);// 排序
		System.out.print("\n排序之后的集合：");
		iter = all.iterator();// 实例化Iterator对象
		int j = 0;
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.print(j < all.size() - 1 ? str + "、" : str);
			j++;
		}
	}

}
