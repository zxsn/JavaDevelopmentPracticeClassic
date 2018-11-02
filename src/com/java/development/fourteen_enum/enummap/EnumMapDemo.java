package com.java.development.fourteen_enum.enummap;

import java.util.EnumMap;
import java.util.Map;

/*
 * 
    * @ClassName: EnumMapDemo
    * @Description: 验证EnumMap
    * @author Administrator
    * @date 2018年11月10日
    *
 */
public class EnumMapDemo {
	public enum Color {
		RED, GREEN, BLUE;
	}
	public static void main(String[] args) {
		Map<Color, String> desc = null;// 定义一个Map对象
		desc = new EnumMap<Color, String>(Color.class);// 实例化EnumMap对象
		desc.put(Color.RED, "红色");
		desc.put(Color.GREEN, "绿色");
		desc.put(Color.BLUE, "蓝色");
		System.out.println("====== 输出全部的内容  ======");
		for (Color c : Color.values()) {
			System.out.println(c.name() + "-->" + desc.get(c));
		}
		System.out.println("====== 输出全部的键值  ======");
		int i = 0;
		for (Color c : Color.values()) {
			System.out.print(i < Color.values().length - 1 ? c.name() + "、" : c.name());
			i++;
		}
		int j = 0;
		System.out.println();
		System.out.println("====== 输出全部的值  ======");
		for (Color c : Color.values()) {
			System.out.print(j < Color.values().length - 1 ? desc.get(c) + "、" : desc.get(c));
			j++;
		}

	}

}
