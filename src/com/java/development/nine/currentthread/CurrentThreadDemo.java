/** 
 * projectName:Java开发实战经典 
 * fileName:CurrentThreadDemo.java 
 * packageName:com.java.development.nine.currentthread 
 * date:2018年9月29日下午6:55:39 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.nine.currentthread;

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
 * @title: CurrentThreadDemo.java 
 * @package com.java.development.nine.currentthread 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月29日 下午6:55:39 
 * @version: V1.0   
*/
public class CurrentThreadDemo {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月29日 下午6:55:39
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        MyThread my = new MyThread();
        new Thread(my, "线程").start();
        my.run();

    }

}
