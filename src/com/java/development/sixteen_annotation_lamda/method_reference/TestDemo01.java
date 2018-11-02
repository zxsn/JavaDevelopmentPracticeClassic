package com.java.development.sixteen_annotation_lamda.method_reference;

/*
 * 
    * @ClassName: TestDemo01
    * @Description: 引用静态方法
    * 				引用String类里面的valueOf()静态方法
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class TestDemo01 {
	/*
	 * 
	 * @ClassName:IMessage
	 * 
	 * @Description: 实现方法的引用接口
	 * 
	 * @author Administrator
	 * 
	 * @date 2018年11月12日
	 *
	 * @param <P> 引用方法的参数类型
	 * 
	 * @param <R> 引用方法的返回类型
	 */
	@FunctionalInterface
	interface IMessage<P, R> {
		/**
		 * 
		    * @Title: zhuanhuan
		    * @Description: 此处为方法引用后的名字
		    * @param @param p 参数类型
		    * @return R    返回指定类型的数据
		    * @throws
		 */
		public R zhuanhuan(P p);
	}
	public static void main(String[] args) {
		// 即：将String.valueOf()方法变为了IMessage接口里的zhuanhuan()方法
		// valueOf()方法可以接收int型数据，返回String型数据
		IMessage<Integer, String> msg = String::valueOf;
		String str = msg.zhuanhuan(1000);// 调用引用方法进行操作
		System.out.println(str.replaceAll("0", "9"));
	}

}
