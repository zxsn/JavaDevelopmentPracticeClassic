package com.java.development.thirteen_classset.list.linkedlist;

import java.util.LinkedList;

/*
 * 
    * @ClassName: LinkedListDemo02
    * @Description: 找到表头
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class LinkedListDemo02 {

	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<String>();
		link.add("A");//向链表中增加数据
		link.add("B");//向链表中增加数据
		link.add("C");//向链表中增加数据
		System.out.println("1-1、element()方法找到表头："+link.element());
		System.out.println("1-2、找完之后的链表内容："+link);
		System.out.println("2-1、peek()方法找到表头："+link.peek());
		System.out.println("2-2、找完之后的链表内容："+link);
		System.out.println("3-1、poll()方法找到表头："+link.poll());
		System.out.println("3-2、找完之后的链表内容："+link);
	}

}
