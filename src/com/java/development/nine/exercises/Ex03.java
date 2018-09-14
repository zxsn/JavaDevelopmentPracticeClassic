
/**  
* @Title: Ex03.java
* @Package com.java.development.nine.exercises
* @Description: 实现一个竞拍抢答程序：要求设置3个抢答者（3个线程），
* 而后同时发出抢答指令，并为抢答成功者给出成功提示，为未抢答成功者给出失败提示。
* @author Administrator
* @date 2018年10月15日
* @version V1.0  
*/

package com.java.development.nine.exercises;

/**
* @ClassName: Ex03
* @Description:
* @author Administrator
* @date 2018年10月15日
*
*/

public class Ex03 {
    class MyThread implements Runnable {
        private boolean flag = true;

        public synchronized void answer() {
            while (flag) {
                System.out.println(Thread.currentThread().getName() + "抢答成功！！");
                flag = false;
                return;
            }
            System.out.println(Thread.currentThread().getName() + "抢答失败！！");
            return;
        }

        /* (非 Javadoc)
        * 
        * 
        * @see java.lang.Runnable#run()
        */

        @Override
        public void run() {
            try {
                Thread.sleep(1000);//此处睡眠要添加在同步方法外，线程都有机会抢占CPU。
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.answer();

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
        Ex03 ex = new Ex03();
        MyThread md = ex.new MyThread();
        Thread mt1 = new Thread(md);
        Thread mt2 = new Thread(md);
        Thread mt3 = new Thread(md);
        mt1.start();
        mt2.start();
        mt3.start();
    }

}
