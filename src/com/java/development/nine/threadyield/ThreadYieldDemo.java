/**
 * 
 */
package com.java.development.nine.threadyield;

class MyThread implements Runnable {

    /*
     * （非 Javadoc）
     * 
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "运行-->" + i);
            if (i == 3) {
                System.out.print("线程礼让：");
                Thread.currentThread();
                Thread.yield();
            }
        }

    }

}

/**
 * Description: <br/>
 * Copyright (c),2018,ZXSN<br/>
 * This program is protected by copyright laws.<br/>
 * Program Name:ThreadYieldDemo.java<br/>
 * Date:2018年10月1日
 * @author houdo
 *
 */
public class ThreadYieldDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt, "线程A");
        Thread t2 = new Thread(mt, "线程B");
        t1.start();
        t2.start();

    }

}
