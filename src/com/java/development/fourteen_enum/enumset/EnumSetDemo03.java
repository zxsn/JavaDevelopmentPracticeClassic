package com.java.development.fourteen_enum.enumset;

import java.util.EnumSet;

/*
 * 
    * @ClassName: EnumSetDemo03
    * @Description: 创建只能放入指定枚举类型的集合
    * @author Administrator
    * @date 2018年11月10日
    *
 */
public class EnumSetDemo03 {
	public enum Color {
		RED, GREEN, BLUE;
	}
	public static void main(String[] args) {
		EnumSet<Color> es = null;
		System.out.println("==== EnumSet.noneOf(Color.class) ====");
		es = EnumSet.noneOf(Color.class);// 创建一个可以加入Color类型的对象
		es.add(Color.RED);// 增加内容
		es.add(Color.GREEN);// 增加内容
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
