package com.java.development.sixteen_annotation_lamda.functional_interface;

/*
 * 
    * @ClassName: TestDemo01
    * @Description: 使用Function接口，引用String类"public boolean startsWith(String str)"方法
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class TestDemo01 {
	@FunctionalInterface
	interface Function<T, R> {
		public R apply(T t);
	}
	public static void main(String[] args) {
		Function<String, Boolean> fun = "##yootk"::startsWith;
		System.out.println(fun.apply("##"));// 相当于利用对象调用startsWith()
	}

}
