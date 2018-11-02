package com.java.development.sixteen_annotation_lamda.defaultannotation;

/*
 * 
    * @ClassName: Demo07
    * @Description: 定义Annotation时设置属性并定义变量的默认值
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class Demo07 {
	@interface MyDefaultAnnotationSingleParam {// 定义Annotation
		public String value() default "贾利鑫";// 接收设置的内容，是一个字符串数组
	}

	@MyDefaultAnnotationSingleParam // 使用自定义的Annotation
	public class Demo {

	}
}
