/** 
 * projectName:Java开发实战经典 
 * fileName:AdapterDemo.java 
 * packageName:com.java.development.six.absandinf 
 * date:2018年9月25日下午6:26:47 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.absandinf;

/**   
 * @title: AdapterDemo.java 
 * @package com.java.development.six.absandinf 
 * @description: TODO适配器设计模式
 * @author: zxsn
 * @date: 2018年9月25日 下午6:26:47 
 * @version: V1.0   
*/
public class AdapterDemo {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月25日 下午6:26:47
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Window win = new WindowImpl();
        win.open();
        win.close();

    }

}
