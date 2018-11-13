package com.java.development.seventeen_database.lob;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 
* @ClassName: BlobDemo01
* @Description: 将图片写入到数据表中
* @author houdo
* @date 2018年11月15日 下午4:03:39
*
 */
public class BlobDemo01 {
	public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
	public static final String DBUSER = "root";
	public static final String DBPASS = "123456";
	public static void main(String[] args) {
		Connection conn = null;// 数据库连接
		PreparedStatement pstmt = null;// 数据库操作
		String sql = "insert into userblob(name,photo) values(?,?)";
		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
			pstmt = conn.prepareStatement(sql);
			String name = "贾利鑫";
			// 声明一个File对象，用于找到要操作的大文本文件
			File file = new File("file" + File.separator + "自拍.jpg");
			InputStream input = null;
			input = new FileInputStream(file);
			pstmt.setString(1, name);
			pstmt.setBinaryStream(2, input, file.length());
			pstmt.executeUpdate();// 执行数据库更新操作
			System.out.println("插入数据成功！");
			input.close();
			pstmt.close();
			conn.close();
		}
		catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
