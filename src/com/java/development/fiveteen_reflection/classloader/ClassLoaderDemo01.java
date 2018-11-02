package com.java.development.fiveteen_reflection.classloader;

/*
 * 
    * @ClassName: ClassLoaderDemo01
    * @Description: 取得类加载器
    * @author Administrator
    * @date 2018年11月11日
    *
 */
public class ClassLoaderDemo01 {

	public static void main(String[] args) {
		Class<?> cls = ClassLoaderDemo01.class;
		System.out.println(cls.getClassLoader());
		System.out.println(cls.getClassLoader().getParent());
	}

}
