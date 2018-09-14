/** 
 * projectName:Java开发实战经典 
 * fileName:ThreadInterruptDemo.java 
 * packageName:com.java.development.nine.threadinterrupt 
 * date:2018年9月29日下午8:22:06 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.nine.threadinterrupt;

class MyThread implements Runnable {
    /**   
     * @title: run
     * @description: TODO   
     * @see java.lang.Runnable#run()     
     */
    @Override
    public void run() {
        System.out.println("1、进入run()方法");
        try {
            Thread.sleep(10000);
            System.out.println("2、已经完成休眠");
        } catch (InterruptedException e) {
            System.out.println("3、休眠被终止");
            return;
        }
        System.out.println("4、run方法正常结束");

    }
}

/**   
 * @title: ThreadInterruptDemo.java 
 * @package com.java.development.nine.threadinterrupt 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月29日 下午8:22:06 
 * @version: V1.0   
*/
public class ThreadInterruptDemo {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月29日 下午8:22:07
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt, "线程");
        t.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();//中断线程的执行

    }

}
