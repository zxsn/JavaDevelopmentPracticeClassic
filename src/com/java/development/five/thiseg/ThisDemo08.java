/** 
 * projectName:Java开发实战经典 
 * fileName:ThisDemo08.java 
 * packageName:com.java.development.five.thiseg 
 * date:2018年9月14日上午11:31:58 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.thiseg;

/**   
 * @title: ThisDemo08.java 
 * @package com.java.development.five.thiseg 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月14日 上午11:31:58 
 * @version: V1.0   
*/
class Person8 {
    private String name;
    private int    age;

    public Person8(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public boolean compare(Person8 per) {
        Person8 p1 = this;
        Person8 p2 = per;
        if (p1 == p2) { //首先比较两个对象地址是否相同
            return true;
        }
        if (p2 == null) { //判断对象是否为空
            return false;
        }
        //分别判断每一个属性是否相等
        if (p1.name.equals(p2.name) && p1.age == p2.age) {
            return true;
        } else
            return false;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class ThisDemo08 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月14日 上午11:31:58
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Person8 per1 = new Person8("张三", 33);
        Person8 per2 = new Person8("张三", 33);
        if (per1.compare(per2)) {
            System.out.println("两个对象相等！");
        } else
            System.out.println("两个对象不想等！");

    }

}
