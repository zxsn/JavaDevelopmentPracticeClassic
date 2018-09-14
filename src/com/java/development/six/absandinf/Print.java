/** 
 * projectName:Java开发实战经典 
 * fileName:Print.java 
 * packageName:com.java.development.six.absandinf 
 * date:2018年9月25日下午6:02:34 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.absandinf;

/**   
 * @title: Print.java 
 * @package com.java.development.six.absandinf 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月25日 下午6:02:34 
 * @version: V1.0   
*/
public class Print implements USB {

    /**   
     * @title: start
     * @description: TODO   
     * @see com.java.development.six.absandinf.USB#start()     
     */
    @Override
    public void start() {
        System.out.println("打印机开始工作。");

    }

    /**   
     * @title: stop
     * @description: TODO   
     * @see com.java.development.six.absandinf.USB#stop()     
     */
    @Override
    public void stop() {
        System.out.println("打印机开始工作。");

    }

}
