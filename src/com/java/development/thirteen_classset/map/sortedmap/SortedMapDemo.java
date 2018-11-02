package com.java.development.thirteen_classset.map.sortedmap;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 * 
    * @ClassName: SortedMapDemo
    * @Description: SortedMap演示
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class SortedMapDemo {

	public static void main(String[] args) {
		SortedMap<String, String> map = null;
		map = new TreeMap<String, String>();
		map.put("D、jiangker", "http://www.jiangker.com");
		map.put("A、mldn", "www.mldn.cn");
		map.put("C、jixianit", "www.jixianit.com");
		map.put("B、mldnjava", "www.mldnjava.cn");
		System.out.print("第一个元素的内容的key" + map.firstKey());
		System.out.println("；对应的值：" + map.get(map.firstKey()));
		System.out.print("最后一个元素的内容的key：" + map.lastKey());
		System.out.println("；对应的值：" + map.get(map.lastKey()));
		System.out.println("返回小于指定范围的集合：");
		for (Map.Entry<String, String> me : map.headMap("B、mldnjava").entrySet()) {
			System.out.println("\t|" + me.getKey() + "-->" + me.getValue());
		}
		System.out.println("返回大于指定范围的集合：");
		for (Map.Entry<String, String> me : map.tailMap("B、mldnjava").entrySet()) {
			System.out.println("\t|" + me.getKey() + "-->" + me.getValue());
		}
		System.out.println("部分集合");
		for (Map.Entry<String, String> me : map.subMap("A、mldn", "C、jixianit").entrySet()) {
			System.out.println("\t|" + me.getKey() + "-->" + me.getValue());
		}
	}

}
