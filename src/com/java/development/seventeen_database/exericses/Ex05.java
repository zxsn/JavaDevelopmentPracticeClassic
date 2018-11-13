package com.java.development.seventeen_database.exericses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 
* @ClassName: Ex05
* @Description: 建立一张雇员表(雇员编号、姓名、工作、雇佣日期、基本工资、部门名称)，
* 				在命令窗口下将表中的全部数据列出来。
* @author houdo
* @date 2018年11月27日 下午1:08:29
*
 */
public class Ex05 {
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
		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
			createTable(conn);// 创建雇员表
			insertInfo(conn);// 插入数据
			query(conn);// 查询信息
		} catch (ClassNotFoundException | SQLException | ParseException e) {
			e.printStackTrace();
		}

	}

	private static void query(Connection conn) throws SQLException {
		PreparedStatement pstmt = null;// 数据库操作
		ResultSet rs = null;// 保存查询结果
		String sql = "select eid,name,work,hiredate,basicwage,dept "
				+ "from employe";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();// 实例化ResultSet对象
		System.out.println("查询结果如下：");
		System.out.println("雇员编号\t姓名\t工作\t雇佣日期\t\t基本工资\t\t部门名称");
		while (rs.next()) {
			int eid = rs.getInt(1);
			String name = rs.getString(2);
			String work = rs.getString(3);
			java.util.Date hiredate = rs.getDate(4);
			Float basicwage = rs.getFloat(5);
			String dept = rs.getString(6);
			System.out.print(eid + "\t");
			System.out.print(name + "\t");
			System.out.print(work + "\t");
			System.out.print(hiredate + "\t");
			System.out.print(basicwage + "\t\t");
			System.out.println(dept);
		}
	}

	private static void insertInfo(Connection conn) throws SQLException, ParseException {// 向表中插入数据
		PreparedStatement pstmt = null;// 数据库操作
		java.util.Date temp = null;
		String sql = "insert into employe(name,work,hiredate,basicwage,dept) values(?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql);// 实例化PreparedStatement对象
		String[] employe1 = { "张三", "程序员", "2001-04-15", "8000", "搜索部" };
		String[] employe2 = { "李四", "程序员", "2004-06-01", "6000", "游戏测试部" };
		String[] employe3 = { "王五", "项目经理", "2011-02-04", "12000", "搜索部" };
		String[] employe4 = { "赵六", "董事长", "1999-08-30", "20000", "" };
		String[] employe5 = { "钱七", "项目助理", "2016-08-07", "7000", "财务部" };
		String[] employe6 = { "孙八", "销售", "2017-05-21", "6000", "销售部" };
		String[][] allEmploye = { employe1, employe2, employe3, employe4, employe5, employe6 };
		for (int i = 0; i < allEmploye.length; i++) {
			for (int j = 0; j < allEmploye[i].length; j++) {
				// System.out.print(allEmploye[i][j] + "\t");
				if (j == 2) {
					// 通过SimpleDateFormat类将字符串转换为java.util.Date类型
					temp = new SimpleDateFormat("yyyy-MM-dd").parse(allEmploye[i][j]);
					// 通过java.util.Date取出具体的日期数，并将其变为java.sql.Date类型
					java.sql.Date date = new java.sql.Date(temp.getTime());
					pstmt.setDate(j + 1, date);
				} else if (j == 3) {
					Float number = Float.valueOf(allEmploye[i][j]);
					pstmt.setFloat(j + 1, number);
				} else {
					pstmt.setString(j + 1, allEmploye[i][j]);
				}
			}
			// System.out.println();
			pstmt.addBatch();// 加入批处理等待执行
		}
		int num[] = pstmt.executeBatch();// 批量执行
		System.out.println("更新了" + num.length + "条数据。");
		pstmt.close();
	}

	private static void createTable(Connection conn) throws SQLException {// 创建雇员表
		PreparedStatement pstmt = null;// 数据库操作
		String sql = "create table if not exists employe(eid int auto_increment primary key,name varchar(20) not null,"
				+ "work varchar(30) not null,hiredate date not null,basicwage float not null,dept varchar(40))";
		pstmt = conn.prepareStatement(sql);// 实例化PreparedStatement对象
		pstmt.execute();
		pstmt.close();
	}

}
