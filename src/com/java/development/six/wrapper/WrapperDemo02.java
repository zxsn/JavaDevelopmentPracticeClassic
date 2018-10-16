/** 
 * projectName:Java开发实战经典 
 * fileName:WrapperDemo02.java 
 * packageName:com.java.development.six.wrapper 
 * date:2018年9月27日下午3:48:57 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.wrapper;

/**   
 * @title: WrapperDemo02.java 
 * @package com.java.development.six.wrapper 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月27日 下午3:48:57 
 * @version: V1.0   
*/
public class WrapperDemo02 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月27日 下午3:48:57
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        float f = 30.3f;
        @SuppressWarnings("deprecation")
        Float x = new Float(f); //装箱
        @SuppressWarnings("unused")
        float y = x.floatValue(); //拆箱

    }

}
