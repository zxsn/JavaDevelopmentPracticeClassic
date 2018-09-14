
/**  
* @Title: ThreadDeadLock.java
* @Package com.java.development.nine.deadlock
* @Description: TODO(用一句话描述该文件做什么)
* @author houdo
* @date 2018年10月3日
* @version V1.0  
*/

package com.java.development.nine.deadlock;

class Zhangsan { //张三

    public void say() { //定义say()方法
        System.out.println("张三对李四说：“你给我画，我就把书给你”。");

    }

    public void get() { //定义得到东西的类
        System.out.println("张三得到画了。");
    }
}

class Lisi {
    public void say() {
        System.out.println("李四对张三说：“你给我书，我就把画给你”。");
    }

    public void get() {
        System.out.println("李四得到书了。");
    }
}

/**
* @ClassName: ThreadDeadLock
* @Description: TODO(这里用一句话描述这个类的作用)
* @author houdo
* @date 2018年10月3日
*
*/

public class ThreadDeadLock implements Runnable {
    private static Zhangsan zs   = new Zhangsan(); //实例化static型对象，数据共享
    private static Lisi     ls   = new Lisi();     //实例化static型对象，数据共享
    private boolean         flag = false;          //声明标记，用于判断哪个对象先执行
    /* (非 Javadoc)
    * 
    * 
    * @see java.lang.Runnable#run()
    */

    @Override
    public void run() {
        if (flag) {
            synchronized (zs) { //通过第1个对象
                zs.say();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO 自动生成的 catch 块
                    e.printStackTrace();
                }
                synchronized (ls) {//同步第2个对象
                    zs.get();
                }
            }
        } else {
            synchronized (ls) {//同步第2个对象
                ls.say();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO 自动生成的 catch 块
                    e.printStackTrace();
                }
                synchronized (zs) {//同步第1个对象
                    ls.get();
                }
            }
        }

    }

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        ThreadDeadLock t1 = new ThreadDeadLock();
        ThreadDeadLock t2 = new ThreadDeadLock();
        t1.flag = true;
        t2.flag = false;
        Thread thA = new Thread(t1);
        Thread thB = new Thread(t2);
        thA.start();
        thB.start();
    }
}
