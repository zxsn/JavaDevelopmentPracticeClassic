package com.java.development.seventeen_database.jdbc20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC20UpdateDemo {
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
		String sql = "select id,name,password,age,sex,birthday from user where id = ?";// 此处不需要设置任何内容
		try {
			Class.forName(DBDRIVER);// 加载驱动程序
			// 连接MySQL数据库时要写上连接的用户名和密码
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);// 连接数据库
			pstmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);// 实例化对象
			pstmt.setInt(1, 3);// 更新3号用户
			rs = pstmt.executeQuery();// 实例化ResultSet对象
			rs.last();// 移动到最后一行
			rs.updateString("name", "李藏");
			rs.updateString("password", "lz");
			rs.updateInt("age", 23);
			rs.updateString("sex", "女");
			rs.updateDate("birthday", new java.sql.Date(new java.util.Date().getTime()));// 将今天的日期设置为生日
			rs.updateRow();// 更新数据
			System.out.println("更新成功！");
			rs.close();
			pstmt.close();
			conn.close();
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
