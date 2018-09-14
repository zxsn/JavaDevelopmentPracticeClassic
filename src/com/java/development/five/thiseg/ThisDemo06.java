/** 
 * projectName:Java开发实战经典 
 * fileName:ThisDemo06.java 
 * packageName:com.java.development.five.thiseg 
 * date:2018年9月14日上午11:25:16 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.thiseg;

/**   
 * @title: ThisDemo06.java 
 * @package com.java.development.five.thiseg 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月14日 上午11:25:16 
 * @version: V1.0   
*/
class Person6 {
    public String getInfo() {
        System.out.println("person6类-->" + this);
        return null;
    }
}

public class ThisDemo06 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月14日 上午11:25:16
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Person6 per1 = new Person6();
        Person6 per2 = new Person6();
        System.out.println("MAIN方法-->" + per1);
        per1.getInfo();
        System.out.println("--------------------------");
        System.out.println("MAIN方法-->" + per2);
        per2.getInfo();

    }

}
