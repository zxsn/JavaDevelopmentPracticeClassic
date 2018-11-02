package com.java.development.fourteen_enum.definition;

/*
 * 
    * @ClassName: PrintEnum
    * @Description: 使用foreach输出枚举内容
    * @author Administrator
    * @date 2018年11月10日
    *
 */
public class PrintEnum {
	public enum Color {// 定义枚举类型
		RED, GREEN, BLUE;// 定义枚举的三个类型
	}
	public static void main(String[] args) {
		for (Color c : Color.values()) {// 枚举.values()表示得到全部的枚举内容
			System.out.println(c);
		}

	}

}
