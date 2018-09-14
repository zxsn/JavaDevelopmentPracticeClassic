/** 
 * projectName:Java开发实战经典 
 * fileName:ThreadAlive.java 
 * packageName:com.java.development.nine.threadalive 
 * date:2018年9月29日下午7:03:20 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.nine.threadalive;

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
 * @title: ThreadAlive.java 
 * @package com.java.development.nine.threadalive 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月29日 下午7:03:20 
 * @version: V1.0   
*/
public class ThreadAlive {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月29日 下午7:03:20
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        MyThread my = new MyThread();
        Thread t = new Thread(my, "线程");
        System.out.println("线程开始执行之前-->" + t.isAlive());
        t.start();
        System.out.println("线程开始执行之后-->" + t.isAlive());
        for (int i = 0; i < 3; i++) {
            System.out.println("main 运行" + i);

        }
        System.out.println("代码执行之后 -->" + t.isAlive());

    }

}
