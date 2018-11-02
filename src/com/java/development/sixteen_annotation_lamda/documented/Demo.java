package com.java.development.sixteen_annotation_lamda.documented;

import java.lang.annotation.Documented;

/*
 * 
    * @ClassName: Demo
    * @Description: Documented注解的用法
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class Demo {
	@Documented
	public @interface MyDocumentedAnnotation {
		public String key();

		public String value();
	}

	@MyDocumentedAnnotation(key = "JLX", value = "JiaLixin")
	public class SimpleBeanDocumented {
		/**
		 * 此方法在对象输出时调用，返回对象的信息
		 */
		@MyDocumentedAnnotation(key = "MLDN", value = "www.mldnjava.cn")
		@Override
		public String toString() {
			return "Hello,Jia Lixin!!!";
		}
	}
	public static void main(String[] args) {
		// javadoc -encoding UTF-8 -d doc Demo.java

	}

}
