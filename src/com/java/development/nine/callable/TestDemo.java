/** 
 * projectName:Java开发实战经典 
 * fileName:TestDemo.java 
 * packageName:com.java.development.nine.callable 
 * date:2018年9月29日下午6:37:35 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.nine.callable;

import java.util.concurrent.FutureTask;

/**   
 * @title: TestDemo.java 
 * @package com.java.development.nine.callable 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月29日 下午6:37:35 
 * @version: V1.0   
*/
public class TestDemo {

    /**
     * @throws Exception 
     * @throws InterruptedException 
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月29日 下午6:37:35
     *@param args
     *@throws 
     */
    public static void main(String[] args) throws Exception {
        MyThread mt1 = new MyThread();//实例化多线程对象
        MyThread mt2 = new MyThread();
        //FutureTack是Runnable()接口的子类，所以可以使用Thread类的构造来接收task对象
        FutureTask<String> task1 = new FutureTask<String>(mt1);
        FutureTask<String> task2 = new FutureTask<String>(mt2);

        new Thread(task1).start();//启动第1个线程
        new Thread(task2).start();

        //多线程执行完毕可以取得内容、依赖FutureTask的父接口Future中的get()方法实现
        System.out.println("A 线程的返回结果：" + task1.get());
        System.out.println("B 线程的返回结果：" + task2.get());
    }

}
