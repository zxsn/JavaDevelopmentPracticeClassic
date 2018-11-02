package com.java.development.fourteen_enum.api;

/*
 * 
    * @ClassName: ConstructorEnum
    * @Description: 通过构造方法为枚举元素属性赋值
    * @author Administrator
    * @date 2018年11月10日
    *
 */
public class ConstructorEnum {
	public enum Color {
		RED("红色"), GREEN("绿色"), BLUE("蓝色");
		private String name;
		private Color(String name) {
			this.setName(name);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
	public static void main(String[] args) {
		for (Color c : Color.values()) {
			System.out.println(c.ordinal() + "-->" + c.name + "(" + c.getName() + ")");
		}

	}

}
