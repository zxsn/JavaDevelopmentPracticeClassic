package com.java.development.sixteen_annotation_lamda.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 
    * @ClassName: TargetDemo01
    * @Description: 定义一个只能出现在类上的Annotation
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class TargetDemo01 {
	@Target(ElementType.TYPE) // 此Annotation只能用在类上
	@Retention(RetentionPolicy.RUNTIME) // 此Annotation在类执行时依然有效
	public @interface MyTargetAnnotation {
		public String key() default "JLX";

		public String value() default "贾利鑫";
	}

	// 使用自定义Annotation并设置两个属性的内容
	@MyTargetAnnotation(key = "MLDN", value = "www.mldnjava.cn")
	public class SimpleBean {
		@Override
		// @MyTargetAnnotation//只能使用在类上，编译报错
		public String toString() {
			return "Hello,Jia Lixin";

		}
	}
}
