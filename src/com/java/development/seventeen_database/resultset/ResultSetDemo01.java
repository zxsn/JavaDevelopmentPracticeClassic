package com.java.development.seventeen_database.resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

/**
 * 
* @ClassName: ResultSetDemo01
* @Description: 从user表中查询数据
* @author houdo
* @date 2018年11月15日 上午10:25:08
*
 */
public class ResultSetDemo01 {
    public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DBURL =  "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
    public static final String DBUSER = "root";
    public static final String DBPASS = "123456";
    
    public static void main(String[] args) {
	Connection conn = null;
	Statement stmt = null;
	ResultSet  rs = null;
	try {
	    Class.forName(DBDRIVER);
	    conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
	    stmt = conn.createStatement();
	    
	    String sql = "select id,name,password,age,sex,birthday from user" ;
	    rs = stmt.executeQuery(sql);//实例化ResultSet对象
	    System.out.println("查询结果如下：");
	    System.out.println("编号\t姓名\t密码\t年龄\t性别\t生日");
	    while (rs.next()) {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		String password = rs.getString("password");
		int age = rs.getInt("age");
		String sex = rs.getString("sex");
		java.util.Date birthday = rs.getDate("birthday");
		System.out.print(id+"\t");
		System.out.print(name+"\t");
		System.out.print(password+"\t");
		System.out.print(age+"\t");
		System.out.print(sex+"\t");
		System.out.println(new SimpleDateFormat("YYYY-MM-dd").format(birthday));
	    }
	} catch (ClassNotFoundException | SQLException e) {
	    e.printStackTrace();
	}
	    
    }

}
