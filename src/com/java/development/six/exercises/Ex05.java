/** 
 * projectName:Java开发实战经典 
 * fileName:Ex05.java 
 * packageName:com.java.development.six.exercises 
 * date:2018年9月28日上午9:31:59 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.exercises;

//二维图形类
abstract class Shape {

    public abstract void area(); //面积

    public abstract void perimeter(); //周长
}

class Rectangle extends Shape {//矩形类
    private float length; //长
    private float width;  //宽

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    /**   
     * @title: area
     * @description: TODO   
     * @see com.java.development.six.exercises.Shape#area()     
     */
    @Override
    public void area() {
        float S = this.getLength() * this.getWidth();
        System.out.println("矩形的面积为：" + S);

    }

    /**   
     * @title: perimeter
     * @description: TODO   
     * @see com.java.development.six.exercises.Shape#perimeter()     
     */
    @Override
    public void perimeter() {
        float L = (this.getLength() + this.getWidth()) * 2;
        System.out.println("矩形的周长为：" + L);

    }

}

class Triangle extends Shape {//三角形类
    private float bottom; //底
    private float length; //高
    private float a, b, c;//三条边长度

    public Triangle(float bottom, float length, float a, float b, float c) {
        this.bottom = bottom;
        this.length = length;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getBottom() {
        return bottom;
    }

    public float getLength() {
        return length;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    /**   
     * @title: area
     * @description: TODO   
     * @see com.java.development.six.exercises.Shape#area()     
     */
    @Override
    public void area() {
        float S = this.getBottom() * this.getLength() / 2;
        System.out.println("三角形的面积为：" + S);

    }

    /**   
     * @title: perimeter
     * @description: TODO   
     * @see com.java.development.six.exercises.Shape#perimeter()     
     */
    @Override
    public void perimeter() {
        float L = this.getA() + this.getB() + this.getC();
        System.out.println("三角形的边长为：" + L);

    }

}

class Round extends Shape {//圆
    public static final double PI = 3.14; //全局常量，不可修改

    private float              r;         //半径

    public Round(float r) {
        this.r = r;
    }

    public float getR() {
        return r;
    }

    /**   
     * @title: area
     * @description: TODO   
     * @see com.java.development.six.exercises.Shape#area()     
     */
    @Override
    public void area() {
        float S = (float) (Math.pow(this.getR(), 2) * PI);
        System.out.println("圆的面积为：" + S);

    }

    /**   
     * @title: perimeter
     * @description: TODO   
     * @see com.java.development.six.exercises.Shape#perimeter()     
     */
    @Override
    public void perimeter() {
        float L = (float) (2 * PI * this.getR());
        System.out.println("圆的周长为：" + L);
    }

}

/**   
 * @title: Ex05.java 
 * @package com.java.development.six.exercises 
 * @description: TODO定义一个抽象类shape ，用来表示一般图形。
 * 定义一个抽象类shape ，用来表示一般图形。
 * shape具有抽象方法area和perimeter，分别用来计算形状的面积和周长。
 * 定义一个二维形状子类继承shape类，并实现这两个抽象方法计算该形状的面积和周长。 
 * @author: zxsn
 * @date: 2018年9月28日 上午9:31:59 
 * @version: V1.0   
*/
public class Ex05 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月28日 上午9:32:00
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Rectangle r = new Rectangle(8, 4);
        r.perimeter();
        r.area();

        Triangle t = new Triangle(4, 3, 3, 4, 5);
        t.perimeter();
        t.area();

        Round o = new Round(1);
        o.perimeter();
        o.area();

    }

}
