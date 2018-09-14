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
class Person2 {
    private String name;

    public Person2(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

public class ObjectArrayDemo02 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午2:13:49
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        //数组初始化
        Person2 per[] = { new Person2("张三"), new Person2("李四"), new Person2("王五") };

        System.out.println("=================数组输出=================");
        for (int i = 0; i < per.length; i++) {
            Person2 person1 = per[i];
            System.out.print(person1.getName() + "、");
        }

    }

}
