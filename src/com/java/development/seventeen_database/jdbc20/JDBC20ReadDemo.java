package com.java.development.seventeen_database.jdbc20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/**
 * 
* @ClassName: JDBC20ReadDemo
* @Description: 让结果集滚动起来
* @author houdo
* @date 2018年11月15日 下午9:26:21
*
 */
public class JDBC20ReadDemo {
	// 定义MySQL的数据库驱动程序
	public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
	// 定义MySQL数据库的连接地址
	public static final String DBURL = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
	// MySQL数据库的连接用户名
	public static final String DBUSER = "root";
	// MySQL数据库的连接密码
	public static final String DBPASS = "123456";
	public static void main(String[] args) {
		Connection conn = null;// 数据库连接
		PreparedStatement pstmt = null;// 数据库操作
		ResultSet rs = null;// 保存查询结果
		String sql = "select id,name,password,age,sex,birthday from user";// 此处不需要设置任何内容
		try {
			Class.forName(DBDRIVER);
			// 连接MySQL数据库时要写上连接的用户名和密码
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);// 连接数据库
			pstmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);// 实例化对象
			rs = pstmt.executeQuery();// 实例化ResultSet对象
			System.out.println("第2条数据：");
			rs.absolute(1);
			print(rs, 1);
			System.out.println("第1条数据：");
			rs.beforeFirst();
			print(rs, 1);
			System.out.println("最后1条数据：");
			rs.afterLast();
			print(rs, -1);
			rs.close();
			pstmt.close();
			conn.close();
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	private static void print(ResultSet rs, int re) throws SQLException {
		if (re > 0) {
			rs.next();// 由前向后输出
		}
		else {
			rs.previous();// 由后向前输出
		}
		int id = rs.getInt(1);
		String name = rs.getString(2);
		String password = rs.getString(3);
		int age = rs.getInt(4);
		String sex = rs.getString(5);
		java.util.Date d = rs.getDate(6);
		System.out.println("编号\t姓名\t密码\t年龄\t性别\t生日");
		System.out.print(id + "\t");
		System.out.print(name + "\t");
		System.out.print(password + "\t");
		System.out.print(age + "\t");
		System.out.print(sex + "\t");
		System.out.println(new SimpleDateFormat("YYYY-MM-dd").format(d));
	}

}
