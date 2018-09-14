/** 
 * projectName:Java开发实战经典 
 * fileName:AbstractCaseDemo02.java 
 * packageName:com.java.development.six.absandinf 
 * date:2018年9月21日下午6:06:45 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.absandinf;

/**   
 * @title: AbstractCaseDemo02.java 
 * @package com.java.development.six.absandinf 
 * @description: TODO模板设计
 * @author: zxsn
 * @date: 2018年9月21日 下午6:06:45 
 * @version: V1.0   
*/
public class AbstractCaseDemo02 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月21日 下午6:06:45
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Person per1 = new Student("张三", 20, 98f);
        Person per2 = new Worker("李四", 30, 3000f);
        per1.say();
        per2.say();

    }

}
