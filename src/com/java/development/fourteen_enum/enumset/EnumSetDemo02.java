package com.java.development.fourteen_enum.enumset;

import java.util.EnumSet;

/*
 * 
    * @ClassName: EnumSetDemo02
    * @Description: 只设置一个枚举的类型到EnumSet集合中
    * @author Administrator
    * @date 2018年11月10日
    *
 */
public class EnumSetDemo02 {
	public enum Color {
		RED, GREEN, BLUE;
	}
	public static void main(String[] args) {
		EnumSet<Color> es = null;
		System.out.println("==== EnumSet.of(Color.BLUE) ====");
		es = EnumSet.of(Color.BLUE);
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
