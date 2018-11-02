package com.java.development.sixteen_annotation_lamda.functional_interface;

/*
 * 
    * @ClassName: TestDemo02
    * @Description: 利用消费型接口，映射"System.out.print(String str)"方法
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class TestDemo02 {
	@FunctionalInterface
	interface Consumer<T> {
		public void accept(T t);
	}
	public static void main(String[] args) {
		Consumer<String> cons = System.out::print;
		cons.accept("更多课程，请访问：www.yootk.com");
	}

}
