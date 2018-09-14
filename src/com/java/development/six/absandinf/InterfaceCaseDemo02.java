/** 
 * projectName:Java开发实战经典 
 * fileName:InterfaceCaseDemo02.java 
 * packageName:com.java.development.six.absandinf 
 * date:2018年9月25日下午6:03:27 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.absandinf;

/**   
 * @title: InterfaceCaseDemo02.java 
 * @package com.java.development.six.absandinf 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月25日 下午6:03:27 
 * @version: V1.0   
*/
public class InterfaceCaseDemo02 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月25日 下午6:03:27
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Computer.plugin(new Flash());
        Computer.plugin(new Print());

    }

}
