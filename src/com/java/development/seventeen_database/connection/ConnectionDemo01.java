package com.java.development.seventeen_database.connection;

/*
 * 
    * @ClassName: ConnectionDemo01
    * @Description: 加载驱动程序
    * @author Administrator
    * @date 2018年11月13日
    *
 */
public class ConnectionDemo01 {
	// 定义MySQL的数据库驱动程序
	public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
	public static void main(String[] args) {
		try {
			Class.forName(DBDRIVER);// 加载驱动程序
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
