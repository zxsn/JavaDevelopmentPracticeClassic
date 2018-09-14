/** 
 * projectName:Java开发实战经典 
 * fileName:Ex06.java 
 * packageName:com.java.development.six.exercises 
 * date:2018年9月28日上午10:21:27 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.exercises;

abstract class Good { //商品类，因为里面包含各种产品，所以是抽象类
    private String name;  //商品名称
    private float  price; //商品价格
    private int    count; //商品数量

    public Good(String name, float price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public abstract String getInfo(); //抽象方法
}

class Book extends Good { //书类
    private String author;  //作者
    private String publish; //出版社

    public Book(String name, float price, int count, String author, String publish) {
        super(name, price, count);
        this.author = author;
        this.publish = publish;
    }

    /**   
     * @title: getInfo
     * @description: TODO
     * @return   
     * @see com.java.development.six.exercises.Good#getInfo()     
     */
    @Override
    public String getInfo() {

        return "所购书名：" + super.getName() + "，单价：" + super.getPrice() + "，购买册数：" + super.getCount()
               + "，作者：" + author + "，出版社：" + publish + "，总计：" + super.getPrice() * super.getCount();
    }
}

class Cloth extends Good {
    private String brand;//品牌
    private String style;//款式

    /**   
     * @title: Cloth   
     * @description: TODO
     * @param: @param name
     * @param: @param price
     * @param: @param count  
     * @throws   
     */
    public Cloth(String name, float price, int count, String brand, String style) {
        super(name, price, count);
        this.brand = brand;
        this.style = style;
    }

    /**   
     * @title: getInfo
     * @description: TODO
     * @return   
     * @see com.java.development.six.exercises.Good#getInfo()     
     */
    @Override
    public String getInfo() {
        return "所购衣服名称：" + super.getName() + "，单价：" + super.getPrice() + "，购买件数：" + super.getCount()
               + "，衣服品牌：" + brand + "，衣服样式：" + style + "，总计：" + super.getPrice() * super.getCount();
    }

}

class ShopCar { //购物车
    private Good[] goods;
    private int    foot = 0;

    public ShopCar(int len) { //构造方法开辟数组空间
        if (len > 0) {
            this.goods = new Good[len];
        } else
            this.goods = new Good[1];
    }

    public boolean add(Good good) { //增加商品
        if (this.foot < this.goods.length) { //判断商品是否已满
            this.goods[this.foot] = good;
            this.foot++;
            return true;
        } else {
            return false;
        }
    }

    public Good[] search(String keyWord) {//查询商品
        Good g[] = null;
        int count = 0;
        for (int i = 0; i < this.goods.length; i++) { //开辟查询到的商品的数组空间
            if (this.goods[i] != null) {
                if (goods[i].getName().indexOf(keyWord) != -1) {
                    count++;
                }
            }
        }
        g = new Good[count];
        int f = 0;
        for (int i = 0; i < this.goods.length; i++) { //查找商品并保存
            if (this.goods[i] != null) {
                if (this.goods[i].getName().indexOf(keyWord) != -1) {
                    g[f] = this.goods[i];
                    f++;
                }
            }
        }

        return g;
    }

    public Good[] getGoods() {
        return goods;
    }

}

/**   
 * @title: Ex06.java 
 * @package com.java.development.six.exercises 
 * @description: TODO使用面向对象的概念表示出下面的生活场景：
 * 小明去超市买东西，所有买到的东西都放在购物车中，最后到收银台一起结账。
 * @author: zxsn
 * @date: 2018年9月28日 上午10:21:27 
 * @version: V1.0   
*/
public class Ex06 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月28日 上午10:21:27
     *@param args
     *@throws 
     */
    public static void main(String[] args) { //javac -encoding UTF-8 Ex06.java
        ShopCar sc = new ShopCar(5);
        sc.add(new Book("Java开发实战经典", 79.80f, 1, "李兴华", "清华大学出版社"));
        sc.add(new Book("Thinking In Java", 89.80f, 3, "Job", "机械工业出版社"));
        sc.add(new Book("西游记", 45.67f, 56, "吴承恩", "商务印书馆"));
        sc.add(new Cloth("T恤", 100.50f, 1, "李宁", "男士-L"));
        sc.add(new Cloth("牛仔裤", 356.78f, 2, "森马", "男士-M"));
        System.out.println("===================已买到的商品清单===================");
        print(sc.getGoods());
        System.out.println("===================查询商品详细信息===================");
        try {
            print(sc.search(args[0]));
        } catch (Exception e) {
            System.out.println("未输入要查询商品或输入错误，" + "格式为：\njava Ex06  商品名(或商品名中的任意字符)");
        }
    }

    private static void print(Good[] goods) {
        if (goods != null)
            for (int i = 0; i < goods.length; i++) {
                System.out.println(goods[i].getInfo());
            }
    }

}
