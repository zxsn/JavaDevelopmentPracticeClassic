/** 
 * projectName:Java开发实战经典 
 * fileName:ObjectDemo04.java 
 * packageName:com.java.development.six.object 
 * date:2018年9月27日下午3:39:48 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.object;

/**   
 * @title: ObjectDemo04.java 
 * @package com.java.development.six.object 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月27日 下午3:39:48 
 * @version: V1.0   
*/
public class ObjectDemo04 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月27日 下午3:39:48
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        A a = new B(); //为接口实例化
        Object obj = a; //对象上转型
        A x = (A) obj; //对象下转型
        System.out.println(x.getInfo());

    }

}
