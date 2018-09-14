
/**  
* @Title: ExecDemo01.java
* @Package com.java.development.nine.execdemo
* @Description: TODO设计一个线程类，要求可以产生3个线程对象，并且可以分别设置3个线程的休眠时间，
* 具体如下：
* 线程A：休眠10s
* 线程B：休眠20s
* 线程C：休眠30s
* @author houdo
* @date 2018年10月3日
* @version V1.0  
*/

package com.java.development.nine.execdemo.thread;

class MyThread extends Thread {
    private int time;

    /**
     * 创建一个新的实例 MyThread.
     *
     * @param target
     * @param name
     */

    public MyThread(String name, int time) {
        super(name);
        this.time = time;
    }
    /* (非 Javadoc)
    * 
    * 
    * @see java.lang.Runnable#run()
    */

    @Override
    public void run() {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "线程，休眠" + this.time + "毫秒");
    }
}

/**
* @ClassName: ExecDemo01
* @Description: TODO(这里用一句话描述这个类的作用)
* @author houdo
* @date 2018年10月3日
*
*/

public class ExecDemo01 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        MyThread mt1 = new MyThread("线程A", 10000);
        MyThread mt2 = new MyThread("线程B", 20000);
        MyThread mt3 = new MyThread("线程C", 30000);

        mt1.start();
        mt2.start();
        mt3.start();

    }

}
