package com.java.development.seventeen_database.lob;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BlobDemo02 {
	public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
	public static final String DBUSER = "root";
	public static final String DBPASS = "123456";

	public static void main(String[] args) {
		Connection conn = null;// 数据库连接
		PreparedStatement pstmt = null;// 数据库操作
		ResultSet rs = null;
		int id = 1;
		String sql = "select name,photo from userblob where id = ?";
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
				InputStream input = rs.getBinaryStream(2);// 接收数据
				FileOutputStream out = null;
				out = new FileOutputStream(new File("d:" + File.separator + "自拍.jpg"));
				int temp = 0;
				while ((temp = input.read()) != -1) {// 边读边写
					out.write(temp);
				}
				input.close();
				out.close();
			}
			pstmt.close();
			conn.close();
		}
		catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}

	}

}
