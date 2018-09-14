/** 
 * projectName:Java开发实战经典 
 * fileName:ThreadPriority.java 
 * packageName:com.java.development.nine.threadpriority 
 * date:2018年9月29日下午11:57:15 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.nine.threadpriority;

class MyThread implements Runnable {
    /**   
     * @title: run
     * @description: TODO   
     * @see java.lang.Runnable#run()     
     */
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "运行，i");
        }

    }
}

/**   
 * @title: ThreadPriority.java 
 * @package com.java.development.nine.threadpriority 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月29日 下午11:57:15 
 * @version: V1.0   
*/
public class ThreadPriority {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月29日 下午11:57:15
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread(), "线程A");
        Thread t2 = new Thread(new MyThread(), "线程B");
        Thread t3 = new Thread(new MyThread(), "线程C");

        t1.setPriority(Thread.MIN_PRIORITY);//设置线程优先级
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }

}
