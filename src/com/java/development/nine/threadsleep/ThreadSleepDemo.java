/** 
 * projectName:Java开发实战经典 
 * fileName:ThreadSleepDemo.java 
 * packageName:com.java.development.nine.threadsleep 
 * date:2018年9月29日下午8:13:53 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.nine.threadsleep;

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
            System.out.println(Thread.currentThread().getName() + "运行， i = " + i);
        }

    }
}

/**   
 * @title: ThreadSleepDemo.java 
 * @package com.java.development.nine.threadsleep 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月29日 下午8:13:53 
 * @version: V1.0   
*/
public class ThreadSleepDemo {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月29日 下午8:13:53
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        new Thread(mt, "线程").start();

    }

}
