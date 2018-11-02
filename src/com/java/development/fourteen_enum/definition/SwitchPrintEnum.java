package com.java.development.fourteen_enum.definition;

/*
 * 
    * @ClassName: SwitchPrintEnum
    * @Description: 使用switch进行判断
    * @author Administrator
    * @date 2018年11月10日
    *
 */
public class SwitchPrintEnum {
	public enum Color {// 定义枚举类型
		RED, GREEN, BLUE;// 定义枚举的三个类型
	}
	public static void main(String[] args) {
		for (Color c : Color.values()) {// 枚举.values()表示得到全部的枚举内容
			print(c);
		}
	}

	public static void print(Color color) {
		switch (color) {
		case RED: {
			System.out.println("红颜色");
			break;
		}
		case GREEN: {
			System.out.println("绿颜色");
			break;
		}
		case BLUE: {
			System.out.println("蓝颜色");
			break;
		}
		default: {
			System.out.println("未知颜色");
			break;
		}
		}
	}
}
