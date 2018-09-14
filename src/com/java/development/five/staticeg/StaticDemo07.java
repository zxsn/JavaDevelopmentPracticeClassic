/** 
 * projectName:Java开发实战经典 
 * fileName:StaticDemo07.java 
 * packageName:com.java.development.five.staticeg 
 * date:2018年9月14日下午12:07:16 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.staticeg;

/**   
 * @title: StaticDemo07.java 
 * @package com.java.development.five.staticeg 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月14日 下午12:07:16 
 * @version: V1.0   
*/
class Demo7 {
    private String     name;
    private static int count = 0;

    public Demo7() {
        count++;
        this.name = "DEMO-" + count;
    }

    public Demo7(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

public class StaticDemo07 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月14日 下午12:07:16
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        System.out.println(new Demo7().getName());
        System.out.println(new Demo7("JLX").getName());
        System.out.println(new Demo7().getName());
        System.out.println(new Demo7("HDC").getName());
        System.out.println(new Demo7().getName());

    }

}
