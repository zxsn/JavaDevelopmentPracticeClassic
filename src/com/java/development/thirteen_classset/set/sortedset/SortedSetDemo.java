package com.java.development.thirteen_classset.set.sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

/*
 * 
    * @ClassName: SortedSetDemo
    * @Description:验证SortedSet接口
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet<String> allSet = new TreeSet<String>();
		allSet.add("A");// 增加元素
		allSet.add("B");// 增加元素
		allSet.add("C");// 增加元素
		allSet.add("C");// 重复元素，不能加入
		allSet.add("C");// 重复元素，不能加入
		allSet.add("D");// 增加元素
		allSet.add("E");// 增加元素
		System.out.println("第一个元素：" + allSet.first());// A
		System.out.println("最后一个元素" + allSet.last());// E
		System.out.println("headSet元素：" + allSet.headSet("C"));// 返回小于指定元素的集合
		System.out.println("tailSet元素：" + allSet.tailSet("C"));// 返回大于等于指定元素的集合
		System.out.println("subSet元素：" + allSet.subSet("B", "D"));// 返回[a,b)的元素集合
	}

}
