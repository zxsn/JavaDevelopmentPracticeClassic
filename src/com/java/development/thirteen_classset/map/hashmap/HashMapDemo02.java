package com.java.development.thirteen_classset.map.hashmap;

import java.util.HashMap;
import java.util.Map;

/*
 * 
    * @ClassName: HashMapDemo02
    * @Description: 判断指定内容是否存在
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class HashMapDemo02 {

	public static void main(String[] args) {
		Map<String, String> map = null;// 声明Map对象
		map = new HashMap<String, String>();// key和value是String类型
		map.put("mldn", "www.mldn.cn");// 增加内容
		map.put("jixianit", "www.jixianit.cn");// 增加内容
		map.put("mldnjava", "www.mldnjava.cn");// 增加内容
		if (map.containsKey("mldn")) {
			System.out.println("搜索的key存在！");
		} else {
			System.out.println("搜索的key不存在！");
		}
		if (map.containsValue("www.mldn.cn")) {
			System.out.println("搜索的value存在！");
		} else {
			System.out.println("搜索的value不存在！");
		}
	}

}
