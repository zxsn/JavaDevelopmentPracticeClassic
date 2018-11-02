package com.java.development.sixteen_annotation_lamda.lamda;

/*
 * 
    * @ClassName: TestDemo02
    * @Description: Lamda表达式入门级操作
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class TestDemo02 {
	interface IMessage {
		public void print();
	}
	public static void main(String[] args) {
		// 此处为Lamda表达式，没有任何输入参数，只是进行输出操作
		fun(() -> System.out.println("更多课程请访问：www.yootk.com"));
	}

	private static void fun(IMessage msg) {
		msg.print();

	}

}
