package com.java.development.seventeen_database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 
    * @ClassName: ConnectionDemo02
    * @Description: 连接数据库
    * @author Administrator
    * @date 2018年11月13日
    *
 */
public class ConnectionDemo02 {
    // 定义MySQL的数据库驱动程序
	public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
    //定义MySQL数据库的连接地址
    public static final String DBURL    = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
    //MySQL数据库的连接用户名
    public static final String DBUSER   = "root";
    //MySQL数据库的连接密码
    public static final String DBPASS   = "123456";

    public static void main(String[] args) {
    	Connection conn = null;//数据库连接
        try {
            Class.forName(DBDRIVER);// 加载驱动程序
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //连接MySQL数据库时，要写上连接的用户名和密码
        try {
        	conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(conn);
        try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

}
