package com.java.development.seventeen_database.lob;

import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
* @ClassName: ClobDemo03
* @Description: 使用Clob读取内容
* @author houdo
* @date 2018年11月15日 下午12:11:05
*
 */
public class ClobDemo03 {
	public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
	public static final String DBUSER = "root";
	public static final String DBPASS = "123456";

	public static void main(String[] args) {
		Connection conn = null;// 数据库连接
		PreparedStatement pstmt = null;// 数据库操作
		ResultSet rs = null;
		int id = 1;
		String sql = "select name,note from userclob where id = ?";
		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			System.out.println("查找数据成功！");
			if (rs.next()) {
				String name = rs.getString(1);// 取出name列内容
				System.out.println("姓名：" + name);
				Clob c = rs.getClob(2);// 接收全部的大文本数据
				@SuppressWarnings("unused")
				String note = c.getSubString(1, (int)c.length());
				c.truncate(5000);// 读取5000个长度的内容
				System.out.println("内容：" + c.getSubString(1, (int)c.length()));
			}
			pstmt.close();
			conn.close();
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
