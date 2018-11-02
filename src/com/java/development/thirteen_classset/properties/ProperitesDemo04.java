package com.java.development.thirteen_classset.properties;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 
    * @ClassName: ProperitesDemo02
    * @Description: 将属性保存到XML文件之中
    * @author Administrator
    * @date 2018年11月6日
    *
 */
public class ProperitesDemo04 {

	public static void main(String[] args) {
		Properties pro = new Properties();// 创建Properties对象
		pro.setProperty("BJ", "BeiJing");// 设置内容
		pro.setProperty("TJ", "TianJing");// 设置内容
		pro.setProperty("NJ", "NanJing");// 设置内容
		// 设置属性文件的保存路径
		File file = new File("d:" + File.separator + "area.xml");
		try {
			// 保存属性到普通文件之中，并设置注释内容
			pro.storeToXML(new FileOutputStream(file), "Area Info");
			System.out.println("写入完成！");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
