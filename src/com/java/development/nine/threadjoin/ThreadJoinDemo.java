/** 
 * projectName:Java开发实战经典 
 * fileName:ThreadJoinDemo.java 
 * packageName:com.java.development.nine.threadjoin 
 * date:2018年9月29日下午7:45:46 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.nine.threadjoin;

class MyThread implements Runnable {
    /**   
     * @title: run
     * @description: TODO   
     * @see java.lang.Runnable#run()     
     */
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "运行，i = " + i);

        }

    }
}

/**   
 * @title: ThreadJoinDemo.java 
 * @package com.java.development.nine.threadjoin 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月29日 下午7:45:46 
 * @version: V1.0   
*/
public class ThreadJoinDemo {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月29日 下午7:45:46
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt, "线程");
        t.start();
        for (int i = 0; i < 50; i++) {
            if (i > 10) {
                try {
                    t.join();//线程t进行强制运行
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Main 线程运行 -->" + i);
        }

    }

}
