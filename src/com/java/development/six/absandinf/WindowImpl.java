/** 
 * projectName:Java开发实战经典 
 * fileName:WindowImpl.java 
 * packageName:com.java.development.six.absandinf 
 * date:2018年9月25日下午6:29:47 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.absandinf;

/**   
 * @title: WindowImpl.java 
 * @package com.java.development.six.absandinf 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月25日 下午6:29:47 
 * @version: V1.0   
*/
public class WindowImpl extends WindowAdapter {

    @Override
    public void open() {
        System.out.println("窗口打开。");
    }

    @Override
    public void close() {
        System.out.println("窗口关闭。");
    }

}
