package com.java.development.sixteen_annotation_lamda.defaultannotation;

/*
 * 
    * @ClassName: Demo05
    * @Description: 建立Annotation并设置数组属性
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class Demo05 {
	@interface MyDefaultAnnotationSingleParam {// 定义Annotation
		public String[] value();// 接收设置的内容，是一个字符串数组
	}

	@MyDefaultAnnotationSingleParam(value = { "jlx", "贾利鑫" }) // 使用自定义的Annotation
	public class Demo {

	}
}
