package com.java.development.seventeen_database.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @ClassName: InsertDemo01
 * @Description: 插入数据
 * @author houdo
 * @date 2018年11月14日 下午7:48:18
 *
 */

public class InsertDemo01 {
    // 定义MySQL的数据库驱动程序
    public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
    // 定义MySQL数据库的连接地址
    public static final String DBURL = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
    // 定义MySQL数据库的用户名
    public static final String DBUSER = "root";
    // 定义MySQL数据库的密码
    public static final String DBPASS = "123456";

    public static void main(String[] args) {
	Connection conn = null;// 数据库连接
	Statement stmt = null;// 数据库操作
	try {
	    Class.forName(DBDRIVER);// 加载驱动
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}
	try {
	    conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);// 连接MySQL数据库
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	String sql = "insert into user(name,password,age,sex,birthday)" + "values('侯媛婷','hyt',18,'女','2001-04-15')";
	try {
	    stmt = conn.createStatement();// 实例化Statement对象
	    stmt.executeUpdate(sql);// 执行数据库更新操作
	    System.out.println("插入数据成功！");
	} catch (SQLException e) {
	    System.out.println("插入数据失败！");
	    e.printStackTrace();
	}
	try {
	    stmt.close();
	    conn.close();
	} catch (SQLException e) {
	    e.printStackTrace();
	}

    }

}
