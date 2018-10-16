/** 
 * projectName:Java开发实战经典 
 * fileName:WrapperDemo03.java 
 * packageName:com.java.development.six.wrapper 
 * date:2018年9月27日下午3:50:47 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.wrapper;

/**   
 * @title: WrapperDemo03.java 
 * @package com.java.development.six.wrapper 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月27日 下午3:50:47 
 * @version: V1.0   
*/
public class WrapperDemo03 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月27日 下午3:50:47
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Integer i = 30; //自动装箱  JDK>=1.5
        Float f = 30.3f;
        @SuppressWarnings("unused")
        int x = i; //自动拆箱
        @SuppressWarnings("unused")
        float y = f;

    }

}
