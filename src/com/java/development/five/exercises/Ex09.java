/** 
 * projectName:Java开发实战经典 
 * fileName:Ex09.java 
 * packageName:com.java.development.five.exercises 
 * date:2018年9月20日下午5:03:53 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.exercises;

/**   
 * @title: Ex09.java 
 * @package com.java.development.five.exercises 
 * @description: TODO声明一个图书类，其数据成员为书名、编号
 * （利用静态变量实现自动编号）、书价，并拥有静态数据成员册数、
 * 记录图书的册数，在构造方法中利用此静态变量为对象的编号赋值，
 * 在主方法中定义对象数组，并求出总册数。
 * @author: zxsn
 * @date: 2018年9月20日 下午5:03:53 
 * @version: V1.0   
*/
class Book {
    private String     name;
    private int        id;
    private float      price;
    private static int num   = 3;
    private static int count = 0;

    public Book() {
        count++;
        this.id = count;
    }

    public Book(String name, float price) {
        if (name.length() < 10) { //数据格式化
            for (int i = 0; i < (10 - name.length()); i++) {
                name = name.concat("　");
            }
            this.name = name;
        } else {
            this.name = name;
        }
        this.price = price;
        this.id = (++count);
    }

    public int getId() {
        return this.id;
    }

    public int getNum() {
        return Book.num;
    }

    public void print() {

        System.out.println(getId() + "\t" + this.name + "\t" + this.price);
    }
}

public class Ex09 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月20日 下午5:03:53
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Book book[] = new Book[4];
        book[0] = new Book("Java开发实战经典", 118.0f);
        book[1] = new Book("火影忍者", 478.0f);
        book[2] = new Book("Java从入门到精通", 46.0f);
        book[3] = new Book("Java核心技术 卷1", 119.0f);
        System.out.println("编号\t书名\t\t价格");
        for (Book b : book) {
            b.print();
        }
        System.out.println("总册数：" + ((new Book().getId() - 1) * book[book.length - 1].getNum()));

    }

}
