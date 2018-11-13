package com.java.development.seventeen_database.procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

/**
 * 
* @ClassName: ProcedureDemo
* @Description: 调用myproc存储过程
* @author houdo
* @date 2018年11月15日 下午4:56:18
*
 */
public class ProcedureDemo {
	public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
	public static final String DBUSER = "root";
	public static final String DBPASS = "123456";
	public static void main(String[] args) {
		Connection conn = null;// 数据库连接
		CallableStatement cstmt = null;// 数据库操作
		String sql = "{call myproc(?,?,?)}";// 调用过程
		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
			cstmt = conn.prepareCall(sql);// 实例化对象
			cstmt.setInt(1, 70);
			cstmt.setInt(2, 80);
			cstmt.registerOutParameter(2, Types.INTEGER);// 设置返回值类型
			cstmt.registerOutParameter(3, Types.INTEGER);// 设置返回值类型
			cstmt.execute();// 执行存储过程
			System.out.println("INOUT的返回值：" + cstmt.getInt(2));
			System.out.println("OUT的返回值：" + cstmt.getInt(3));
			cstmt.close();
			conn.close();
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
