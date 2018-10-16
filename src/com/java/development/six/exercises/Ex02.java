/** 
 * projectName:Java开发实战经典 
 * fileName:Ex02.java 
 * packageName:com.java.development.six.exercises 
 * date:2018年9月27日下午5:01:31 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.exercises;

/**   
 * @title: Ex02.java 
 * @package com.java.development.six.exercises 
 * @description: TODO虑一个表示图形的类，写出类的属性及方法。
 * @author: zxsn
 * @date: 2018年9月27日 下午5:01:31 
 * @version: V1.0   
*/
class Graphics {
    @SuppressWarnings("unused")
    private float  length;    //长
    @SuppressWarnings("unused")
    private float  width;     //宽
    @SuppressWarnings("unused")
    private String backcolor; //背景色

    public void size() {
        System.out.println("设置图片的尺寸。");
    }

    public void color() {
        System.out.println("设置图片的背景色。");
    }
}

public class Ex02 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月27日 下午5:01:31
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Graphics g = new Graphics();
        g.size();
        g.color();

    }

}
