package com.java.development.thirteen_classset.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 
    * @ClassName: HashMapDemo03
    * @Description: 输出全部的key
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class HashMapDemo03 {

	public static void main(String[] args) {
		Map<String, String> map = null;// 声明Map对象
		map = new HashMap<String, String>();// key和value是String类型
		map.put("mldn", "www.mldn.cn");// 增加内容
		map.put("jixianit", "www.jixianit.cn");// 增加内容
		map.put("mldnjava", "www.mldnjava.cn");// 增加内容
		Set<String> keys = map.keySet();// 得到全部的key
		Iterator<String> iter = keys.iterator();// 实例化Iterator
		System.out.print("全部的key：");
		int i = 0;
		while (iter.hasNext()) {
			String str = iter.next();// 得到内容
			System.out.print(i < keys.size() - 1 ? str + "、" : str);
			i++;
		}
	}

}
