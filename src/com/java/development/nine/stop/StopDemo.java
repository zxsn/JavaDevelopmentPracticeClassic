
/**  
* @Title: StopDemo.java
* @Package com.java.book.nine.stop
* @Description: TODO(用一句话描述该文件做什么)
* @author houdo
* @date 2018年10月4日
* @version V1.0  
*/

package com.java.development.nine.stop;

class MyThread implements Runnable {
    private boolean flag = true; //定义标记位属性
    /* (非 Javadoc)
    * 
    * 
    * @see java.lang.Runnable#run()
    */

    @Override
    public void run() {
        int i = 0;
        while (this.flag) {
            //while (true) {
            System.out.println(Thread.currentThread().getName() + "运行，i = " + (i++));
            if (i == 100) {
                this.stop();
            }
            //}
        }

    }

    public void stop() {
        this.flag = false;
    }
}

/**
* @ClassName: StopDemo
* @Description: TODO(这里用一句话描述这个类的作用)
* @author houdo
* @date 2018年10月4日
*
*/

public class StopDemo {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        MyThread my = new MyThread();
        Thread t = new Thread(my, "线程");
        t.start();
        //my.stop();

    }

}
