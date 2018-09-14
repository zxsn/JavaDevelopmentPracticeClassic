/** 
 * projectName:Java开发实战经典 
 * fileName:StaticDemo06.java 
 * packageName:com.java.development.five.staticeg 
 * date:2018年9月14日下午12:03:54 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.staticeg;

/**   
 * @title: StaticDemo06.java 
 * @package com.java.development.five.staticeg 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月14日 下午12:03:54 
 * @version: V1.0   
*/
class Demo6 {
    private static int count = 0; //所有对象共享此属性

    public Demo6() {
        count++;
        System.out.println("产生了" + count + "个对象！");
    }
}

public class StaticDemo06 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月14日 下午12:03:54
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        new Demo6();
        new Demo6();
        new Demo6();

    }

}
