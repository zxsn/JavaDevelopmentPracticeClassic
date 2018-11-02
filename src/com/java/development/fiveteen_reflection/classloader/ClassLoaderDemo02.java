package com.java.development.fiveteen_reflection.classloader;

/*
 * 
    * @ClassName: ClassLoaderDemo02
    * @Description: 使用自定义类加载器
    * @author Administrator
    * @date 2018年11月11日
    *
 */
class Salgrade {// 这里不能定义成内部类，否则不能实例化对象
	public Salgrade() {
		System.out.println("*****实例化Salgrade对象*****");
	}
}
public class ClassLoaderDemo02 {

	public class MyClassLoader extends ClassLoader {// 自定义类加载器
		public Class<?> getMyClass(String className) throws ClassNotFoundException {
			return super.loadClass(className);
		}
	}



	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		ClassLoaderDemo02 cld = new ClassLoaderDemo02();
		MyClassLoader mcl = cld.new MyClassLoader();// 实例化类加载器对象
		Class<?> cls = mcl
				.getMyClass("com.java.development.fiveteen_reflection.classloader.Salgrade");
		System.out.println(cls.newInstance());
	}

}
