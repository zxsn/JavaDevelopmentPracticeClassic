/** 
 * projectName:Java开发实战经典 
 * fileName:Computer.java 
 * packageName:com.java.development.six.absandinf 
 * date:2018年9月25日下午5:59:09 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.absandinf;

/**   
 * @title: Computer.java 
 * @package com.java.development.six.absandinf 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月25日 下午5:59:09 
 * @version: V1.0   
*/
class Computer {
    public static void plugin(USB usb) {
        usb.start();
        System.out.println("==========USB设备工作==========");
        usb.stop();
    }
}
