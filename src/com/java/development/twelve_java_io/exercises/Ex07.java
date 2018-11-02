package com.java.development.twelve_java_io.exercises;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
    * @ClassName: Ex07
    * @Description: 完成系统登录程序，从命令行输入用户名和密码，如果没有输入用户名和密码，
    * 则提示输入用户名和密码；如果输入了用户名但是没有输入密码，则提示用户输入密码，
    * 然后判断用户名是否是mldn，密码是否是hello。如果正确，则提示登录成功；
    * 如果错误，显示登陆失败的信息，用户再次输入用户名和密码，连续3次输入错误后系统退出。
    * @author Administrator
    * @date 2018年11月3日
    *
 */
public class Ex07 {

	public static void main(String[] args) throws Exception {
		BufferedReader buf = null;
		buf = new BufferedReader(new InputStreamReader(System.in));
		String temp[] = new String[2];//接收输入的name和password
		int num = 0;
		while(true) {
		System.out.println("请输入用户名和密码（中间用空格隔开）：");
		String str;
		try {
			str = buf.readLine();
			//temp = str.split(" ");
			if(str.matches("\\S+(\u0020|\u3000)?")) {
				temp[0] = str.trim();
				temp[1] = null;
			}
			if(str.matches("^\\S+(\u0020|\u3000)\\S+$")) {//(\u0020|\u3000)代表全半角空格
				//System.out.println("匹配");
				temp = str.split(" ");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

		//System.out.println(temp[0]+" "+temp[1]);
		while(true) {
			if(temp[0]!=null&&!"".equals(temp[0])) {
				break;
			}
			System.out.print("请输入用户名：");
			temp[0] = buf.readLine();
		}
		while(true) {
			if(temp[1]!=null&&!"".equals(temp[1])) {
				break;
			}
			System.out.print("请输入密码：");
			temp[1] = buf.readLine();
		}
		
		if("mldn".equals(temp[0])&&"hello".equals(temp[1])) {
			System.out.println("登录成功！");
			break;
		}else {
			System.out.println("登录失败！");
			num++;
			if(num>3) {
				System.out.println("连续3次输入错误，系统退出！");
				System.exit(1);
			}
		}
		}
		
	}

}
