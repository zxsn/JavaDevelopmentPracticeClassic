/** 
 * projectName:Java开发实战经典 
 * fileName:MyThread.java 
 * packageName:com.java.development.nine.callable 
 * date:2018年9月29日下午6:33:11 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.nine.callable;

import java.util.concurrent.Callable;

/**   
 * @title: MyThread.java 
 * @package com.java.development.nine.callable 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月29日 下午6:33:11 
 * @version: V1.0   
 * @param <V>
*/
public class MyThread implements Callable<String> {
    private int ticket = 5;

    /**   
     * @title: call
     * @description: TODO
     * @return
     * @throws Exception   
     * @see java.util.concurrent.Callable#call()     
     */
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            if (this.ticket > 0) {
                System.out.println("卖票，ticket = " + this.ticket--);
            }

        }
        return "票卖光了";
    }

}
