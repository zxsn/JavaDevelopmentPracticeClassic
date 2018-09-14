/** 
 * projectName:Java开发实战经典 
 * fileName:ObjectDemo02.java 
 * packageName:com.java.development.six.object 
 * date:2018年9月27日下午12:30:57 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.object;

/**   
 * @title: ObjectDemo02.java 
 * @package com.java.development.six.object 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月27日 下午12:30:57 
 * @version: V1.0   
*/
class Person1 {
    private String name;
    private int    age;

    /**   
     * @title: Person   
     * @description: TODO
     * @param:   
     * @throws   
     */
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**   
     * @title: toString
     * @description: TODO
     * @return   
     * @see java.lang.Object#toString()     
     */
    @Override
    public String toString() {
        return "姓名：" + this.name + "；年龄：" + this.age;
    }
}

public class ObjectDemo02 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月27日 下午12:30:57
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Person1 per = new Person1("贾利鑫", 25);
        System.out.println("对象信息：" + per);

    }

}
