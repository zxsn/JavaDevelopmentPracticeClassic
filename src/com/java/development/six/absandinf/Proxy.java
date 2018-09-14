/** 
 * projectName:Java开发实战经典 
 * fileName:Proxy.java 
 * packageName:com.java.development.six.absandinf 
 * date:2018年9月25日下午6:19:36 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.absandinf;

/**   
 * @title: Proxy.java 
 * @package com.java.development.six.absandinf 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月25日 下午6:19:36 
 * @version: V1.0   
*/
public class Proxy implements Network {
    public Network network;

    /**   
     * @title: Proxy   
     * @description: TODO
     * @param:   
     * @throws   
     */
    public Proxy(Network network) {
        this.network = network;
    }

    public void check() {
        System.out.println("检查用户名是否合法。");
    }

    /**   
     * @title: browse
     * @description: TODO   
     * @see com.java.development.six.absandinf.Network#browse()     
     */
    @Override
    public void browse() {
        this.check();
        this.network.browse();

    }

}
