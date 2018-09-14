/** 
 * projectName:Java开发实战经典 
 * fileName:StaticCodeDemo.java 
 * packageName:com.java.development.five.codeblock 
 * date:2018年9月17日上午10:13:09 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.codeblock;

/**   
 * @title: StaticCodeDemo.java 
 * @package com.java.development.five.codeblock 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月17日 上午10:13:09 
 * @version: V1.0   
*/
class StaticCode {
    {
        System.out.println("1、构造快。");
    }
    static {
        System.out.println("0、静态地代码块。");
    }

    public StaticCode() {
        System.out.println("2、构造方法。");
    }
}

public class StaticCodeDemo {
    static {
        System.out.println("在主方法所在类中定义的代码块。");
    }

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 上午10:13:09
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        new StaticCode();
        new StaticCode();
        new StaticCode();
    }

}
