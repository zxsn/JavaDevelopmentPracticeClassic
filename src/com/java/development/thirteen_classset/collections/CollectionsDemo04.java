package com.java.development.thirteen_classset.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 
    * @ClassName: CollectionsDemo04
    * @Description: 检索内容
    * @author Administrator
    * @date 2018年11月6日
    *
 */
public class CollectionsDemo04 {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		Collections.addAll(all, "MLDN", "LXH", "mldnjava");// 增加内容
		int point = Collections.binarySearch(all, "LXH");// 检索内容
		System.out.println("检索结果：" + point);
		point = Collections.binarySearch(all, "LI");// 检索内容，内容不存在
		System.out.println("检索结果：" + point);
	}

}
