/** 
 * projectName:Java开发实战经典 
 * fileName:ThreadDaemonDemo.java 
 * packageName:com.java.development.nine.threaddaemon 
 * date:2018年9月29日下午11:02:45 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.nine.threaddaemon;

class MyThead implements Runnable {
    /**   
     * @title: run
     * @description: TODO   
     * @see java.lang.Runnable#run()     
     */
    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + "在运行。");
        }

    }
}

/**   
 * @title: ThreadDaemonDemo.java 
 * @package com.java.development.nine.threaddaemon 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月29日 下午11:02:45 
 * @version: V1.0   
*/
public class ThreadDaemonDemo {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月29日 下午11:02:45
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        MyThead mt = new MyThead();
        Thread t = new Thread(mt, "线程");
        t.setDaemon(true);//此线程在后台运行
        t.start();

    }

}
