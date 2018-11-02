package com.java.development.sixteen_annotation_lamda.method_reference;

/*
 * 
    * @ClassName: TestDemo03
    * @Description: 引用特定类的方法
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class TestDemo03 {
	@FunctionalInterface
	interface IMessage<P> {
		public int compare(P p1, P p2);
	}
	public static void main(String[] args) {
		IMessage<String> msg = String::compareTo;// 引用String类的普通方法
		// 传递调用的参数，形式为："A".compareTo("B")
		System.out.println(msg.compare("A", "B"));
	}

}
