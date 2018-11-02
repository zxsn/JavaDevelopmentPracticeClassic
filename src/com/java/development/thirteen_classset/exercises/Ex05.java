package com.java.development.thirteen_classset.exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 
    * @ClassName: Ex05
    * @Description: 将本章中讲解的一对多关系加入菜单及文件的操作，可以实现一个学校————学生的管理系统
    * @author Administrator
    * @date 2018年11月7日
    *
 */
public class Ex05 implements Serializable {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */

	private static final long serialVersionUID = 1L;

	public class Student implements Serializable {

		private static final long serialVersionUID = 1L;
		// 定义学生类
		private String name;
		private int age;
		private School school;// 一个学生属于一个学校

		public Student(String name, int age) {// 通过构造设置内容
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public School getSchool() {// 返回所在学校
			return school;
		}

		public void setSchool(School school) {// 设置所在学校
			this.school = school;
		}

		public String toString() {
			return "学生姓名：" + this.name + "；学生年龄：" + this.age;
		}
	}

	public class School implements Serializable {

		/**
		 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
		 */

		private static final long serialVersionUID = 1L;
		// 定义学校类
		private String name;
		private List<Student> allStudents;// 一个学校有多个学生

		public School() {// 无参构造
			this.allStudents = new ArrayList<Student>();// 实例化List集合
		}

		public School(String name) {
			this(); // 调用无参构造
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<Student> getAllStudents() {// 得到全部的学生
			return allStudents;
		}

		public String toString() {
			return "学校名称：" + this.name;
		}
	}

	public class InputData {
		private BufferedReader buf = null;

		/**
		 * 创建一个新的实例 InputData.
		 *
		 */

		public InputData() {// 类的构造方法中，实例化BufferedReader对象
			this.buf = new BufferedReader(new InputStreamReader(System.in));
		}

		public String getString(String info) {
			String temp = null;
			System.out.print(info);// 打印提示信息
			try {
				temp = buf.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return temp;
		}

		public int getInt(String info, String err) {// 得到以一个整数的输入数据
			int temp = 0;
			String str = null;
			boolean flag = true;// 定义一个循环的处理标志
			while (flag) {
				str = this.getString(info);
				if (str.matches("^\\d+$")) {// 判断输入的是否是数字
					temp = Integer.parseInt(str);// 将字符串变为数字
					flag = false;
				} else {
					System.out.println(err);// 出现错误，则打印传递进的错误信息
				}
			}
			return temp;

		}

	}

	public class FileOperate {
		File file = new File("d:" + File.separator + "school.txt");

		public FileOperate() {

		}

		public void save(School sc) {
			ObjectOutputStream oos = null;
			try {
				OutputStream out = new FileOutputStream(file);// 文件输出流
				oos = new ObjectOutputStream(out);// 为对象输出流实例化
				oos.writeObject(sc);
				// System.out.println(sc.getAllStudents());
				List<Student> allStu = sc.getAllStudents();
				// List是接口，不能被实例化。需要转成数组
				Student stu[] = allStu.toArray(new Student[allStu.size()]);
				for (int i = 0; i < stu.length; i++) {
					oos.writeObject(stu[i]);
				}
				oos.flush();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (oos != null) {
					try {
						oos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

		public School read() {
			ObjectInputStream ois = null;
			School sc1 = null;
			try {
				InputStream is = new FileInputStream(file);// 文件输入流
				ois = new ObjectInputStream(is);// 为对象输入流实例化
				sc1 = (School) ois.readObject();
				// System.out.println(sc1.getAllStudents());
				/*
				 * 这里读取Student会出现类型转换异常，无法读取Student Student stu[] = (Student[])
				 * ois.readObject();// 反序列化读取数据 for (int i = 0; i < stu.length; i++) {
				 * System.out.println(stu[i]); }
				 */
				// System.out.println("******************");

			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			return sc1;
		}
	}

	public class Operate {
		InputData input;

		// Set<Student> allSet = null;
		Student stu;
		School sc;
		public Operate() {
			input = new InputData();
			// allSet = new HashSet<Student>();
		}

		public void add() {
			String temp = input.getString("请输入学校名称：");
			sc = new School(temp);
			while (true) {
				String name = input.getString("请输入学生姓名：");
				int age = input.getInt("请输入年龄：", "请输入正确的格式！");
				stu = new Student(name, age);
				sc.getAllStudents().add(stu);
				stu.setSchool(sc);
				if ("n".equals(input.getString("继续添加？输入n取消："))) {
					break;
				}
			}
			System.out.println(stu.getSchool());
			// 实例化Iterator对象，用于输出全部的学生信息
			Iterator<Student> iter = sc.getAllStudents().iterator();
			while (iter.hasNext()) {// 迭代输出
				Student stu = iter.next();
				System.out.println("\t|" + stu);
			}
			new FileOperate().save(sc);
		}

		public void delete() {

			School sc = find();
			Iterator<Student> iter = sc.getAllStudents().iterator();
			while (iter.hasNext()) {// 迭代输出
				Student stu = iter.next();
				String temp = input.getString("请输入要删除的学生的姓名：");
				if (temp.equals(stu.getName())) {
					iter.remove();
					new FileOperate().save(sc);
					System.out.println("删除成功。");
					break;
				} else
					System.out.println("学生不存在，请重新输入！");
			}
		}

		public void update() {
			School sc = find();
			Iterator<Student> iter = sc.getAllStudents().iterator();
			while (iter.hasNext()) {// 迭代输出
				Student stu = iter.next();
				String temp = input.getString("请输入要更新的学生的姓名：");
				if (temp.equals(stu.getName())) {
					String name = input.getString("请输入新的姓名：");
					stu.setName(name);
					int age = input.getInt("请输入年龄：", "输入的格式不正确！");
					stu.setAge(age);
					new FileOperate().save(sc);
					System.out.println("更新成功。");
					break;
				} else
					System.out.println("学生不存在，请重新输入！");
			}
		}

		public School find() {
			File file = new File("d:" + File.separator + "school.txt");
			School sch = null;
			if (file.length() != 0) {// 判断文件是否存在或非空
				sch = new FileOperate().read();
				System.out.println(sch.getAllStudents());
			} else
				System.out.println("请先添加数据！");
			return sch;
		}

	}

	public static class Menu {
		Ex05 e5 = new Ex05();
		InputData input = e5.new InputData();// 还是使用之前的输入数据程序

		public Menu() {
			while (true) {
				this.show();// 无限制调用菜单的显示
			}
		}

		public void show() {
			System.out.println("====xxx学校——学生系统====");
			System.out.println("[1]、增加操作");
			System.out.println("[2]、删除操作");
			System.out.println("[3]、修改操作");
			System.out.println("[4]、查看操作");
			System.out.println("[0]、系统退出\n");
			int i = input.getInt("请选择：", "请输入正确的选项！");
			switch (i) {
			case 1: {
				e5.new Operate().add();// 调用操作类的增加操作
				break;
			}
			case 2: {
				e5.new Operate().delete();// 调用操作类的删除操作
				break;
			}
			case 3: {
				e5.new Operate().update();// 调用操作类的更新操作
				break;
			}
			case 4: {
				e5.new Operate().find();// 调用操作类的查找操作
				break;
			}
			case 0: {
				System.exit(1);// 系统退出
				break;
			}
			default: {
				System.out.println("请选择正确的操作！");
			}
			}
		}

	}

	public static void main(String[] args) {
		// Ex05 e5 = new Ex05();
		new Menu();
	}

}
