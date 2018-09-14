/** 
 * projectName:Java开发实战经典 
 * fileName:ObjectArrayDemo01.java 
 * packageName:com.java.development.five.objectarray 
 * date:2018年9月17日下午2:13:49 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.objectarray;

/**   
 * @title: ObjectArrayDemo01.java 
 * @package com.java.development.five.objectarray 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月17日 下午2:13:49 
 * @version: V1.0   
*/
class Person1 {
    private String name;

    public Person1(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

public class ObjectArrayDemo01 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午2:13:49
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Person1 per[] = new Person1[3];
        System.out.println("==================数组声明==================");
        for (int i = 0; i < per.length; i++) {
            Person1 person1 = per[i];
            System.out.print(person1 + "、");
        }
        //数组初始化
        per[0] = new Person1("张三");
        per[1] = new Person1("李四");
        per[2] = new Person1("王五");
        System.out.println("\n=================对象实例化=================");
        for (int i = 0; i < per.length; i++) {
            Person1 person1 = per[i];
            System.out.print(person1.getName() + "、");
        }

    }

}
