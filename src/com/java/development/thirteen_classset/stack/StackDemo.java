package com.java.development.thirteen_classset.stack;

import java.util.Stack;

/*
 * 
    * @ClassName: StackDemo
    * @Description: 入栈以及出栈操作
    * @author Administrator
    * @date 2018年11月6日
    *
 */
public class StackDemo {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();// 实例化Stack对象
		s.push("A");// 入栈
		s.push("B");
		s.push("C");
		while (s.size() - 1 > 0) {
			System.out.print(s.pop() + "、");// 出栈
		}
		System.out.println(s.pop());
		System.out.print(s.pop());// 错误，出栈出现异常，栈为空

	}

}
