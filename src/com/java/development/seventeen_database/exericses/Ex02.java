package com.java.development.seventeen_database.exericses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 
* @ClassName: Ex02
* @Description: 编写一个程序，可以通过此程序完成一个表的创建操作，
* 				输入表名称、各个列的名称以及类型，
* 				输入完成后直接通过JDBC创建指定的表。
* @author houdo
* @date 2018年11月25日 下午3:29:40
*
 */
public class Ex02 {

	// 定义MySQL的数据库驱动程序
	public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
	// 定义MySQL数据库的连接地址
	public static final String DBURL = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
	// MySQL数据库的连接用户名
	public static final String DBUSER = "root";
	// MySQL数据库的连接密码
	public static final String DBPASS = "123456";

	class InputData {// 数据输入类
		BufferedReader buf = null;// 声明BufferedReader对象

		public InputData() {// 通过构造方法初始化对象
			buf = new BufferedReader(new InputStreamReader(System.in));
		}

		public String getString(String info) {// 从方法中得到字符串的信息
			String temp = null;
			System.out.print(info);
			try {
				temp = this.buf.readLine();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return temp;
		}

		public String getTableString(String info, String err) {// 得到表的列名称及类型
			String temp = null;
			boolean flag = true;
			while (flag) {
				System.out.println("类型有：int,varchar(i),float,date等。");
				System.out.println("描述有：auto_increment;not null;primary key;default等。");
				System.out.println("如：id int auto_increment primary key");
				temp = new InputData().getString(info);
				String s[] = temp.split(" ");
				// 这里只判断列名称和类型输入了没有，至于正确性交给数据库
				if (s.length > 1) {
					flag = false;
				}
				else {
					System.out.println(err);
				}
			}
			return temp;
		}
	}

	public static void main(String[] args) {
		Connection conn = null;// 数据库连接
		Statement stmt = null;// 数据库操作
		Ex02 e2 = new Ex02();
		InputData input = e2.new InputData();
		boolean temp = false;
		while (!temp) {
			try {
				Class.forName(DBDRIVER);// 加载驱动程序
				// 连接MySQL数据库时，要写上连接的用户名和密码
				conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
				String name = input.getString("请输入表名：");
				List<String> allList = new ArrayList<String>();// 存放列信息
				while (true) {
					String row = input.getTableString("请输入表的列定义：", "列要求至少有名称和类型。");
					allList.add(row);
					String end = input.getString("是否继续？N取消。");
					if ("N".equals(end) || "n".equals(end)) {
						break;
					}
				}
				String sql = "create table if not exists " + name + "(";
				for (int i = 0; i < allList.size(); i++) {
					sql += allList.get(i) + ",";
				}
				sql = sql.substring(0, sql.length() - 1);
				sql += ")";
				// System.out.println(sql);
				stmt = conn.createStatement();// 实例化Statement
				stmt.execute(sql);
				temp = true;
				System.out.println("创建表成功！");
			}
			catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			finally {
				try {
					stmt.close();
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
