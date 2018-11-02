package com.java.development.fourteen_enum.enum_before_java5;

/*
 * 
    * @ClassName: ColorDemo02
    * @Description:使用接口表示一组范围
    * @author Administrator
    * @date 2018年11月10日
    *
 */
public class ColorDemo02 {
	interface Color {
		public static final int RED = 1;// 表示红色
		public static final int GREEN = 2;// 表示绿色
		public static final int BIUE = 3;// 表示蓝色
	}
	public static void main(String[] args) {
		System.out.println(Color.RED + Color.GREEN);// 颜色相加

	}

}
