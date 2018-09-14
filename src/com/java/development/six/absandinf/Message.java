/** 
 * projectName:Java开发实战经典 
 * fileName:Message.java 
 * packageName:com.java.development.six.absandinf 
 * date:2018年9月25日下午6:34:43 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.absandinf;

/**   
 * @title: Message.java 
 * @package com.java.development.six.absandinf 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月25日 下午6:34:43 
 * @version: V1.0   
*/
interface Message {
    public void print();

    default void fun() {//default不能省略
        System.out.println("接口中的普通方法。");
    }
}
