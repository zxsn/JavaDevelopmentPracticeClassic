
/**  
* @Title: Ex02.java
* @Package com.java.book.nine.exercises
* @Description: 设计一个生产计算机和搬运计算机类，要求生产出一台电脑就搬走一台，
* 如果没有新的计算机生产出来，则搬运工要等待新计算机产出；如果生产出的计算机没有被搬走，
* 则要等待计算机搬走之后再生产，并统计出生产的计算机数量。
* @author houdo
* @date 2018年10月4日
* @version V1.0  
*/

package com.java.development.nine.exercises;

class Computer {//电脑类
    private String  name = "未生产";
    private boolean flag = true; //设置标志位

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public synchronized void set(String name) {//设置信息名称
        if (!flag) {//标志位为false，不可以生产
            try {
                super.wait();//等待消费者取走
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setName(name);//设置信息名称
        System.out.println(this.getName());//输出信息
        try {
            Thread.sleep(300); //加入延迟
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = false;//修改标志位，表示可以取走
        super.notify();//唤醒等待线程
    }

    public synchronized void get() {//取得信息名称
        if (flag) {
            try {
                super.wait();//等待生产者生产
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(300);//加入延迟
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName("已经搬运完毕");
        System.out.println(this.getName());
        flag = true;//修改标志位为true，表示可以生产
        super.notify();//唤醒等待线程
    }

}

class Producer implements Runnable {//生产者
    private Computer com = null;

    /**
     * 创建一个新的实例 Product.
     *
     * @param com
     */

    public Producer(Computer com) {
        super();
        this.com = com;
    }

    /* (非 Javadoc)
    * 
    * 
    * @see java.lang.Runnable#run()
    */

    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            this.com.set("已经生产完毕");
            count++;
        }
        System.out.println("生产的电脑数量：" + count);
    }
}

class Consumer implements Runnable {//消费者
    private Computer com = null;

    /**
     * 创建一个新的实例 Consumer.
     *
     * @param com
     */

    public Consumer(Computer com) {
        super();
        this.com = com;
    }

    /* (非 Javadoc)
    * 
    * 
    * @see java.lang.Runnable#run()
    */

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            this.com.get();
        }

    }
}

/**
* @ClassName: Ex02
* @Description: TODO(这里用一句话描述这个类的作用)
* @author houdo
* @date 2018年10月4日
*
*/

public class Ex02 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Computer com = new Computer();
        Producer pro = new Producer(com);
        Consumer con = new Consumer(com);
        new Thread(pro).start();
        new Thread(con).start();
    }

}
