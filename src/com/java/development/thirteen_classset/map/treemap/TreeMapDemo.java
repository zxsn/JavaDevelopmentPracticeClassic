package com.java.development.thirteen_classset.map.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * 
    * @ClassName: TreeMapDemo
    * @Description: 观察TreeMap排序
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class TreeMapDemo {

	public static void main(String[] args) {
		Map<String, String> map = null;// 声明Map对象
		map = new TreeMap<String, String>();// 实例化Map对象
		map.put("A、mldn", "www.mldn.cn");// 增加内容
		map.put("C、jixianit", "www.jixianit.cn");// 增加内容
		map.put("B、mldnjava", "www.mldnjava.cn");// 增加内容
		Set<String> keys = map.keySet();// 得到全部的key
		Iterator<String> iter = keys.iterator();// 实例化Iterator
		while (iter.hasNext()) {
			String str = iter.next();// 取出key
			System.out.println(str + "-->" + map.get(str));
		}
	}

}
