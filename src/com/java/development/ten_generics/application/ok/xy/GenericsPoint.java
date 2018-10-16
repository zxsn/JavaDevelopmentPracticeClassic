
/**  
* @Title: GenericsPoint.java
* @Package com.java.development.ten_generics.ok.xy
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月16日
* @version V1.0  
*/

package com.java.development.ten_generics.application.ok.xy;

/**
* @ClassName: GenericsPoint
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月16日
*
*/

public class GenericsPoint {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Point<Integer> p = new Point<Integer>();
        p.setX(10);
        p.setY(20);
        int x = p.getX();
        int y = p.getY();
        System.out.println("整数表示，X的坐标为：" + x);
        System.out.println("整数表示，Y的坐标为：" + y);

    }

}
