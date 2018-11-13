package com.java.development.seventeen_database.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/**
 * 
* @ClassName: PreparedStatementDemo02
* @Description: 使用Preparestatement完成模糊查询
* @author houdo
* @date 2018年11月15日 上午10:53:36
*
 */
public class PreparedStatementDemo02 {
    public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
    public static final String DBUSER = "root";
    public static final String DBPASS = "123456";
    public static void main(String[] args) {
	Connection conn = null;
	PreparedStatement pstmt = null;
	String keyWord = "鑫";
	ResultSet rs = null;
	try {
	    Class.forName(DBDRIVER);
	    conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
	    String sql = "select id,name,password,age,sex,birthday from user "+
		    	"where name like ? or password like ? or sex like ?";//编写预处理SQL
	    pstmt = conn.prepareStatement(sql);//实例化PreparedStatement
	    pstmt.setString(1, "%"+keyWord+"%");
	    pstmt.setString(2, "%"+keyWord+"%");
	    pstmt.setString(3, "%"+keyWord+"%");
	    rs = pstmt.executeQuery();//实例化ResultSet对象
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
	    rs.close();//关闭结果集
	    pstmt.close();
	    conn.close();
	} catch (ClassNotFoundException | SQLException e) {
	    e.printStackTrace();
	}
    }

}
