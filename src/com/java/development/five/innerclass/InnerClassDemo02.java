/** 
 * projectName:Java开发实战经典 
 * fileName:InnerClassDemo02.java 
 * packageName:com.java.development.five.innerclass 
 * date:2018年9月17日下午2:29:38 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.innerclass;

/**   
 * @title: InnerClassDemo02.java 
 * @package com.java.development.five.innerclass 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月17日 下午2:29:38 
 * @version: V1.0   
*/
class Outer2 {
    private String info = "hello world!!!";

    public String getInfo() {
        return this.info;
    }

    public void fun() {
        new Inner(this).print();
    }

    class Inner {
        private Outer2 out = null;

        public Inner(Outer2 out) {
            this.out = out;
        }

        public void print() {
            System.out.println(out.getInfo());
        }
    }
}

public class InnerClassDemo02 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午2:29:38
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        new Outer2().fun();

    }

}
