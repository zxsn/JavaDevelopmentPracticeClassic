package com.java.development.sixteen_annotation_lamda.lamda;

/*
 * 
    * @ClassName: TestDemo05
    * @Description: 简化只编写一行返回语句的方法
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class TestDemo05 {
	@FunctionalInterface
	interface IMessage {
		public int add(int x, int y);
	}
	public static void main(String[] args) {
		fun((s1, s2) -> s1 + s2);
	}

	private static void fun(IMessage msg) {
		System.out.println(msg.add(10, 20));
	}

}
