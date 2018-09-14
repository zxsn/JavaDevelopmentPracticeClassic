/** 
 * projectName:Java开发实战经典 
 * fileName:ThisDemo03.java 
 * packageName:com.java.development.five.thiseg 
 * date:2018年9月14日上午11:18:54 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.thiseg;

/**   
 * @title: ThisDemo03.java 
 * @package com.java.development.five.thiseg 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月14日 上午11:18:54 
 * @version: V1.0   
*/
class Person3 {
    private String name;
    private int    age;

    public Person3() {
        System.out.println("一个新的Person对象被实例化。");
    }

    public Person3(String name, int age) {
        this(); //this调用构造方法必须也只能放在构造方法的第一行
        this.name = name;
        this.age = age;
    }

    public String getInfo() {
        return "姓名：" + name + "，年龄：" + age;
    }
}

public class ThisDemo03 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月14日 上午11:18:54
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Person3 per = new Person3("张三", 33);
        System.out.println(per.getInfo());

    }

}
