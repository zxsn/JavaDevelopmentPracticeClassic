package com.java.development.thirteen_classset.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * 
    * @ClassName: CollectionsDemo03
    * @Description: 反转内容
    * @author Administrator
    * @date 2018年11月6日
    *
 */
public class CollectionsDemo03 {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		Collections.addAll(all, "MLDN", "LXH", "mldnjava");// 增加内容
		Collections.reverse(all);// 内容反转保存
		Iterator<String> iter = all.iterator();// 实例化Iterator对象
		int i = 0;
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.print(i < all.size() - 1 ? str + "、" : str);
			i++;
		}
	}

}
