/** 
 * projectName:Java开发实战经典 
 * fileName:MessageImpl.java 
 * packageName:com.java.development.six.absandinf 
 * date:2018年9月25日下午6:37:24 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.absandinf;

/**   
 * @title: MessageImpl.java 
 * @package com.java.development.six.absandinf 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月25日 下午6:37:24 
 * @version: V1.0   
*/
public class MessageImpl implements Message {

    /**   
     * @title: print
     * @description: TODO   
     * @see com.java.development.six.absandinf.Message#print()     
     */
    @Override
    public void print() {
        System.out.println("覆写接口的方法。");

    }

}
