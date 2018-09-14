
/**  
* @Title: SyncDemo01.java
* @Package com.java.development.nine.sync
* @Description: TODO多个线程操作同一资源，出现资源同步的问题
* @author houdo
* @date 2018年10月3日
* @version V1.0  
*/

package com.java.development.nine.sync;

class MyThread implements Runnable {
    private int ticket = 5;
    /* (非 Javadoc)
    * 
    * 
    * @see java.lang.Runnable#run()
    */

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (ticket > 0) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    // TODO 自动生成的 catch 块
                    e.printStackTrace();
                }
                System.out.println("卖票：ticket = " + ticket--);
            }

        }

    }
}

/**
* @ClassName: SyncDemo01
* @Description: TODO(这里用一句话描述这个类的作用)
* @author houdo
* @date 2018年10月3日
*
*/

public class SyncDemo01 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        Thread t3 = new Thread(mt);
        t1.start();
        t2.start();
        t3.start();

    }

}
