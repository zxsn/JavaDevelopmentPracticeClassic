package com.java.development.seventeen_database.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @ClassName: UpdateDemo
 * @Description: 数据库修改操作
 * @author houdo
 * @date 2018年11月15日 上午9:18:14
 *
 */
public class UpdateDemo {
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
	    String name = "张三";
	    String password = "zs";
	    int age = 31;
	    String sex = "男";
	    String birthday = "1988-01-01";
	    String sql = "update user set name = '" + name + "',password = '" + password + "',age = " + age + ",sex = '" + sex
		    + "',birthday = '" + birthday + "' where id = " + id;
	    stmt.executeUpdate(sql);
	    System.out.println("更新成功！");
	    stmt.close();
	    conn.close();
	} catch (ClassNotFoundException | SQLException e) {
	    e.printStackTrace();
	}

    }

}
