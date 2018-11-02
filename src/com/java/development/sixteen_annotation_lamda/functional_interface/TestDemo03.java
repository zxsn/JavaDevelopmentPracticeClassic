package com.java.development.sixteen_annotation_lamda.functional_interface;

/*
 * 
    * @ClassName: TestDemo03
    * @Description: 利用供给型接口，引用String类的"public String toUpperCase() "方法
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class TestDemo03 {
	@FunctionalInterface
	interface Supplier<T> {
		public T get();
	}
	public static void main(String[] args) {
		Supplier<String> sup = "abcd"::toUpperCase;
		System.out.println(sup.get());
	}

}
