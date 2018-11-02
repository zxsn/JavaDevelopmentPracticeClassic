package com.java.development.thirteen_classset.set.treeset;

import java.util.Set;
import java.util.TreeSet;

/*
 * 
    * @ClassName: TreeSetDemo01
    * @Description: 验证TreeSet类
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class TreeSetDemo01 {

	public static void main(String[] args) {
		Set<String> allSet = new TreeSet<String>();
		allSet.add("A");// 增加元素
		allSet.add("C");// 增加元素
		allSet.add("B");// 增加元素
		allSet.add("C");// 重复元素，不能增加
		allSet.add("D");// 增加元素
		allSet.add("C");// 重复元素，不能增加
		allSet.add("F");// 增加元素
		allSet.add("G");// 增加元素
		allSet.add("E");// 增加元素
		allSet.add("T");// 增加元素
		allSet.add("E");// 重复元素，不能增加
		allSet.add("V");// 增加元素
		allSet.add("L");// 增加元素
		allSet.add("J");// 增加元素
		System.out.println(allSet);// 输出集合对象，调用toString()方法
	}

}
