/** 
 * projectName:Java开发实战经典 
 * fileName:RunnableDemo01.java 
 * packageName:com.java.development.nine.runnable 
 * date:2018年9月29日下午4:43:26 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.nine.runnable;

class MyThread implements Runnable {//实现Runnable接口
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    /**   
     * @title: run
     * @description: TODO   
     * @see java.lang.Runnable#run()     
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "运行，i= " + i);

        }

    }

}

/**   
 * @title: RunnableDemo01.java 
 * @package com.java.development.nine.runnable 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月29日 下午4:43:26 
 * @version: V1.0   
*/
public class RunnableDemo01 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月29日 下午4:43:26
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("线程A");//实例化Runnable()子类对象
        MyThread mt2 = new MyThread("线程B");
        Thread t1 = new Thread(mt1);//实例化Thread()类对象
        Thread t2 = new Thread(mt2);
        t1.start();//启动线程
        t2.start();

    }

}
