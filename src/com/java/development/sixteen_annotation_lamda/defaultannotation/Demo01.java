package com.java.development.sixteen_annotation_lamda.defaultannotation;
/*
 * 
 * @ClassName: Demo01
 * 
 * @Description: 自定义一个Annotation
 * 
 * @author Administrator
 * 
 * @date 2018年11月12日
 *
 */
public class Demo01 {
	@interface MyDefaultAnnotationNoneParam {// 定义Annotation

	}

	@MyDefaultAnnotationNoneParam // 使用自定义的Annotation
	public class Demo {

	}
}
