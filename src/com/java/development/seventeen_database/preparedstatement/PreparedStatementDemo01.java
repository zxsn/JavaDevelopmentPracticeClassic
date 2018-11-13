package com.java.development.seventeen_database.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 
* @ClassName: PreparedStatementDemo01
* @Description: 使用Preparestatement完成数据插入操作
* @author houdo
* @date 2018年11月15日 上午10:53:36
*
 */
public class PreparedStatementDemo01 {
    public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
    public static final String DBUSER = "root";
    public static final String DBPASS = "123456";
    public static void main(String[] args) {
	Connection conn = null;
	PreparedStatement pstmt = null;
	try {
	    Class.forName(DBDRIVER);
	    conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
	    String name = "李四";
	    String password = "ls";
	    int age = 36;
	    String sex = "男";
	    String birthday = "1983-07-26";
	    java.util.Date temp = null;
	    temp = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
	    //通过java.util.Date取出具体的日期数，并将其变为java.sql.Date类型
	    java.sql.Date bir = new java.sql.Date(temp.getTime());
	    String sql = "insert into user(name,password,age,sex,birthday)"+
		    	"values(?,?,?,?,?)";//编写预处理SQL
	    pstmt = conn.prepareStatement(sql);//实例化PreparedStatement
	    pstmt.setString(1, name);
	    pstmt.setString(2,password);
	    pstmt.setInt(3, age);
	    pstmt.setString(4, sex);
	    pstmt.setDate(5, bir);
	    pstmt.executeUpdate();//执行数据库更新操作，不需要SQL
	    System.out.println("插入成功！");
	    pstmt.close();
	    conn.close();
	} catch (ClassNotFoundException | SQLException | ParseException e) {
	    e.printStackTrace();
	}
    }

}
