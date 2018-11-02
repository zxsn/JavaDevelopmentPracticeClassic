package com.java.development.thirteen_classset.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 
    * @ClassName: PropertiesDemo03
    * @Description: 从属性文件中读取内容
    * @author Administrator
    * @date 2018年11月6日
    *
 */
public class ProperitesDemo03 {

	public static void main(String[] args) {
		Properties pro = new Properties();
		// 设置属性文件的操作路径
		File file = new File("d:" + File.separator + "area.properties");
		try {
			pro.load(new FileInputStream(file));// 读取属性文件
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("BJ属性值" + (pro.containsKey("BJ") ? "存在，" : "不存在，") + "内容是：" + pro.getProperty("BJ"));
	}

}
