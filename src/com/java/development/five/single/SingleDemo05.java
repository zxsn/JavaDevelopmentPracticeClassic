/** 
 * projectName:Java开发实战经典 
 * fileName:SingleDemo05.java 
 * packageName:com.java.development.five.single 
 * date:2018年9月17日下午2:03:19 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.single;

/**   
 * @title: SingleDemo05.java 
 * @package com.java.development.five.single 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月17日 下午2:03:19 
 * @version: V1.0   
*/
class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    static Singleton getInstance() {
        return instance;

    }

    public void print() {
        System.out.println("Hello World!!!");
    }
}

public class SingleDemo05 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午2:03:19
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        s1.print();
        s2.print();
        s3.print();

    }

}
