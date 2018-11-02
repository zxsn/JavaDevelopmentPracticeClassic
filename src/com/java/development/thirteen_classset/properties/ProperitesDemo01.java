package com.java.development.thirteen_classset.properties;

import java.util.Properties;

/*
 * 
    * @ClassName: ProperitesDemo01
    * @Description: 设置和取得属性
    * @author Administrator
    * @date 2018年11月6日
    *
 */
public class ProperitesDemo01 {

	public static void main(String[] args) {
		Properties pro = new Properties();// 创建Properties对象
		pro.setProperty("BJ", "BeiJing");// 设置内容
		pro.setProperty("TJ", "TianJing");// 设置内容
		pro.setProperty("NJ", "NanJing");// 设置内容
		System.out.println("1、BJ属性" + (pro.containsKey("BJ") ? "存在：" : "不存在：") + pro.getProperty("BJ"));
		System.out.println("2、SC属性" + (pro.containsKey("SC") ? "存在：" : "不存在：") + pro.getProperty("SC"));
		System.out.println("3、BJ属性" + (pro.containsKey("SC") ? "存在：" : "不存在：") + pro.getProperty("SC", "没有发现"));
	}

}
