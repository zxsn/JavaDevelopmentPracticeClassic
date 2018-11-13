package com.java.development.seventeen_database.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
* @ClassName: DeleteDemo
* @Description: 按id删除一条数据
* @author houdo
* @date 2018年11月15日 上午10:13:02
*
 */
public class DeleteDemo {
    public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
    public static final String DBUSER = "root";
    public static final String DBPASS = "123456";
    public static void main(String[] args) {
	Connection conn = null;
	Statement stmt = null;
	try {
	    Class.forName(DBDRIVER);
	    conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
	    stmt = conn.createStatement();
	    int id = 2;
	    String sql = "delete from user where id = "+id;
	    stmt.executeUpdate(sql);
	    System.out.println("删除成功！");
	    stmt.close();
	    conn.close();
	} catch (ClassNotFoundException | SQLException e) {
	    e.printStackTrace();
	}
    }
}
