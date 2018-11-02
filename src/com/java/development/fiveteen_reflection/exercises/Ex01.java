package com.java.development.fiveteen_reflection.exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * 
    * @ClassName: Ex01
    * @Description: 定义一个学生类，其中包含姓名、年龄、成绩的属性，
    * 				之后由键盘输入学生的内容，并将内容保存在文件中，
    * 				所有的操作要求全部使用反射机制完成，即不能使用通过关键字new创建学生类对象的操作。
    * @author Administrator
    * @date 2018年11月11日
    *
 */
class Student {// 学生类
	private String name;
	private int age;
	private int score;

	public Student(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	@Override
	public String toString() {
		return "姓名：" + name + ", 年龄：" + age + ", 成绩：" + score;
	}

}

class Init {// 属性操作类
	public static Properties getPro(Object obj) {
		Properties pro = new Properties();
		File f = new File("d:" + File.separator + "student.properties");// 找到属性文件
		if (f.exists()) {
			try {
				pro.load(new FileInputStream(f));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			Class<?> c = obj.getClass();// 通过数组得到Class对象
			if (!c.isArray()) {// 判断是否是数组
				return null;
			}
			// Class<?> array = c.getComponentType();// 得到数组的Class对象
			pro.setProperty("name", (String) Array.get(obj, 0));
			pro.setProperty("age", (String) Array.get(obj, 1));
			pro.setProperty("score", (String) Array.get(obj, 2));
			try {
				pro.store(new FileOutputStream(f), "Student Class");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return pro;
	}
}
public class Ex01 {

	public static void main(String[] args) {
		BufferedReader buf = null;
		buf = new BufferedReader(new InputStreamReader(System.in));
		String temp = null;
		while (true) {
			System.out.print("请输入学生的信息（姓名：年龄：成绩）：");
			try {
				temp = buf.readLine();

			} catch (IOException e) {
				e.printStackTrace();
			}
			String regex = "([\u4e00-\u9fa5]+|[abc]+)(\\:|\\：)([1][0-5]\\d|[1-9]\\d?)(\\:|\\：)(100|[1-9]\\d?|0)";
			if (temp.matches(regex)) {
				System.out.println("格式正确！");
				break;
			} else {
				System.out.println("格式不符合要求，请重新输入！");
				System.out.println("姓名为中文或英文\n年龄为1~150\n成绩为0~100");
			}
		}
		String[] s = temp.split(":|：");

		Properties pro = Init.getPro(s);// 初始化属性类
		// 找到需要反射的类放到自定义Class中
		try {
			Class<?> c = Class.forName("com.java.development.fiveteen_reflection.exercises.Student");
			// 找到刚刚反射到的类的构造方法的参数以及类型
			Constructor<?> cc = c.getDeclaredConstructor(String.class, int.class, int.class);
			// 定义一个学生类把反射到的构造方法参数放到学生类中
			Student st = (Student) cc.newInstance(pro.getProperty("name"), Integer.parseInt(pro.getProperty("age")),
					Integer.parseInt(pro.getProperty("score")));
			// 调用反射到的类的方法
			Method m = c.getDeclaredMethod("toString");
			// 输出调用的方法，并把存放在学生类中的数据放进去
			System.out.println(m.invoke(st));
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
