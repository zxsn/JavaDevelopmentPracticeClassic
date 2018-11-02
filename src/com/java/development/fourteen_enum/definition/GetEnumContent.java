package com.java.development.fourteen_enum.definition;

/*
 * 
    * @ClassName: GetEnumContent
    * @Description: 枚举演示
    * @author Administrator
    * @date 2018年11月10日
    *
 */
public class GetEnumContent {
	enum Color {// 定义一个枚举类型
		RED, GREEN, BLUE;// 定义枚举的三个类型
	}
	public static void main(String[] args) {
		Color c = Color.BLUE;// 取得蓝色
		System.out.println(c);
	}

}
