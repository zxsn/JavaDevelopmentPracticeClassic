
/**  
* @Title: SyncDemo03.java
* @Package com.java.development.nine.sync.method2
* @Description: TODO(用一句话描述该文件做什么)
* @author houdo
* @date 2018年10月3日
* @version V1.0  
*/

package com.java.development.nine.sync.method2;

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
            this.sale();
        }

    }

    public synchronized void sale() {
        if (ticket > 0) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                // TODO 自动生成的 catch 块
                e.printStackTrace();
            }
            System.out.println("买票： ticket = " + ticket--);
        }
    }
}

/**
* @ClassName: SyncDemo03
* @Description: TODO(这里用一句话描述这个类的作用)
* @author houdo
* @date 2018年10月3日
*
*/

public class SyncDemo03 {

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
