
/**  
* @Title: ObserDemo.java
* @Package com.java.development.eleven_class_library.observable
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月22日
* @version V1.0  
*/

package com.java.development.eleven_class_library.observable;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
class House extends Observable {//被观察者
    private float price;

    /**
     * 创建一个新的实例 House.
     *
     * @param price
     */

    public House(float price) {
        this.price = price;
    }

    /**
    * @return price
    */

    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */

    public void setPrice(float price) {
        super.setChanged();//设置变化点
        this.price = price;
        super.notifyObservers(price);//通知所有观察者价格变化
    }

    /* (非 Javadoc)
    * 
    * 
    * @return
    * @see java.lang.Object#toString()
    */

    @Override
    public String toString() {
        return "房子价格为：" + price;
    }

}

@SuppressWarnings("deprecation")
class HousePriceObserver implements Observer {
    private String name;

    public HousePriceObserver(String name) {
        this.name = name;
    }
    /* (非 Javadoc)
    * 
    * 
    * @param o
    * @param arg
    * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
    */

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Float) {//判断参数类型
            System.out.print(this.name + "观察到价格更改为：");
            System.out.println(((Float) arg).floatValue());
        }

    }

}

/**
* @ClassName: ObserDemo
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月22日
*
*/

public class ObserDemo {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        House h = new House(1000000);
        HousePriceObserver hpo1 = new HousePriceObserver("观察者A");
        HousePriceObserver hpo2 = new HousePriceObserver("观察者B");
        HousePriceObserver hpo3 = new HousePriceObserver("观察者C");
        h.addObserver(hpo1);//加入观察者
        h.addObserver(hpo2);
        h.addObserver(hpo3);
        System.out.println(h);
        h.setPrice(666666);
        System.out.println(h);

    }

}
