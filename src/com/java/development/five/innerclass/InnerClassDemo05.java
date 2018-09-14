/** 
 * projectName:Java开发实战经典 
 * fileName:InnerClassDemo05.java 
 * packageName:com.java.development.five.innerclass 
 * date:2018年9月17日下午2:51:40 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.innerclass;

/**   
 * @title: InnerClassDemo05.java 
 * @package com.java.development.five.innerclass 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月17日 下午2:51:40 
 * @version: V1.0   
*/
class Outer5 {
    private String info = "hello world!!!";

    public void fun(final int temp) { //JDK>=1.8，final可以省略
        class Inner {
            public void print() {
                System.out.println("类中的属性：" + info);
                System.out.println("方法中的参数：" + temp);
            }
        }
        new Inner().print();
    }
}

public class InnerClassDemo05 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午2:51:40
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        new Outer5().fun(30);

    }

}
