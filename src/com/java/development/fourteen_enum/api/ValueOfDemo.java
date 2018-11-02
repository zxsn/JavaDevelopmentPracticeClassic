package com.java.development.fourteen_enum.api;

/*
 * 
    * @ClassName: ValueOfDemo
    * @Description: 使用valueOf()方法找到一个枚举对象
    * @author Administrator
    * @date 2018年11月10日
    *
 */
public class ValueOfDemo {
	public enum Color {
		RED, GREEN, BLUE;// 定义枚举的三个类型
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			switch (this) {
			case RED: {
				if ("红色".equals(name)) {
					this.name = name;
				} else {
					System.out.println("设置内容错误。");
				}
				break;
			}
			case GREEN: {
				if ("绿色".equals(name)) {
					this.name = name;
				} else {
					System.out.println("设置内容错误。");
				}
				break;
			}
			case BLUE: {
				if ("蓝色".equals(name)) {
					this.name = name;
				} else {
					System.out.println("设置内容错误。");
				}
				break;
			}
			}
		}
	}
	public static void main(String[] args) {
		Color c = Enum.valueOf(Color.class, "BLUE");
		c.setName("兰色");// 设置一个错误的名字
		c.setName("蓝色");// 设置一个正确的名字
		System.out.println(c.getName());
	}

}
