package com.java.development.seventeen_database.exericses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * 
* @ClassName: Ex04
* @Description: 将第6章的宠物商店程序修改为使用数据库保存全部的宠物信息，并可以实现关键字查找。
* @author houdo
* @date 2018年11月26日 下午8:53:12
*
 */
interface Pet {// 宠物接口
	public String getName();

	public String getColor();

	public int getAge();
}

class Cat implements Pet {// 猫类
	private String name;
	private String color;
	private int age;

	public Cat(String name, String color, int age) {
		this.setName(name);
		this.setColor(color);
		this.setAge(age);
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public int getAge() {
		return this.age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

}

class Dog implements Pet {// 狗类
	private String name;
	private String color;
	private int age;

	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public int getAge() {
		return this.age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

}

class PetShop {
	DbOperate o = null;
	public PetShop() {
		o = new DbOperate();
	}

	public void add(Pet pet) { // 增加宠物
		o.addPet(pet);
	}
	public void search(String keyWord) {
		System.out.println("查询结果如下：");
		o.queryPet(keyWord);
	}

}

class DbOperate {// 数据库操作类
	// 定义MySQL的数据库驱动程序
	public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
	// 定义MySQL数据库的连接地址
	public static final String DBURL = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
	// MySQL数据库的连接用户名
	public static final String DBUSER = "root";
	// MySQL数据库的连接密码
	public static final String DBPASS = "123456";
	Connection conn = null;// 数据库连接
	PreparedStatement pstmt = null;// 数据库操作
	static int num = 0;

	public DbOperate() {// 构造方法初始化对象且创建宠物表
		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
			String sql = "create table if not exists pet (pid int auto_increment primary key,"
					+ "name varchar(30) not null,color varchar(20) not null,age int not null)";
			pstmt = conn.prepareStatement(sql);// 实例化对象
			pstmt.execute();
			pstmt.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public int addPet(Pet pet) {
		String sql = "insert into pet(name,color,age) values(?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);//实例化对象
			pstmt.setString(1, pet.getName());
			pstmt.setString(2, pet.getColor());
			pstmt.setInt(3, pet.getAge());
			pstmt.execute();
			num++;
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}

	public static void updateCount() {// 更新统计
		System.out.println("更新了" + num + "条数据。");
	}
	public void queryPet(String str) {
		ResultSet rs = null;
		String sql = "select name,color,age from pet "
				+ "where name like ? or color like ? or age like ?";
		try {
			pstmt = conn.prepareStatement(sql);// 实例化对象
			pstmt.setString(1, "%" + str + "%");
			pstmt.setString(2, "%" + str + "%");
			pstmt.setString(3, str);// 这里数据库中是int，不转换也可以查询
			rs = pstmt.executeQuery();// 实例化ResultSet对象
			System.out.println("昵称\t颜色\t年龄");
			while (rs.next()) {
				String name = rs.getString(1);
				String color = rs.getString(2);
				int age = rs.getInt(3);
				System.out.print(name + "\t");
				System.out.print(color + "\t");
				System.out.println(age);
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
public class Ex04 {
	public static void main(String[] args) {
		PetShop ps = new PetShop();
		ps.add(new Cat("白猫", "白色的", 2));
		ps.add(new Cat("花猫", "花色的", 3));
		ps.add(new Cat("黑猫", "黑色的", 3));
		ps.add(new Dog("拉布拉多", "黄色的", 3));
		ps.add(new Dog("金毛", "金色的", 3));
		ps.add(new Dog("黑狗", "黑色的", 3));
		DbOperate.updateCount();
		Scanner sc = null;
		while (true) {
			System.out.print("请输入要查询的宠物关键字：");
			sc = new Scanner(System.in);
			String temp = sc.nextLine();
			ps.search(temp);
			System.out.print("是否继续查询？[N]取消。");
			temp = sc.nextLine();
			if ("N".equals(temp)) {
				break;
			}
		}
		sc.close();
	}

}

