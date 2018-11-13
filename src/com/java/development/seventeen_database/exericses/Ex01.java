package com.java.development.seventeen_database.exericses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
* @ClassName: Ex01
* @Description: 建立一个用户表（数据表和表中的数据列由用户自行创建），
* 				表的名称和列的定义都使用键盘输入，并在数据库之中创建此表。
* @author houdo
* @date 2018年11月18日 上午9:34:52
*
 */
public class Ex01 {
	// 定义MySQL的数据库驱动程序
	public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
	// 定义MySQL数据库的连接地址
	public static final String DBURL = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
	// MySQL数据库的连接用户名
	public static final String DBUSER = "root";
	// MySQL数据库的连接密码
	public static final String DBPASS = "123456";
	public static String sql1 = null;
	static Ex01 e1 = new Ex01();

	class InputData {// 数据输入类
		private BufferedReader buf = null;

		public InputData() {
			this.buf = new BufferedReader(new InputStreamReader(System.in));
		}

		public String getString(String info) {// 输入字符串
			String temp = null;
			System.out.print(info);
			try {
				temp = buf.readLine();
			} catch (IOException ee) {
				ee.printStackTrace();
			}
			return temp;
		}

		public String getTableString(String info, String err) {// 输入列的名称及类型
			String temp = null;
			boolean flag = false;
			while (flag == false) {
				System.out.println("类型有：INT,VARCHAR(M),FLOAT,描述有：AUTO_INCREMENT,NOT NULL,DEFAULT'男',PRIMARY KEY已经有不用.");
				temp = new InputData().getString(info);
				String s[] = temp.split(" ");
				if (s.length > 1) {
					flag = true;
				} else {
					System.out.println(err);
				}
			}
			return temp;
		}

		// 下面方法判断输入的字符串是否符合：（姓名 性别 年龄 语文分数 数学分数 英语分数）的格式 
		public boolean infoString(String infor) {
			int n = 0;
			String ss[] = infor.split(" | ");// 如果输入的信息空格太少会导致对象数组个数少于6，不存在的对象会导致程序异常。
			String s[] = new String[6];
			for (int i = 0; i < 6; i++) {
				if (i > ss.length - 1) {// 如果s序号大于ss最后一个序号。
					s[i] = "";
				} else {
					s[i] = ss[i];
				}
			}
			if ((s[1].equals("男") == false) && (s[1].equals("女") == false)) {
				n++;
				if (n == 1) {
					System.out.print("输入的性别");

				}
			}

			if (s[2].matches("^\\d+$")) {
				if (Integer.parseInt(s[2]) < 0 || Integer.parseInt(s[2]) > 200) {
					n++;
					if (n == 1) {
						System.out.print("输入的年龄");
					}
					System.out.print(",年龄");
				}
			} else {
				n++;
				if (n == 1) {
					System.out.print("输入的年龄");
				}
				System.out.print(",年龄");
			}
			if (s[3].matches("^\\d{1,3}.?\\d?$")) {
				if (Float.parseFloat(s[3]) < 0 || Float.parseFloat(s[3]) > 100) {
					n++;
					if (n == 1) {
						System.out.print("输入的语文分数");
					}
					System.out.print(",语文分数");
				}
			} else {
				n++;
				if (n == 1) {
					System.out.print("输入的语文分数");
				}
				System.out.print(",语文分数");
			}
			if (s[4].matches("^\\d{1,3}.?\\d?$")) {
				if (Float.parseFloat(s[4]) < 0 || Float.parseFloat(s[4]) > 100) {
					n++;
					if (n == 1) {
						System.out.print("输入的数学分数");
					}
					System.out.print(",数学分数");
				}
			} else {
				n++;
				if (n == 1) {
					System.out.print("输入的语文分数");
				}
				System.out.print(",语文分数");
			}

			if (s[5].matches("^\\d{1,3}.?\\d?$")) {
				if (Float.parseFloat(s[5]) < 0 || Float.parseFloat(s[5]) > 100) {
					n++;
					if (n == 1) {
						System.out.print("输入的语文分数");
					}
					System.out.print(",英语分数");
				}
			} else {
				n++;
				if (n == 1) {
					System.out.print("输入的语文分数");
				}
				System.out.print(",英语分数");
			}
			if (n > 0) {
				System.out.print("不正确");
				return false;
			} else {
				return true;
			}
		}
	}

	public static void main(String[] args) {
		Connection conn = null;// 数据库连接
		try {
			Class.forName(DBDRIVER);// 加载驱动程序
			// 连接MySQL数据库时，要写上连接的用户名和密码
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
			settable(conn);// 创建表格
			setInformation(conn, sql1);// 插入信息
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

	private static void setInformation(Connection conn, String sql) throws SQLException {
		PreparedStatement pstmt = null;
		String ss = sql;
		boolean flag = false;
		while (flag == false) {
			String stin = e1.new InputData()
					.getString("学生信息的格式为：姓名 性别 年龄 语文成绩 数学成绩 英语成绩（按顺序输出，中间以空格隔开）,如果输入0，结束信息输入并退出。\r\n请输入学生信息：");
			String s[] = stin.split(" | ");
			if (stin.equals("0")) {
				break;
			}

			if (e1.new InputData().infoString(stin) == true) {
				pstmt = conn.prepareStatement(ss);// 实例化PreparedStatement.
				pstmt.setString(1, s[0]);// 设置姓名
				pstmt.setString(2, s[1]);// 设置性别
				pstmt.setInt(3, Integer.parseInt(s[2]));// 设置年龄
				pstmt.setFloat(4, Float.parseFloat(s[3]));// 设置语文分数
				pstmt.setFloat(5, Float.parseFloat(s[4]));// 设置数学分数
				pstmt.setFloat(6, Float.parseFloat(s[5]));// 设置英语分数
				pstmt.executeUpdate();

			} else {
				System.out.println("请重新输入！");
			}

		}

	}

	private static void settable(Connection conn) throws SQLException {// 创建数据库表格方法
		Statement stmt = null;
		String name = e1.new InputData().getString("请输入表名称：");
		String idColumn = e1.new InputData().getTableString("请输入id列字段名称，类型及描述（中间以空格隔开）：", "输入错误，请重新输入！");
		String nameColumn = e1.new InputData().getTableString("请输入姓名列字段名称，类型及描述（中间以空格隔开）：", "输入错误，请重新输入！");
		String sexColumn = e1.new InputData().getTableString("请输入性别列字段名称，类型及描述（中间以空格隔开）：", "输入错误，请重新输入！");
		String ageColumn = e1.new InputData().getTableString("请输入年龄列字段名称，类型及描述（中间以空格隔开）：", "输入错误，请重新输入！");
		String chiColumn = e1.new InputData().getTableString("请输入中文列字段名称，类型及描述（中间以空格隔开）：", "输入错误，请重新输入！");
		String mathColumn = e1.new InputData().getTableString("请输入数学列字段名称，类型及描述（中间以空格隔开）：", "输入错误，请重新输入！");
		String engColumn = e1.new InputData().getTableString("请输入英语列字段名称，类型及描述（中间以空格隔开）：", "输入错误，请重新输入！");
		String sql = "create table if not exists " + name + "(" + idColumn + " primary key," + nameColumn + "," + sexColumn + ","
				+ ageColumn + "," + chiColumn + "," + mathColumn + "," + engColumn + ")";

		String nameColumns[] = nameColumn.split(" ");
		String sexColumns[] = sexColumn.split(" ");
		String ageColumns[] = ageColumn.split(" ");
		String chiColumns[] = chiColumn.split(" ");
		String mathColumns[] = mathColumn.split(" ");
		String engColumns[] = engColumn.split(" ");
		sql1 = "insert into " + name + "(" + nameColumns[0] + "," + sexColumns[0] + "," + ageColumns[0] + "," + chiColumns[0]
				+ "," + mathColumns[0] + "," + engColumns[0] + ") values (?,?,?,?,?,?)";
		stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		stmt.close();

	}

}
