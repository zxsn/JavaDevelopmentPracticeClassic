package com.java.development.seventeen_database.jdbc20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 
* @ClassName: JDBC20BatchDemo
* @Description: 批处理操作
* @author houdo
* @date 2018年11月16日 上午8:10:16
*
 */
public class JDBC20BatchDemo {
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
		String sql = "insert into user(name,password,age,sex,birthday) values(?,?,?,?,?)";// 此处使用预处理操作
		try {
			Class.forName(DBDRIVER);// 加载驱动程序
			// 连接MySQL数据库时要写上连接的用户名和密码
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);// 连接数据库
			pstmt = conn.prepareStatement(sql);// 实例化对象
			for (int i = 0; i < 10; i++) {
				pstmt.setString(1, "贾利鑫-" + i);
				pstmt.setString(2, "jlx-" + i);
				pstmt.setInt(3, 25 + i);
				pstmt.setString(4, "女");
				pstmt.setDate(5, new java.sql.Date(new java.util.Date().getTime()));
				pstmt.addBatch();// 加入批处理等待执行
			}
			int temp[] = pstmt.executeBatch();// 批量执行
			System.out.println("更新了" + temp.length + "条数据。");
			pstmt.close();
			conn.close();
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
