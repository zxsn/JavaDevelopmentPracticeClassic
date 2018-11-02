package com.java.development.fiveteen_reflection.getclass;

/*
 * 
    * @ClassName: GetClassDemo01
    * @Description: 通过一个对象得到完整的“包.类”名称
    * @author Administrator
    * @date 2018年11月10日
    *
 */
public class GetClassDemo01 {
	static class X {

	}
	public static void main(String[] args) {
		X x = new X();
		System.out.println(x.getClass().getName());// 得到对象所在类
	}

}
