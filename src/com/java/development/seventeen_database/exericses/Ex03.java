package com.java.development.seventeen_database.exericses;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
* @ClassName: Ex03
* @Description: 使用键盘输入流，接收一大段文本数据，并输入一个图片的路径，
* 				然后将这些数据保存在数据表中，数据表由用户自行创建。
* @author houdo
* @date 2018年11月26日 下午2:00:26
*
 */
public class Ex03 {
	// 定义MySQL的数据库驱动程序
	public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
	// 定义MySQL数据库的连接地址
	public static final String DBURL = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
	// MySQL数据库的连接用户名
	public static final String DBUSER = "root";
	// MySQL数据库的连接密码
	public static final String DBPASS = "123456";

	class InputData {// 数据输入类
		BufferedReader buf = null;// 声明BufferedReader对象

		public InputData() {// 通过构造方法初始化对象
			buf = new BufferedReader(new InputStreamReader(System.in));
		}

		public String getString(String info) {// 从方法中得到字符串的信息
			String temp = null;
			System.out.print(info);
			try {
				temp = this.buf.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return temp;
		}

		public File getPhoneDir(String info, String err) {// 得到一个图片路径
			File file = null;
			String str = null;
			boolean flag = true;// 定义一个循环处理的标志
			while (flag) {
				str = this.getString(info);
				file = new File(str);
				if (file.isFile() && file.toString().matches(".+\\.(jpg|png|jpeg|gif)")) {
					flag = false;
				} else {
					System.out.println(err);
				}
			}
			return file;

		}
	}

	public static void main(String[] args) {
		Connection conn = null;// 数据库连接
		try {
			Class.forName(DBDRIVER);// 加载驱动程序
			// 连接MySQL数据库时，要写上连接的用户名和密码
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
			createTable(conn);// 创建表格
			setInformation(conn);// 插入信息
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static void setInformation(Connection conn) throws SQLException {
		PreparedStatement pstmt = null;// 数据库操作
		Ex03 e3 = new Ex03();
		while (true) {
			String text = e3.new InputData().getString("请输入文本信息：");
			File f = e3.new InputData().getPhoneDir("请输入图片的路径：", "输入的路径不正确！");
			String sql = "insert into info(note,phone) values (?,?)";
			pstmt = conn.prepareStatement(sql);// 实例化PreparedStatement
			InputStream input = null;
			try {
				byte[] b = text.getBytes();// 将字符串转换为字节数组
				input = new ByteArrayInputStream(b);// 将String转换为输入流
				pstmt.setAsciiStream(1, input, b.length);
				input = new FileInputStream(f);
				pstmt.setBinaryStream(2, input, f.length());
				pstmt.executeUpdate();
				pstmt.close();
				String temp = e3.new InputData().getString("是否继续添加？N取消：");
				if ("N".equals(temp) || "n".equals(temp)) {
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	private static void createTable(Connection conn) throws SQLException {// 创建数据表
		Statement stmt = null;// 数据库操作
		stmt = conn.createStatement();
		String sql = "create table if not exists info (id int auto_increment primary key,note longtext,phone longblob)";
		stmt.execute(sql);
	}

}
