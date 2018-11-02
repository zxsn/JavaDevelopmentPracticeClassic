package com.java.development.fourteen_enum.enumset;

import java.util.EnumSet;

/*
 * 
    * @ClassName: EnumSetDemo04
    * @Description: 创建不包含指定元素的集合
    * @author Administrator
    * @date 2018年11月10日
    *
 */
public class EnumSetDemo04 {
	public enum Color {
		RED, GREEN, BLUE;
	}
	public static void main(String[] args) {
		EnumSet<Color> esOld = null;
		EnumSet<Color> esNew = null;
		esOld = EnumSet.noneOf(Color.class);// 创建一个可以加入Color类型的对象
		esOld.add(Color.RED);// 增加内容
		esOld.add(Color.GREEN);// 增加内容
		System.out.println("==== EnumSet.complementOf(esOld) ====");
		esNew = EnumSet.complementOf(esOld);
		print(esNew);
	}

	public static void print(EnumSet<Color> temp) {// 专门的输出操作
		int i = 0;
		for (Color c : temp) {
			System.out.print(i < temp.size() - 1 ? c + "、" : c);
			i++;
		}
	}

}
