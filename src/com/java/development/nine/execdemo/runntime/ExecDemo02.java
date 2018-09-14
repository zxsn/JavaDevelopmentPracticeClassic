
/**  
* @Title: ExecDemo02.java
* @Package com.java.development.nine.execdemo.runntime
* @Description: TODO(用一句话描述该文件做什么)
* @author houdo
* @date 2018年10月3日
* @version V1.0  
*/

package com.java.development.nine.execdemo.runntime;

class MyThread implements Runnable {
    private String name;
    private int    time;

    public MyThread(String name, int time) {
        this.name = name;
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
        System.out.println(this.name + "线程，休眠" + this.time + "毫秒");
    }
}

/**
* @ClassName: ExecDemo02
* @Description: TODO(这里用一句话描述这个类的作用)
* @author houdo
* @date 2018年10月3日
*
*/

public class ExecDemo02 {

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
        new Thread(mt1).start();
        new Thread(mt2).start();
        new Thread(mt3).start();

    }

}
