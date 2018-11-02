package com.java.development.sixteen_annotation_lamda.systemannotation;

/*
 * 
    * @ClassName: DeprecatedAnnotationDemo01
    * @Description: 使用@Deprecated声明一个不建议使用的方法
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class DeprecatedAnnotationDemo01 {
	static class Demo {// 定义Demo类
		@Deprecated // 声明不建议使用的操作
		public String getInfo() {// 此方法不建议使用
			return "这个一个Demo类。";
		}
	}
	public static void main(String[] args) {
		Demo d = new Demo();// 实例化Demo对象
		System.out.println(d.getInfo());// 编译时，将出现警告信息
	}

}
