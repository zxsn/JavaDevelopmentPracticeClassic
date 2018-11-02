package com.java.development.sixteen_annotation_lamda.functional_interface;

/*
 * 
    * @ClassName: TestDemo04
    * @Description: 利用断言型接口，引用String类的"public boolean equalsIgnoreCase(String str)"方法
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class TestDemo04 {
	@FunctionalInterface
	interface Predicate<T> {
		public boolean test(T t);
	}
	public static void main(String[] args) {
		Predicate<String> pre = "yootk"::equalsIgnoreCase;
		System.out.println(pre.test("YOOTK"));// 忽略大小写比较
	}

}
