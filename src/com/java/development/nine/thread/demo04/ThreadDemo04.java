/** 
 * projectName:Java开发实战经典 
 * fileName:ThreadDemo04.java 
 * packageName:com.java.development.nine.thread.demo04 
 * date:2018年9月29日下午4:56:07 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.nine.thread.demo04;

class MyThread extends Thread {
    private String name;       //线程名
    private int    ticket = 5; //一共5张票

    public MyThread(String name) {
        this.name = name;
    }

    /**   
     * @title: run
     * @description: TODO   
     * @see java.lang.Thread#run()     
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {//模拟100个人买票
            if (ticket > 0) {
                System.out.println(name + "买票：" + ticket--);
            }

        }
    }
}

/**   
 * @title: ThreadDemo04.java 
 * @package com.java.development.nine.thread.demo04 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月29日 下午4:56:07 
 * @version: V1.0   
*/
public class ThreadDemo04 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月29日 下午4:56:07
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        MyThread mtd1 = new MyThread("线程A");
        MyThread mtd2 = new MyThread("线程B");
        MyThread mtd3 = new MyThread("线程C");

        mtd1.start();
        mtd2.start();
        mtd3.start();

    }

}
