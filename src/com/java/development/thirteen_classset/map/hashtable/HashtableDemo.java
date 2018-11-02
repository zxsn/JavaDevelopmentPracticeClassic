package com.java.development.thirteen_classset.map.hashtable;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 
    * @ClassName: HashtableDemo
    * @Description: Hashtable操作
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class HashtableDemo {

	public static void main(String[] args) {
		Map<String, String> map = null;// 声明Map对象
		map = new Hashtable<String, String>();// key和value是String类型
		map.put("mldn", "www.mldn.cn");// 增加内容
		map.put("jixianit", "www.jixianit.cn");// 增加内容
		map.put("mldnjava", "www.mldnjava.cn");// 增加内容
		Set<String> keys = map.keySet();// 得到全部的key
		Iterator<String> iter1 = keys.iterator();// 实例化Iterator
		System.out.print("全部的key：");
		int i = 0;
		while (iter1.hasNext()) {// 迭代输出全部的key
			String str = iter1.next();// 取出内容
			System.out.print(i < keys.size() - 1 ? str + "、" : str);
			i++;
		}
		Collection<String> values = map.values();// 得到全部的value
		Iterator<String> iter2 = values.iterator();// 实例化Iterator
		System.out.print("\n全部的value：");
		int j = 0;
		while (iter2.hasNext()) {
			String str = iter2.next();
			System.out.print(j < values.size() - 1 ? str + "、" : str);
			j++;
		}
	}

}
