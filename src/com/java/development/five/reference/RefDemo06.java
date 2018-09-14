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
class Person6 {
    private String  name;  //姓名
    private int     age;   //年龄
    private Book6   book;  //一个人有一本书
    private Person6 child; //一个人有一个孩子

    /**   
     * @title: Person   
     * @description: TODO
     * @param: @param name
     * @param: @param age  
     * @throws   
     */
    public Person6(String name, int age) {
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

    public Book6 getBook() {
        return book;
    }

    public void setBook(Book6 bk) {
        this.book = bk;
    }

    public Person6 getChild() {
        return child;
    }

    public void setChild(Person6 child) {
        this.child = child;
    }

}

class Book6 {
    private String  title;  //标题
    private double  price;  //价格
    private Person6 person; //一本书属于一个人

    /**   
     * @title: Book   
     * @description: TODO
     * @param: @param title
     * @param: @param price  
     * @throws   
     */
    public Book6(String title, double price) {
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

    public Person6 getPerson() {
        return person;
    }

    public void setPerson(Person6 per) {
        this.person = per;
    }
}

public class RefDemo06 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月14日 上午10:24:01
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Person6 per = new Person6("张三", 30);
        Person6 cld = new Person6("张草", 10);
        Book6 bk = new Book6("Java SE 核心开发", 90.0f);
        Book6 b = new Book6("一千零一夜", 30.3d);

        per.setBook(bk); //设置两个对象间的关系，一个人有一本书
        bk.setPerson(per); //一本书属于一个人
        cld.setBook(b); //一个孩子有一本书
        b.setPerson(cld); //一本书属于一个孩子
        per.setChild(cld); //一个人有一个孩子

        System.out.println("从人找书-->姓名：" + per.getName() + "；年龄：" + per.getAge() + "；书名："
                           + per.getBook().getTitle() + "；价格：" + per.getBook().getPrice()); //人找书
        System.out.println("从书找人-->书名：" + bk.getTitle() + "；价格：" + bk.getPrice() + "；姓名："
                           + bk.getPerson().getName() + "；年龄：" + bk.getPerson().getAge()); //书找人
        //通过人找到孩子，并找到孩子所拥有的书
        System.out.println(per.getName() + "的孩子-->姓名：" + per.getChild().getName() + "；年龄："
                           + per.getChild().getAge() + "；书名：" + per.getChild().getBook().getTitle()
                           + "；价格：" + per.getChild().getBook().getPrice());
    }

}
