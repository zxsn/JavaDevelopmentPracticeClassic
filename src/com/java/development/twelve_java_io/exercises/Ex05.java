
/**  
* @Title: Ex05.java
* @Package com.java.development.twelve_java_io.exercises
* @Description:将第4题的内容进行扩展，可以将全部的输入信息保存在文件中，
* 还可以添加信息，并可以显示全部的数据
* @author Administrator
* @date 2018年10月31日
* @version V1.0  
*/

package com.java.development.twelve_java_io.exercises;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * @ClassName: Ex05
 * @Description: 将第4题的内容进行扩展，可以将全部的额输入信息保存在文件中，还可以添加信息，并可以显示全部的数据。
 * @author Administrator
 * @date 2018年10月31日
 *
 */

public class Ex05 {
	class Student implements Comparable<Student> {
		private String name;
		private float score;

		/**
		 * 创建一个新的实例 Student.
		 *
		 * @param name
		 * @param age
		 * @param score
		 */

		public Student(String name, float score) {
			this.name = name;
			this.score = score;
		}

		/**
		 * @return name
		 */

		public String getName() {
			return name;
		}

		/**
		 * @param name
		 *            the name to set
		 */

		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return score
		 */

		public float getScore() {
			return score;
		}

		/**
		 * @param score
		 *            the score to set
		 */

		public void setScore(float score) {
			this.score = score;
		}

		/*
		 * (非 Javadoc)
		 * 
		 * 
		 * @return
		 * 
		 * @see java.lang.Object#toString()
		 */

		@Override
		public String toString() {
			return name + "\t" + score;
		}

		/*
		 * (非 Javadoc)
		 * 
		 * 
		 * @param o
		 * 
		 * @return
		 * 
		 * @see java.lang.Comparable#compareTo(java.lang.Object)
		 */

		@Override
		public int compareTo(Student stu) {// 覆写comopareTo()方法，实现排序规则的应用
			if (this.score > stu.score) {// 成绩由高到低
				return -1;
			} else if (this.score < stu.score) {
				return 1;
			} else {
				return 0;

			}
		}

	}



	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "student.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		Scanner scan = null;
		scan = new Scanner(System.in);
		String input;
		while (true) {
			System.out.println("======xx系统======");
			System.out.println("请输入要操作的选项（数字）：");
			System.out.println("[1] 添加数据\t[2] 查看数据\t[0] 退出系统");
			input = scan.nextLine();
			if ("1".equals(input) || "2".equals(input)) {
				switch (input) {
					case "1" : {
						add(file, scan);
						break;
					}
					case "2" : {
						find(file);
						break;
					}
					default : {
						System.out.println("请重新输入。");
					}
				}
				}
			if ("0".equals(input)) {
				System.out.println("谢谢使用本系统。");
				System.exit(1);
			}
		}
	}

	private static void find(File file) throws Exception {
		System.out.println("选择的是查看操作。");
		Ex05 e5 = new Ex05();
		DataInputStream dis = null;
		final Student stu[] = new Student[50];// 创建Student对象数组
		int i = 0;
		dis = new DataInputStream(new FileInputStream(file));
		if (file.length() == 0) {
			System.out.println("数据为空！请先添加数据。");
			//System.exit(1);
		} else {
			String name = null;// 接收名称
			float score = 0.0f;// 接收成绩
			char temp[] = null;// 接收字符串数据
			char c = 0;// 声明字符变量，接收读取数据
			int len = 0;
			int num = 0;
			try {
				while (true) {// 循环读取
					temp = new char[200];// 开辟空间
					len = 0;// 此处必须清空字符串下标，否则读到的数据前面有空格
					 while ((c = dis.readChar()) != '\t') {// 读取字符
						  temp[len++] = c; 
					 }
					name = new String(temp, 0, len);// 将字符数组变为String
					score = dis.readFloat();// 读取Float
					dis.readChar();// 读取\n
					stu[i] = e5.new Student(name, score);
					// System.out.printf("姓名：%s；成绩：%5.2f\n", name, score);
					// System.out.println(stu[i]);
					i++;// 这里必须分开累加，否则无法赋值给stu
				}
			} catch (Exception e) {
			} finally {
				System.out.println("姓名\t成绩");
				/*Student stu1[] = new Student[3];
				stu1[0] = stu[0];
				stu1[1] = stu[1];
				stu1[2] = stu[2];*/
				for(int j = 0; j < stu.length; j++) {//统计student对象数组中不为空的个数
					if(stu[j]!=null)
						num++;
				}
				Student stuTemp[] =new Student[num];
				for(int j = 0; j < num; j++) {//将不为空的student对象数组保存到另一个数组中
					stuTemp[j] = stu[j];
				}
				
				java.util.Arrays.sort(stuTemp);//因为sort()方法不能比较数组对象中包含null的对象，所以必须去掉null值
				for (int j = 0; j < stuTemp.length; j++) {
					System.out.println(stuTemp[j]);
				}
			}
		}
		dis.close();
	}

	private static void add(File file, Scanner scan) throws Exception {
		System.out.println("选择的是添加操作。");
		//Scanner input = null;
		//input = new Scanner(System.in);
		DataOutputStream dos = null;
		Ex05 e5 = new Ex05();
		while (true) {
			System.out.println("请输入数据，数据格式为（最少3组）：\n姓名：成绩|姓名：成绩|姓名：成绩|...");
			String str = scan.nextLine();
			String regex = "^([\u4e00-\u9fa5]+(\\:|\\：)\\d+\\.?\\d+\\|){2,}([\u4e00-\u9fa5]+(\\:|\\：)\\d+\\.?\\d+)$";
			if (str.matches(regex)) {
				String s[] = str.split("\\|");// 按照|拆分
				Student stu[] = new Student[s.length];// 创建Student对象数组
				dos = new DataOutputStream(new FileOutputStream(file,true));
				for (int i = 0; i < s.length; i++) {
					String data[] = s[i].split("\\:|\\：");// 按照:拆分
					stu[i] = e5.new Student(data[0], Float.parseFloat(data[1]));
					dos.writeChars(data[0]);
					dos.writeChar('\t');
					dos.writeFloat(Float.parseFloat(data[1]));
					dos.writeChar('\n');
				}
				System.out.println("添加成功！");
				java.util.Arrays.sort(stu);
				System.out.println("姓名" + "\t成绩");
				for (Student student : stu) {
					System.out.println(student);
				}
				dos.close();
				break;
			} else
				System.out.println("格式不符合，请重新输入。");
			//input.close();
		}

	}

}
