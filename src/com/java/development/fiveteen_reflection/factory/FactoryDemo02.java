package com.java.development.fiveteen_reflection.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 
    * @ClassName: FactoryDemo02
    * @Description: 结合属性文件的工厂模式
    * @author Administrator
    * @date 2018年11月11日
    *
 */
public class FactoryDemo02 {
	public static class Init {// 定义初始化操作类
		public static Properties getPro() {
			Properties pro = new Properties();// 实例化 属性类
			File f = new File("d:" + File.separator + "fruit.properties");// 找到属性文化
			try {
				if (f.exists()) {// 属性文件中已存在
					pro.load(new FileInputStream(f));// 读取属性
				} else {
					pro.setProperty("apple", "com.java.development.fiveteen_reflection.factory.Apple");
					pro.setProperty("orange", "com.java.development.fiveteen_reflection.factory.Orange");
					pro.store(new FileOutputStream(f), "FRUIT CLASS");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			return pro;

		}
	}

	public static class Factory {
		@SuppressWarnings("deprecation")
		public static Fruit getInstance(String className) {// 取得接口实例
			Fruit fruit = null;// 定义接口对象
			try {
				fruit = (Fruit) Class.forName(className).newInstance();// 实例化对象
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			}
			return fruit;

		}
	}
	public static void main(String[] args) {
		Properties pro = Init.getPro();// 初始化属性类
		// 通过工厂类取得接口实例，通过属性的key传入完整的包.类名称
		Fruit f = Factory.getInstance(pro.getProperty("apple"));
		if (f != null) {// 判断是否取得接口实例
			f.eat();
		}
	}

}
