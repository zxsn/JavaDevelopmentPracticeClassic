package com.java.development.thirteen_classset.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 
    * @ClassName: ProperitesDemo02
    * @Description: 从XML文件中读取属性
    * @author Administrator
    * @date 2018年11月6日
    *
 */
public class ProperitesDemo05 {

	public static void main(String[] args) {
		Properties pro = new Properties();// 创建Properties对象
		// 设置属性文件的操作路径
		File file = new File("d:" + File.separator + "area.xml");
		try {
			//
			pro.loadFromXML(new FileInputStream(file));
			System.out.println("BJ属性值" + (pro.containsKey("BJ") ? "存在，" : "不存在，") + "内容是：" + pro.getProperty("BJ"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
