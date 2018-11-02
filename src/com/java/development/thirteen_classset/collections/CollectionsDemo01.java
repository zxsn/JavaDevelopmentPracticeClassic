package com.java.development.thirteen_classset.collections;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/*
 * 
    * @ClassName: CollectionsDemo01
    * @Description: 返回空的集合对象
    * @author Administrator
    * @date 2018年11月6日
    *
 */
public class CollectionsDemo01 {

	public static void main(String[] args) {
		List<String> allList = Collections.emptyList();// 返回不可变的空List集合
		@SuppressWarnings("unused") // 运行后出错：不支持的方法异常，因为没有找到add()方法的实现
		Set<String> allSet = Collections.emptySet();// 返回不可变的空Set集合
		allList.add("Hello");// 错误，无法加入
	}

}
