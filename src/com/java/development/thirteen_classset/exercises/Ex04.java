package com.java.development.thirteen_classset.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * 
    * @ClassName: Ex04
    * @Description: 编写程序通过栈的方式将任意输入的字符串内容进行逆序输出
    * @author Administrator
    * @date 2018年11月7日
    *
 */
public class Ex04 {
	public class InputData {
		BufferedReader buf = null;// 声明BufferedReader对象

		public InputData() {
			buf = new BufferedReader(new InputStreamReader(System.in));// 实例化BufferedReader对象
		}

		public String getString(String info) {
			String temp = null;
			System.out.print(info);
			try {
				temp = this.buf.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return temp;
			
		}
	}
	public static void main(String[] args) {
		Ex04 e4 = new Ex04();
		InputData input = e4.new InputData();
		String str = input.getString("请输入字符串：");
		Stack<Character> s = new Stack<Character>();// 实例化Stack对象
		char c[] = str.toCharArray();
		int i = 0;
		while (i < c.length) {
			s.push(c[i]);// 入栈
			i++;
		}
		int j = 0;
		while (c.length > j) {
			System.out.print(j < c.length - 1 ? s.pop() + "、" : s.pop());// 出栈
			j++;
		}
	}

}
