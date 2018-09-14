/** 
 * projectName:Java开发实战经典 
 * fileName:ThreadNameDemo.java 
 * packageName:com.java.development.nine.threadname 
 * date:2018年9月29日下午6:50:15 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.nine.threadname;

class MyThread implements Runnable {

    /**   
     * @title: run
     * @description: TODO   
     * @see java.lang.Runnable#run()     
     */
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "运行，i = " + i);

        }

    }

}

/**   
 * @title: ThreadNameDemo.java 
 * @package com.java.development.nine.threadname 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月29日 下午6:50:15 
 * @version: V1.0   
*/
public class ThreadNameDemo {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月29日 下午6:50:15
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        MyThread my = new MyThread();
        new Thread(my).start();
        new Thread(my, "线程-A").start();
        new Thread(my, "线程-B").start();
        new Thread(my).start();
        new Thread(my).start();

    }

}
