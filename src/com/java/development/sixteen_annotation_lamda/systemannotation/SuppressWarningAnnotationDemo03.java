package com.java.development.sixteen_annotation_lamda.systemannotation;

/*
 * 
    * @ClassName: SuppressWarningAnnotationDemo03
    * @Description: 另一种形式的压制警告
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class SuppressWarningAnnotationDemo03 {
	@Deprecated
	static class Demo<T> {// 定义Demo类使用泛型
		private T var;// 定义泛型变量

		public T getVar() {// 取得泛型变量的内容
			return var;
		}

		public void setVar(T var) {// 设置泛型变量
			this.var = var;
		}
	}

	@SuppressWarnings(value = { "unchecked", "rawtypes" }) // 压制主方法的警告信息
	public static void main(String[] args) {
		Demo d = new Demo();// 编译时，将出现警告信息，但此时警告信息被压制
		d.setVar("贾利鑫");
		System.out.println("内容：" + d.getVar());// 输出
	}

}
