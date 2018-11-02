package com.java.development.sixteen_annotation_lamda.retention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
 * 
    * @ClassName: Demo
    * @Description: 定义在RUNTIME范围有效的Annotation
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class Demo {
	@Retention(value = RetentionPolicy.RUNTIME) // 此Annotation在执行时起作用
	public @interface MyDefaultRetentionAnnotation {
		public String name() default "贾利鑫";
	}
}
