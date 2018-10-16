/** 
 * projectName:Java开发实战经典 
 * fileName:ThisDemo01.java 
 * packageName:com.java.development.five.thiseg 
 * date:2018年9月14日上午11:08:51 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.thiseg;

/**   
 * @title: ThisDemo01.java 
 * @package com.java.development.five.thiseg 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月14日 上午11:08:51 
 * @version: V1.0   
*/
class Person {
    private String name;
    private int    age;

    public Person(String name, int age) {
        //name = name; //对变量 name 的赋值不生效      this.nage = name;
        //age = age; //对变量 age 的赋值不生效             this.age = age;
    }

    public String getInfo() {
        return "姓名：" + name + "，年龄：" + age;

    }
}

public class ThisDemo01 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月14日 上午11:08:51
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Person per1 = new Person("张三", 33);
        System.out.println(per1.getInfo());
    }

}
