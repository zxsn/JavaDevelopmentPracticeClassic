package com.java.development.thirteen_classset.exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
 * 
    * @ClassName: Ex02
    * @Description: 完成一个学生管理系统，使用学号作为键添加5个学生对象，
    * 				并可以将全部的信息保存在文件中，同时实现对学生信息的
    * 				学号查找、输出全部学生信息的功能。
    * @author Administrator
    * @date 2018年11月6日
    *
 */
public class Ex02 {
	public class Student {// 学生类
		private int stNo;
		private String name;

		public Student(int stNo, String name) {
			this.stNo = stNo;
			this.name = name;
		}

		public int getStNo() {
			return stNo;
		}

		public void setStNo(int stNo) {
			this.stNo = stNo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String toString() {
			return "学号：" + this.stNo + "；姓名：" + this.name;
		}
	}

	public class FileOperate {// 文件操作类
		File file = null;
		Properties pro = null;
		public FileOperate() {
			file = new File("d:" + File.separator + "student.properties");
			pro = new Properties();
		}

		public void save(Map<Integer, String> map) {// 将学生信息写入属性文件
			Set<Map.Entry<Integer, String>> allSet = null;
			allSet = map.entrySet();
			Iterator<Map.Entry<Integer, String>> iter = null;
			iter = allSet.iterator();
			while (iter.hasNext()) {
				Map.Entry<Integer, String> me = iter.next();
				// System.out.println(me.getKey() + " = " + me.getValue());
				pro.setProperty(me.getKey().toString(), me.getValue());
			}
			try {
				// 保存属性到普通文件中，并设置注释内容
				pro.store(new FileOutputStream(file), "Student Info");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public Properties load() {// 将学生信息读取出来
			try {
				pro.load(new FileInputStream(file));// 读取属性文件
			} catch (IOException e) {
				e.printStackTrace();
			}
			return pro;
		}
	}
	public static class Operate {// 操作类
		public static void search() {// 查找学生
			Ex02 e2 = new Ex02();
			InputData input = e2.new InputData();
			while (true) {
				int temp = input.getInt("请输入要查询的学号：", "输入的数据只能是数字。");
				FileOperate fo = e2.new FileOperate();
				Properties pro = fo.load();
				if (pro.containsKey(String.valueOf(temp))) {// 这里直接使用temp无法找打键
					Student stu = e2.new Student(temp, pro.getProperty(String.valueOf(temp)));
					System.out.println(stu);
					break;
				} else {
					System.out.println("学生不存在！");
				}
			}
		}

		public static void find() {
			Ex02 e2 = new Ex02();
			FileOperate fo = e2.new FileOperate();
			Properties pro = fo.load();
			Set<Object> keys = null;
			keys = pro.keySet();
			Iterator<Object> iter = null;
			iter = keys.iterator();
			while(iter.hasNext()) {
				String temp = (String) iter.next();
				Student stu = e2.new Student(Integer.parseInt(temp), pro.getProperty(temp));
				System.out.println(stu);
			}
	}

	}

	public class InputData {// 输入类
		private BufferedReader buf = null;

		public InputData() {// 类的构造方法中实例化BufferedReader对象
			this.buf = new BufferedReader(new InputStreamReader(System.in));
		}

		public String getString(String info) {
			String temp = null;
			System.out.print(info);
			try {
				temp = this.buf.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return temp;

		}

		public int getInt(String info, String err) {
			int temp = 0;
			String str = null;
			boolean flag = true;// 定义一个循环的处理标志
			while (flag) {
				str = this.getString(info);
				if (str.matches("\\d+")) {// 判断输入的是否为数字
					temp = Integer.parseInt(str);// 将字符串变为数字
					flag = false;
				} else {
					System.out.println(err);// 出现错误，则打印传递进来的错误信息
				}
			}
			return temp;
		}
	}
	public class Menu {// 菜单类
		public Menu() {
			System.out.println("======XX学生管理程序======");
			while (true) {// 无限制调用菜单的显示
				this.show();
			}
		}

		public void show() {
			System.out.println("[1]、搜索\n[2]、查看信息\n[0]、退出");
			InputData input = new InputData();
			int i = input.getInt("请选择：", "请输入正确的选项！");
			switch (i) {
			case 1: {
				Operate.search();
				break;
			}
			case 2: {
				Operate.find();
				break;
			}
			case 0: {
				System.exit(1);
				break;
			}
			default: {
				System.out.println("请选择正确的操作！");
			}
			}
		}
	}
	public static void main(String[] args) {
		Ex02 e2 = new Ex02();
		Map<Integer, String> map = new HashMap<Integer, String>();
		Student s1 = e2.new Student(1, "张三");
		Student s2 = e2.new Student(2, "李四");
		Student s3 = e2.new Student(3, "王五");
		Student s4 = e2.new Student(4, "赵六");
		Student s5 = e2.new Student(5, "孙七");
		map.put(s1.getStNo(), s1.getName());
		map.put(s2.getStNo(), s2.getName());
		map.put(s3.getStNo(), s3.getName());
		map.put(s4.getStNo(), s4.getName());
		map.put(s5.getStNo(), s5.getName());
		e2.new FileOperate().save(map);// 写入学生信息
		e2.new Menu();
	}

}
