/** 
 * projectName:Java开发实战经典 
 * fileName:PRoxyDemo.java 
 * packageName:com.java.development.six.absandinf 
 * date:2018年9月25日下午6:23:53 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.absandinf;

/**   
 * @title: PRoxyDemo.java 
 * @package com.java.development.six.absandinf 
 * @description: TODO代理设计模式
 * @author: zxsn
 * @date: 2018年9月25日 下午6:23:53 
 * @version: V1.0   
*/
public class PRoxyDemo {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月25日 下午6:23:53
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Network net = null;
        net = new Proxy(new Real());
        net.browse();

    }

}
