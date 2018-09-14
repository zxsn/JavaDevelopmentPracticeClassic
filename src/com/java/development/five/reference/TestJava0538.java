/** 
 * projectName:Java开发实战经典 
 * fileName:TestJava0538.java 
 * packageName:com.java.development.five.reference 
 * date:2018年9月14日上午10:04:17 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.reference;

/**   
 * @title: TestJava0538.java 
 * @package com.java.development.five.reference 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月14日 上午10:04:17 
 * @version: V1.0   
*/
class Demo {
    int temp = 30;
};

public class TestJava0538 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月14日 上午10:04:17
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.temp = 50;
        System.out.println("fun()方法调用之前：" + d1.temp);
        fun(d1);
        System.out.println("fun()方法调用之后：" + d1.temp);

    }

    public static void fun(Demo d2) {
        d2.temp = 1000;
    }

}
