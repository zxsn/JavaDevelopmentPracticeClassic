package com.java.development.thirteen_classset.map;

import java.util.Hashtable;
import java.util.Map;

/*
 * 
    * @ClassName: ForeachDemo02
    * @Description: 使用foreach输出Map实例
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class ForeachDemo02 {

	public static void main(String[] args) {
		Map<String, String> map = null;// 声明Map对象
		map = new Hashtable<String, String>();// key和value是String类型
		map.put("mldn", "www.mldn.cn");// 增加内容
		map.put("jixianit", "www.jixianit.cn");// 增加内容
		map.put("mldnjava", "www.mldnjava.cn");// 增加内容
		for (Map.Entry<String, String> me : map.entrySet()) {// 输出Set集合
			System.out.println(me.getKey() + "-->" + me.getValue());
		}
	}

}
