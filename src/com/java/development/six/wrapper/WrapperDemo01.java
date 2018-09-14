/** 
 * projectName:Java开发实战经典 
 * fileName:WrapperDemo01.java 
 * packageName:com.java.development.six.wrapper 
 * date:2018年9月27日下午3:46:49 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.wrapper;

/**   
 * @title: WrapperDemo01.java 
 * @package com.java.development.six.wrapper 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月27日 下午3:46:49 
 * @version: V1.0   
*/
public class WrapperDemo01 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月27日 下午3:46:49
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        int x = 30;
        Integer i = new Integer(x); //装箱：将基本数据类型变为包装类
        int temp = i.intValue(); //拆箱：将一个包装类变为基本数据类型

    }

}
