package com.java.development.seventeen_database.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
* @ClassName: InsertDemo02
* @Description: 插入数据的另一种写法
* @author houdo
* @date 2018年11月14日 下午8:13:03
*
 */
public class InsertDemo02 {
    public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
    public static final String DBUSER = "root";
    public static final String DBPASS = "123456";
    public static void main(String[] args) {
	Connection conn =null;//数据库连接
	Statement stmt = null;//数据库操作
	try {
	    Class.forName(DBDRIVER);
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}
	try {
	    conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
	    String name = "杨晓旋";
	    String password = "yxx";
	    int age = 25;
	    String sex = "男";
	    String birthday = "1994-09-15";
	    String sql = "insert into user(name,password,age,sex,birthday)"+
		    	"values('"+name+"','"+password+"',"+age+",'"+sex+"','"+birthday+"')";
	    stmt = conn.createStatement();
	    stmt.executeUpdate(sql);//执行SQL语句
	    System.out.println("插入数据成功！");
	    stmt.close();
	    conn.close();
	} catch (SQLException e) {
	    System.out.println("插入数据失败！");
	    e.printStackTrace();
	}
    }

}
