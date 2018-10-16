/** 
 * projectName:Java开发实战经典 
 * fileName:ThreadDemo03.java 
 * packageName:com.java.development.nine.thread 
 * date:2018年9月29日下午2:07:42 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.nine.thread.demo03;

class MyThread extends Thread {
    private String name; //在类中定义一个属性

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() { //覆写Thread中的run()方法
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "运行，i = " + i);
        }
    }

}

/**   
 * @title: ThreadDemo03.java 
 * @package com.java.development.nine.thread 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月29日 下午2:07:42 
 * @version: V1.0   
*/
public class ThreadDemo03 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月29日 下午2:07:42
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("线程A");//实例化对象
        @SuppressWarnings("unused")
        MyThread mt2 = new MyThread("线程B");
        mt1.start();//启动线程
        mt1.start();//多次调用，报错：java.lang.IllegalThreadStateException
    }

}
