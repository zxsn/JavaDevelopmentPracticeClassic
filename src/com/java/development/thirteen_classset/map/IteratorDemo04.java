package com.java.development.thirteen_classset.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 
    * @ClassName: IteratorDemo04
    * @Description: 使用Iterator输出Map实例
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class IteratorDemo04 {

	public static void main(String[] args) {
		Map<String, String> map = null;// 声明Map对象
		map = new Hashtable<String, String>();// key和value是String类型
		map.put("mldn", "www.mldn.cn");// 增加内容
		map.put("jixianit", "www.jixianit.cn");// 增加内容
		map.put("mldnjava", "www.mldnjava.cn");// 增加内容
		Set<Map.Entry<String, String>> allSet = null;// 声明一个Set集合，并指定类型
		allSet = map.entrySet();// 将Map接口实例变为Set接口实例
		Iterator<Map.Entry<String, String>> iter = null;// 声明Iterator对象
		iter = allSet.iterator();// 实例化Iterator对象
		while (iter.hasNext()) {
			Map.Entry<String, String> me = iter.next();// 找到Map.Entry实例
			System.out.println(me.getKey() + "-->" + me.getValue());// 输出key和value
		}
	}

}
