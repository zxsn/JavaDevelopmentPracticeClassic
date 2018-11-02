package com.java.development.sixteen_annotation_lamda.lamda;

/*
 * 
    * @ClassName: TestDemo01
    * @Description: 匿名内部类实现
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class TestDemo01 {
	interface IMessage{
		public void print();
	}
	public static void main(String[] args) {
		fun(new IMessage() {
			
			@Override
			public void print() {
				System.out.println("更多课程请访问：www.yootk.com");
				
			}
		});

	}
	private static void fun(IMessage msg) {
		msg.print();
	}

}
