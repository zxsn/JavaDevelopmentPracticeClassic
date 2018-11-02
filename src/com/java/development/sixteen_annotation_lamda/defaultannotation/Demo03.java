package com.java.development.sixteen_annotation_lamda.defaultannotation;

/*
 * 
    * @ClassName: Demo03
    * @Description: 指定接收的参数的变量
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class Demo03 {
	@interface MyDefaultAnnotationSingleParam {// 定义Annotation
		public String value();// 接收设置的内容
	}

	@MyDefaultAnnotationSingleParam(value = "贾利鑫") // 使用自定义的Annotation
	public class Demo {

	}
}
