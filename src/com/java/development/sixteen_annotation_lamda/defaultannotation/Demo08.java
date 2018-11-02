package com.java.development.sixteen_annotation_lamda.defaultannotation;

/*
 * 
    * @ClassName: Demo08
    * @Description: 使用枚举限制设置的内容
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class Demo08 {
	public enum MyName {
		JLX, Jia, 贾利鑫;
	}
	@interface MyDefaultAnnotationSingleParam {// 定义Annotation
		public MyName name() default MyName.Jia;// 接收设置的内容，是一个字符串数组
	}

	@MyDefaultAnnotationSingleParam(name = MyName.贾利鑫) // 使用自定义的Annotation
	public class Demo {

	}
}
