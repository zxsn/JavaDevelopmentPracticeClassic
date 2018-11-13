package com.java.development.seventeen_database.meta;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * 
* @ClassName: DatabaseMetaDataDemo
* @Description: 使用DatabaseMetaData取得数据库的元信息
* @author houdo
* @date 2018年11月17日 下午4:23:06
*
 */
public class DatabaseMetaDataDemo {
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
		DatabaseMetaData dmd = null;// 数据库元数据
		ResultSet rs = null;// 结果集对象
		try {
			Class.forName(DBDRIVER);// 加载驱动程序
			// 连接MySQL数据库时要写上连接的用户名和密码
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);// 连接数据库
			dmd = conn.getMetaData();// 实例化元数据
			System.out.println("数据库名称：" + dmd.getDatabaseProductName());
			System.out.println("数据库版本：" + dmd.getDriverMajorVersion() + "." + dmd.getDriverMajorVersion());
			rs = dmd.getPrimaryKeys(null, null, "user");// 得到表的主键
			while (rs.next()) {
				System.out.println("表类别：" + rs.getString(1));
				System.out.println("表模式：" + rs.getString(2));
				System.out.println("表名称：" + rs.getString(3));
				System.out.println("列名称：" + rs.getString(4));
				System.out.println("主键序列号：" + rs.getString(5));
				System.out.println("主键名称：" + rs.getString(6));
			}
			conn.close();// 数据库关闭
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
