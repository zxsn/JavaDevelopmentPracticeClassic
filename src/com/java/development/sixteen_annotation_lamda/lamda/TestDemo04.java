package com.java.development.sixteen_annotation_lamda.lamda;

/*
 * 
    * @ClassName: TestDemo04
    * @Description: 定义有参数有返回值的方法
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class TestDemo04 {
	@FunctionalInterface
	interface IMessage {
		public int add(int x, int y);
	}
	public static void main(String[] args) {
		fun((s1, s2) -> {// 传递两个参数，此处只是一个参数标记
			return s1 + s2;
		});

	}

	private static void fun(IMessage msg) {
		System.out.println(msg.add(10, 20));
	}

}
