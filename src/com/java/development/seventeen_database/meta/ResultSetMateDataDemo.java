package com.java.development.seventeen_database.meta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 * 
* @ClassName: ResultSetMateDataDemo
* @Description: 取得ResultSet的MeteData
* @author houdo
* @date 2018年11月18日 上午9:33:43
*
 */
public class ResultSetMateDataDemo {
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
		PreparedStatement pstmt = null;// 数据库操作对象
		ResultSetMetaData rsmd = null;// 结果集元数据
		try {
			Class.forName(DBDRIVER);// 加载驱动程序
			// 连接MySQL数据库时要写上连接的用户名和密码
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);// 连接数据库
			String sql = "select id,name,password,age,sex,birthday from user";
			pstmt = conn.prepareStatement(sql);// 实例化对象
			rsmd = pstmt.getMetaData();// 得到结果集元数据
			System.out.println("一共返回" + rsmd.getColumnCount() + "条数据。");
			if (rsmd.isAutoIncrement(1)) {// 判断指定列是否是自动增长的
				System.out.println(rsmd.getCatalogName(1) + "列是自动增长的。");
			}
			pstmt.close();// 操作对象关闭
			conn.close();// 数据库关闭
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
