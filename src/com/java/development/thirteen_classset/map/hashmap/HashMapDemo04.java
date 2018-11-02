package com.java.development.thirteen_classset.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * 
    * @ClassName: HashMapDemo04
    * @Description: 输出全部的value
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class HashMapDemo04 {

	public static void main(String[] args) {
		Map<String, String> map = null;// 声明Map对象
		map = new HashMap<String, String>();// key和value是String类型
		map.put("mldn", "www.mldn.cn");// 增加内容
		map.put("jixianit", "www.jixianit.cn");// 增加内容
		map.put("mldnjava", "www.mldnjava.cn");// 增加内容
		Collection<String> values = map.values();// 得到全部的value
		Iterator<String> iter = values.iterator();// 实例化Iterator
		System.out.print("全部的value：");
		int i = 0;
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.print(i < values.size() - 1 ? str + "、" : str);
			i++;
		}
	}

}