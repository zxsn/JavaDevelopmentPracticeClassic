package com.java.development.fourteen_enum.exercises;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 
    * @ClassName: Ex02
    * @Description: 定义一个Person类，其中包含姓名，年龄，生日，性别，
    *               其中性别只能是“男”或“女”。
    * @author Administrator
    * @date 2018年11月10日
    *
 */
public class Ex02 {
	public enum Sex {// 定义枚举类型
		男, 女;
	}

	public class Person {
		private String name;
		private int age;
		private Date birthday;
		private Enum<Sex> sex;

		public Person(String name, int age, Date birthday, Enum<Sex> sex) {
			this.name = name;
			this.age = age;
			this.birthday = birthday;
			this.sex = sex;
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

		public Date getBirthday() {
			return birthday;
		}

		public void setBirthday(Date birthday) {

			this.birthday = birthday;
		}

		public Enum<Sex> getSex() {
			return sex;
		}

		public void setSex(Enum<Sex> sex) {
			this.sex = sex;
		}

		@Override
		public String toString() {
			// 格式化日期
			return "姓名：" + name + ", 年龄：" + age + ", 生日：" + new SimpleDateFormat("yyyy年MM月dd日").format(birthday)
					+ ", 性别：" + sex;
		}

	}

	public static void main(String[] args) throws ParseException {
		Ex02 e2 = new Ex02();
		Person p = e2.new Person("贾利鑫", 25, new SimpleDateFormat("yyyy-MM-dd").parse("1994-08-07"), Sex.女);
		System.out.println(p);

	}

}
