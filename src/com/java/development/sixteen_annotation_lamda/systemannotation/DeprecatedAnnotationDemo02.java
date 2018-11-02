package com.java.development.sixteen_annotation_lamda.systemannotation;

/*
 * 
    * @ClassName: DeprecatedAnnotationDemo02
    * @Description: 在类在声明使用@Deprecated注释
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class DeprecatedAnnotationDemo02 {
	@Deprecated // 声明不建议使用的操作
	static class Demo {// 定义Demo类
		public String getInfo() {// 此方法不建议使用
			return "这个一个Demo类。";
		}
	}
	public static void main(String[] args) {
		Demo d = new Demo();// 实例化Demo对象
		System.out.println(d.getInfo());// 编译时，将出现警告信息
	}

}
