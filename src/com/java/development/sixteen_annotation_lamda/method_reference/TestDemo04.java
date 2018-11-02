package com.java.development.sixteen_annotation_lamda.method_reference;

/*
 * 
    * @ClassName: TestDemo04
    * @Description: 引用构造方法
    * @author Administrator
    * @date 2018年11月12日
    *
 */
public class TestDemo04 {
	@FunctionalInterface
	interface IMessage<C> {
		public C create(String t, double p);// 引用构造方法
	}

	static class Book {
		private String title;
		private double price;

		public Book(String title, double price) {// 有两个参数的构造
			this.title = title;
			this.price = price;
		}

		@Override
		public String toString() {
			return "书名：" + this.title + "；价格：" + this.price;
		}
	}
	public static void main(String[] args) {
		IMessage<Book> msg = Book::new;// 引用构造方法
		// 调用的虽然是create()，但是这个方法引用的是Book类的构造
		Book book = msg.create("Java开发实战经典", 79.8);
		System.out.println(book);
	}

}
