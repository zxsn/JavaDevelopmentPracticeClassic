/** 
 * projectName:Java开发实战经典 
 * fileName:RefDemo05.java 
 * packageName:com.java.development.five.reference 
 * date:2018年9月14日上午10:24:01 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.reference;

/**   
 * @title: RefDemo05.java 
 * @package com.java.development.five.reference 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月14日 上午10:24:01 
 * @version: V1.0   
*/
class Person {
    private String name; //姓名
    private int    age;  //年龄
    private Book   book; //一个人有一本书

    /**   
     * @title: Person   
     * @description: TODO
     * @param: @param name
     * @param: @param age  
     * @throws   
     */
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

}

class Book {
    private String title;  //标题
    private double price;  //价格
    private Person person; //一本书属于一个人

    /**   
     * @title: Book   
     * @description: TODO
     * @param: @param title
     * @param: @param price  
     * @throws   
     */
    public Book(String title, double price) {
        super();
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

public class RefDemo05 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月14日 上午10:24:01
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Person per = new Person("张三", 30);
        Book bk = new Book("Java SE 核心开发", 90.0);
        per.setBook(bk); //设置两个对象间的关系，一个人有一本书
        bk.setPerson(per); //一本书属于一个人
        System.out.println("从人找书-->姓名：" + per.getName() + "；年龄：" + per.getAge() + "；书名："
                           + per.getBook().getTitle() + "；价格：" + per.getBook().getPrice()); //人找书
        System.out.println("从书找人-->书名：" + bk.getTitle() + "；价格：" + bk.getPrice() + "；姓名："
                           + bk.getPerson().getName() + "；年龄：" + bk.getPerson().getAge()); //书找人

    }

}
