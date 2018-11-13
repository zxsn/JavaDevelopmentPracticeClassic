package com.java.development.seventeen_database.lob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
* @ClassName: ClobDemo02
* @Description: 读取大文本数据
* @author houdo
* @date 2018年11月15日 下午12:11:05
*
 */
public class ClobDemo02 {
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
				StringBuffer note = new StringBuffer();
				System.out.println("姓名：" + name);
				InputStream input = rs.getAsciiStream(2);// 接收全部的大文本数据
				// Scanner scan = new Scanner(input);// 接受数据
				// scan.useDelimiter("\r\n");// 将文件换行作为分割符\
				BufferedReader buf = new BufferedReader(new InputStreamReader(input));
				char[] c = new char[1024];
				while ((buf.read()) != -1) {
					buf.read(c);
					note.append(new String(c, 0, c.length));// 不断读取内容
				}
				System.out.println("内容：" + note);
				buf.close();
				input.close();
			}
			pstmt.close();
			conn.close();
		}
		catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}

	}

}
