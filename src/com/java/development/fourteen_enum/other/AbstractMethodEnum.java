package com.java.development.fourteen_enum.other;

/*
 * 
    * @ClassName: AbstractMethodEnum
    * @Description: 在枚举类中定义抽象方法
    * @author Administrator
    * @date 2018年11月10日
    *
 */
public class AbstractMethodEnum {
	public enum Color {
		RED {
			public String getColor() {// 枚举对象实现抽象方法
				return "红色";
			}
		},
		GREEN {
			public String getColor() {// 枚举对象实现抽象方法
				return "绿色";
			}
		},
		BLUE {
			public String getColor() {// 枚举对象实现抽象方法
				return "蓝色";
			}
		};
		public abstract String getColor();// 定义抽象方法
	}
	public static void main(String[] args) {
		int i = 0;
		for (Color c : Color.values()) {
			System.out.print(i < Color.values().length - 1 ? c.getColor() + "、" : c.getColor());
			i++;
		}
	}

}
