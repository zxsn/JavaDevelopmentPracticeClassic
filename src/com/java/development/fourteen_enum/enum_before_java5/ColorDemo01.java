package com.java.development.fourteen_enum.enum_before_java5;

/*
 * 
    * @ClassName: ColorDemo01
    * @Description: 使用简单类完成枚举操作
    * @author Administrator
    * @date 2018年11月10日
    *
 */
public class ColorDemo01 {
	static class Color {
		private String name;
		public static final Color RED = new Color("红色");// 定义第一个对象
		public static final Color GREEN = new Color("绿色");// 定义第二个对象
		public static final Color BLUE = new Color("蓝色");// 定义第三个对象

		private Color(String name) {// 构造方法私有化，同时设置颜色的名称
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public static Color getInstance(int i) {// 得到一个颜色，只能从固定的几个颜色中取得
			switch (i) {
			case 1: {
				return RED;
			}
			case 2: {
				return GREEN;
			}
			case 3: {
				return BLUE;
			}
			default: {
				return null;
			}
			}
		}
	}
	public static void main(String[] args) {
		Color c1 = Color.RED;// 取得红色
		System.out.println(c1.getName());
		Color c2 = Color.getInstance(3);// 根据编号取得名字
		System.out.println(c2.getName());
	}

}
