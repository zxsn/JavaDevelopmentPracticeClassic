package com.java.development.fourteen_enum.enumset;

import java.util.EnumSet;

/*
 * 
    * @ClassName: EnumSetDemo01
    * @Description: 将全部的集合设置到EnumSet集合中
    * @author Administrator
    * @date 2018年11月10日
    *
 */
public class EnumSetDemo01 {
	public enum Color {
		RED, GREEN, BLUE;
	}
	public static void main(String[] args) {
		EnumSet<Color> es = null;
		System.out.println("==== EnumSet.allOf(Color.class) ====");
		es = EnumSet.allOf(Color.class);
		print(es);
	}

	public static void print(EnumSet<Color> temp) {// 专门的输出操作
		int i = 0;
		for (Color c : temp) {
			System.out.print(i < temp.size() - 1 ? c + "、" : c);
			i++;
		}
	}

}
