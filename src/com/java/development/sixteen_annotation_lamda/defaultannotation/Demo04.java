package com.java.development.sixteen_annotation_lamda.defaultannotation;

/*
 * 
    * @ClassName: Demo04
    * @Description: 在Annotation中设置多个属性
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class Demo04 {
	@interface MyDefaultAnnotationSingleParam {// 定义Annotation
		public String key();// 接收设置的内容
		public String value();// 接收设置的内容
	}

	@MyDefaultAnnotationSingleParam(key = "jlx", value = "贾利鑫") // 使用自定义的Annotation
	public class Demo {

	}
}
