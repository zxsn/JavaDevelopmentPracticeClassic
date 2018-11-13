package com.java.development.seventeen_database.lob;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 
* @ClassName: ClobDemo01
* @Description: 写入大文本数据
* @author houdo
* @date 2018年11月15日 下午12:11:05
*
 */
public class ClobDemo01 {
    public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
    public static final String DBUSER = "root";
    public static final String DBPASS = "123456";
    public static void main(String[] args) {
	Connection conn = null;//数据库连接
	PreparedStatement pstmt = null;//数据库操作
	String name = "星辰变";
	String sql = "insert into userclob(name,note) values(?,?)";
	try {
	    Class.forName(DBDRIVER);
	    conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
	    pstmt = conn.prepareStatement(sql);
	    //声明一个File对象，用于找到要操作的大文本文件
	    File file = new File("file"+File.separator+"星辰变.txt");
	    InputStream input = null;//通过输入流读取内容
	    input = new FileInputStream(file);
	    pstmt.setString(1, name);
	    pstmt.setAsciiStream(2, input,file.length());
	    pstmt.executeUpdate();
	    System.out.println("插入数据成功！");
	} catch (ClassNotFoundException | SQLException | FileNotFoundException e) {
	    e.printStackTrace();
	}
	
    }

}
