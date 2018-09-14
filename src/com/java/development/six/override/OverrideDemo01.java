/** 
 * projectName:Java开发实战经典 
 * fileName:OverrideDemo01.java 
 * packageName:com.java.development.six.override 
 * date:2018年9月21日下午2:29:35 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.override;

/**   
 * @title: OverrideDemo01.java 
 * @package com.java.development.six.override 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月21日 下午2:29:35 
 * @version: V1.0   
*/
class Person {
    void print() {
        System.out.println("Person-->void print(){}");
    }
}

class Student extends Person {
    void print() {
        System.out.println("Student-->void print(){}");
    }
}

public class OverrideDemo01 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月21日 下午2:29:35
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        new Student().print();

    }

}
