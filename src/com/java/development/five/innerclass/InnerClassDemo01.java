/** 
 * projectName:Java开发实战经典 
 * fileName:InnerClassDemo01.java 
 * packageName:com.java.development.five.innerclass 
 * date:2018年9月17日下午2:26:21 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.innerclass;

/**   
 * @title: InnerClassDemo01.java 
 * @package com.java.development.five.innerclass 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月17日 下午2:26:21 
 * @version: V1.0   
*/
class Outer1 {
    private String info = "hello world!!!";

    class Inner {
        public void print() {
            System.out.println(info);
        }
    }

    public void fun() {
        new Inner().print();
    }
}

public class InnerClassDemo01 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午2:26:21
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        new Outer1().fun();

    }

}
