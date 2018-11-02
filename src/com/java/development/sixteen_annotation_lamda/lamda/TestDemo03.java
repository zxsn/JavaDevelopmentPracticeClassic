package com.java.development.sixteen_annotation_lamda.lamda;

/*
 * 
    * @ClassName: TestDemo03
    * @Description: 编写多行语句
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class TestDemo03 {
	@FunctionalInterface
	interface IMessage {
		public void print();
	}
	public static void main(String[] args) {
		String info = "魔乐科技软件学院：www.mldn.cn";
		fun(() -> {
			System.out.println("更多课程请访问：www.yootk.com");
			System.out.println(info);
		});// 输出方法中的变量

	}
	public static void fun(IMessage msg) {
		msg.print();
	}
}
