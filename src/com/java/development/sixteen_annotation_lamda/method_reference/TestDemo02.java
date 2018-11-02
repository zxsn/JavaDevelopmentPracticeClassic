package com.java.development.sixteen_annotation_lamda.method_reference;

/*
 * 
    * @ClassName: TestDemo02
    * @Description: 普通方法引用
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class TestDemo02 {
	/*
	 * 
	 * @ClassName: IMessage
	 * 
	 * @Description: 实现方法的引用接口
	 * 
	 * @author Administrator
	 * 
	 * @date 2018年11月12日
	 *
	 * @param <R> 引用方法的返回类型
	 */
	@FunctionalInterface
	interface IMessage<R> {
		public R upper();
	}
	public static void main(String[] args) {
		// String类的toUpperCase()定义：public String toUpperCase()
		// 此方法没有参数，但是有返回值，并且这个方法一定要在有实例化对象的情况下才可以调用
		// “abcde”字符串是String类型的实例化对象，所以可以直接调用toUpperCase()方法
		// 将toUpperCase()函数的应用交给IMessage接口
		IMessage<String> msg = "abcde"::toUpperCase;
		String str = msg.upper();// 相当于“abcde”.toUpperCase()
		System.out.println(str);
	}

}
