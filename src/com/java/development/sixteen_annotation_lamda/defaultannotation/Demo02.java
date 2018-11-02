package com.java.development.sixteen_annotation_lamda.defaultannotation;

/*
 * 
    * @ClassName: Demo02
    * @Description: 自定义注解，可以接收一个变量
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class Demo02 {
	@interface MyDefaultAnnotationSingleParam {// 定义Annotation
		public String value();// 接收设置的内容
	}

	@MyDefaultAnnotationSingleParam("贾利鑫") // 使用自定义的Annotation
	public class Demo {

	}
}
