/** 
 * projectName:Java开发实战经典 
 * fileName:Ex01.java 
 * packageName:com.java.development.six.exercises 
 * date:2018年9月27日下午4:11:24 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.exercises;

/**   
 * @title: Ex01.java 
 * @package com.java.development.six.exercises 
 * @description: TODO定义一个ClassName接口，接口中只有一个抽象方法getClassName（）；
 * 设计一个类Company。该类实现接口ClassName中的方法getClassName（）。功能是获取该类的名称；
 * 编写应用程序使用Company类。
 * @author: zxsn
 * @date: 2018年9月27日 下午4:11:24 
 * @version: V1.0   
*/
interface ClassName {
    public String getClassName();
}

class Company implements ClassName {

    /**   
     * @return 
     * @title: getClassName
     * @description: TODO   
     * @see com.java.development.six.exercises.ClassName#getClassName()     
     */
    public String getClassName() {

        return this.getClass().getName();
    }

}

public class Ex01 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月27日 下午4:11:24
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Company c = new Company();
        String str = c.getClassName();
        System.out.println("类名称为：" + str);

    }

}
