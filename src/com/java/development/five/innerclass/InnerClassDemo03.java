/** 
 * projectName:Java开发实战经典 
 * fileName:InnerClassDemo03.java 
 * packageName:com.java.development.five.innerclass 
 * date:2018年9月17日下午2:37:31 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.innerclass;

/**   
 * @title: InnerClassDemo03.java 
 * @package com.java.development.five.innerclass 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月17日 下午2:37:31 
 * @version: V1.0   
*/
class Outer3 {
    private static String info = "hello world!!!";

    static class Inner {
        public void print() {
            System.out.println(info);
        }
    }
}

public class InnerClassDemo03 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午2:37:31
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        new Outer3.Inner().print();

    }

}
