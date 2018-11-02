package com.java.development.sixteen_annotation_lamda.lamda;

/*
 * 
    * @ClassName: TestDemo06
    * @Description: 传递可变参数
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class TestDemo06 {
	@FunctionalInterface
	interface IMessage {
		public int add(int... args);

		static int sum(int... args) {// 此方法可以由接口名称直接调用
			int sum = 0;
			for (int temp : args) {
				sum += temp;
			}
			return sum;
		}
	}
	public static void main(String[] args) {
		// 在Lamda表达式中直接调用接口里定义的静态方法
		fun((int... param) -> IMessage.sum(param));
	}

	private static void fun(IMessage msg) {
		System.out.println(msg.add(10, 20, 30));
	}

}
