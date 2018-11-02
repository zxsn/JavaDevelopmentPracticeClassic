package com.java.development.sixteen_annotation_lamda.defaultannotation;

/*
 * 
    * @ClassName: Demo06
    * @Description: 定义Annotation时设置了属性，在使用时必须设置其内容，否则编译报错
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class Demo06 {
	@interface MyDefaultAnnotationSingleParam {// 定义Annotation
		public String value();// 接收设置的内容
	}

	// @MyDefaultAnnotationSingleParam // 使用自定义的Annotation
	public class Demo {

	}
}
