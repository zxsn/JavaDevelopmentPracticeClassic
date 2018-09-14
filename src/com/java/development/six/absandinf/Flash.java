/** 
 * projectName:Java开发实战经典 
 * fileName:Flash.java 
 * packageName:com.java.development.six.absandinf 
 * date:2018年9月25日下午6:01:22 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.absandinf;

/**   
 * @title: Flash.java 
 * @package com.java.development.six.absandinf 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月25日 下午6:01:22 
 * @version: V1.0   
*/
public class Flash implements USB {

    /**   
     * @title: start
     * @description: TODO   
     * @see com.java.development.six.absandinf.USB#start()     
     */
    @Override
    public void start() {
        System.out.println("U盘开始工作。");

    }

    /**   
     * @title: stop
     * @description: TODO   
     * @see com.java.development.six.absandinf.USB#stop()     
     */
    @Override
    public void stop() {
        System.out.println("U盘停止工作。");

    }

}
