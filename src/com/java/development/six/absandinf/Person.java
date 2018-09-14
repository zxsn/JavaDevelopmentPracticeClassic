/** 
 * projectName:Java开发实战经典 
 * fileName:Person.java 
 * packageName:com.java.development.six.absandinf 
 * date:2018年9月21日下午5:51:43 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.absandinf;

/**   
 * @title: Person.java 
 * @package com.java.development.six.absandinf 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月21日 下午5:51:43 
 * @version: V1.0   
*/
abstract class Person {
    private String name;
    private int    age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void say() {
        System.out.println(this.getContent());
    }

    /**
     *@title getContent 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月21日 下午5:56:10
     *@return
     *@throws 
     */
    public abstract String getContent();
}
