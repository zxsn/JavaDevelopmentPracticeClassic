/** 
 * projectName:Java开发实战经典 
 * fileName:InnerClassDemo04.java 
 * packageName:com.java.development.five.innerclass 
 * date:2018年9月17日下午2:46:51 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.innerclass;

/**   
 * @title: InnerClassDemo04.java 
 * @package com.java.development.five.innerclass 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月17日 下午2:46:51 
 * @version: V1.0   
*/
class Outer4 {
    private String info = "hello world!!!";

    class Inner {
        public void print() {
            System.out.println(info);
        }
    }
}

public class InnerClassDemo04 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午2:46:51
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Outer4 out = new Outer4();
        Outer4.Inner in = out.new Inner(); //外部类.内部类 内部类对象 = 外部类实例.new 内部类();
        in.print();

    }

}
