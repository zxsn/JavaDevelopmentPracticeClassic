package com.java.development.thirteen_classset.map.hashmap;

import java.util.HashMap;
import java.util.Map;

/*
 * 
    * @ClassName: HashMapDemo01
    * @Description: 增加和取得内容
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class HashMapDemo01 {

	public static void main(String[] args) {
		Map<String, String> map = null;// 声明Map对象
		map = new HashMap<String, String>();// key和value是String类型
		map.put("mldn", "www.mldn.cn");// 增加内容
		map.put("jixianit", "www.jixianit.cn");// 增加内容
		map.put("mldnjava", "www.mldnjava.cn");// 增加内容
		String val = map.get("mldn");// 根据key求出value
		System.out.println("取出的内容为：" + val);
	}

}
