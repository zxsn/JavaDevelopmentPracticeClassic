package com.java.development.fiveteen_reflection.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * 
    * @ClassName: ClassLoaderDemo03
    * @Description: 使用自定义类加载器加载二进制文件中的类
    * @author Administrator
    * @date 2018年11月11日
    *
 */
public class ClassLoaderDemo03 {

	public class MyClassLoader extends ClassLoader {// 自定义类加载器
		public Class<?> getMyClass(String className) throws ClassNotFoundException {
			byte[] d = this.getFileData(className);// 取得指定路径的字节信息
			return super.defineClass(className, d, 0, d.length);
		}

	private byte[] getFileData(String className) {
		byte ret[] = null;
			// 定义类文件的加载路径
			try {
				File file = new File(
						"D:" + File.separator + className.substring(className.lastIndexOf(".") + 1) + ".class");
				InputStream input = new FileInputStream(file);// 实例化输入流对象
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				byte data[] = new byte[1024];// 定义每次分块读取数据的长度
				int len = 0;// 保存每次读取进来的字节个数
				while ((len = input.read(data)) != -1) {// 循环读取内容并且利用内存输出流保存
					bos.write(data, 0, len);// 将数据保存到输出流之中
				}
				ret = bos.toByteArray();// 将全部内存数据保存到返回数据之中
				bos.close();
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return ret;// 返回字节文件数据
	}
	}



	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		ClassLoaderDemo03 cld = new ClassLoaderDemo03();
		MyClassLoader mcl = cld.new MyClassLoader();// 实例化类加载器对象
		;
		Class<?> cls = mcl.getMyClass("cn.mldn.vo.Salgrade");// 类中必须有包名
		System.out.println(cls.newInstance());
	}

}
