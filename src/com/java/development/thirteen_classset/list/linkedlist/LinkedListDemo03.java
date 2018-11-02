package com.java.development.thirteen_classset.list.linkedlist;

import java.util.LinkedList;

/*
 * 
    * @ClassName: LinkedListDemo03
    * @Description: 以FIFO方式取出内容
    * @author Administrator
    * @date 2018年11月5日
    *
 */
public class LinkedListDemo03 {

	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<String>();
		link.add("A");//向链表中增加数据
		link.add("B");//向链表中增加数据
		link.add("C");//向链表中增加数据
		System.out.print("以FIFO的方式输出：");
		for (int i = 0; i <= link.size() + 1; i++) {
			System.out.print(i < link.size()?link.poll()+"、":link.poll());
		}
	}

}
