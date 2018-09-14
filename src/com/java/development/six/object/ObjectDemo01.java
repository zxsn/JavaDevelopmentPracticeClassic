/** 
 * projectName:Java开发实战经典 
 * fileName:ObjectDemo01.java 
 * packageName:com.java.development.six.object 
 * date:2018年9月27日下午12:29:02 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.object;

/**   
 * @title: ObjectDemo01.java 
 * @package com.java.development.six.object 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月27日 下午12:29:02 
 * @version: V1.0   
*/
class Demo01 {

}

public class ObjectDemo01 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月27日 下午12:29:02
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Demo01 d = new Demo01();
        System.out.println("不加toString()输出：" + d);
        System.out.println("加toString()输出：" + d.toString());

    }

}
