/** 
 * projectName:Java开发实战经典 
 * fileName:Apple.java 
 * packageName:com.java.development.six.absandinf 
 * date:2018年9月25日下午6:07:30 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.absandinf;

/**   
 * @title: Apple.java 
 * @package com.java.development.six.absandinf 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月25日 下午6:07:30 
 * @version: V1.0   
*/
public class Apple implements Fruit {

    /**   
     * @title: eat
     * @description: TODO   
     * @see com.java.development.six.absandinf.Fruit#eat()     
     */
    @Override
    public void eat() {
        System.out.println("***吃苹果。");

    }

}
