package com.java.development.seventeen_database.tran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
* @ClassName: TranDemo01
* @Description: 没有使用事务处理
* @author houdo
* @date 2018年11月17日 下午3:50:29
*
 */
public class TranDemo01 {
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
		Statement stmt = null;// 数据库操作
		try {
			Class.forName(DBDRIVER);// 加载驱动程序
			// 连接MySQL数据库时要写上连接的用户名和密码
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);// 连接数据库
			stmt = conn.createStatement();// 实例化对象
			// 加入5条SQL处理语句
			stmt.addBatch("insert into user(name,password,age,sex,birthday)" +
					" values('JLX-1','jlx-1',11,'女','1975-03-05')");
			stmt.addBatch("insert into user(name,password,age,sex,birthday)" +
					" values('JLX-2','jlx-2',12,'女','1975-03-06')");
			// 第3个预处理语句估计是写错，将名字写成“JLX-'3”，多了一个“'”
			stmt.addBatch("insert into user(name,password,age,sex,birthday)" +
					" values('JLX-'3','jlx-3',11,'女','1975-03-07')");
			stmt.addBatch("insert into user(name,password,age,sex,birthday)" +
					" values('JLX-4','jlx-4',11,'女','1975-03-08')");
			stmt.addBatch("insert into user(name,password,age,sex,birthday)" +
					" values('JLX-5','jlx-5',11,'女','1975-03-09')");
			int temp[] = stmt.executeBatch();// 批量执行
			System.out.println("更新了" + temp.length + "条数据。");
			stmt.close();// 操作关闭
			conn.close();// 数据库关闭
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
