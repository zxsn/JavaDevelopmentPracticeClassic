package com.java.development.thirteen_classset.list.linkedlist;

import java.util.LinkedList;

/*
 * 
    * @ClassName: LinkedListDemo01
    * @Description: 为链表增加数据
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class LinkedListDemo01 {

	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<String>();
		link.add("A");//向链表中增加数据
		link.add("B");//向链表中增加数据
		link.add("C");//向链表中增加数据
		System.out.println("初始化链表："+link);
		link.addFirst("X");//向链表的表头增加内容
		link.addLast("Y");//向链表的表尾增加内容
		System.out.println("增加头和尾之后的链表："+link);//输出链表内容，调用toString()方法
	}

}
