/** 
 * projectName:Java开发实战经典 
 * fileName:Factory.java 
 * packageName:com.java.development.six.absandinf 
 * date:2018年9月25日下午6:10:47 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.absandinf;

/**   
 * @title: Factory.java 
 * @package com.java.development.six.absandinf 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月25日 下午6:10:47 
 * @version: V1.0   
*/
public class Factory {
    public static Fruit getInstance(String className) {
        Fruit f = null;
        if ("apple".equals(className)) {
            f = new Apple();
        }
        if ("orange".equals(className)) {
            f = new Orange();
        }
        return f;

    }
}
