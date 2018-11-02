package com.java.development.thirteen_classset.list.vector;

import java.util.Vector;

/*
 * 
    * @ClassName: VectorDemo02
    * @Description:使用旧的方法
    * @author Administrator
    * @date 2018年11月4日
    *
 */
public class VectorDemo02 {

	public static void main(String[] args) {
		Vector<String> allList = new Vector<String>();//实例化vector对象
		allList.addElement("Hello");//此方法为Vector自己定义
		allList.addElement("MLDN");
		allList.addElement("www.mldn.cn");
		for (int i = 0; i < allList.size(); i++) {
			System.out.print(i < allList.size() - 1?allList.get(i)+"、":allList.get(i));//通过get()取出每一个元素
		}
	}

}
