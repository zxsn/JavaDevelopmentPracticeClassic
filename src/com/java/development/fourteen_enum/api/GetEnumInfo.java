package com.java.development.fourteen_enum.api;

/*
 * 
    * @ClassName: GetEnumInfo
    * @Description:验证name()和ordinal()方法
    * @author Administrator
    * @date 2018年11月10日
    *
 */
public class GetEnumInfo {
	public enum Color {// 定义枚举类型
		RED, GREEN, BLUE;
	}
	public static void main(String[] args) {
		for (Color c : Color.values()) {
			System.out.println(c.ordinal() + "-->" + c.name());
		}

	}

}
