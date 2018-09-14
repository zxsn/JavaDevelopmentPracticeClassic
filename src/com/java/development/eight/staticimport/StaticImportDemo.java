/** 
 * projectName:Java开发实战经典 
 * fileName:StaticImportDemo.java 
 * packageName:com.java.development.eight.staticimport 
 * date:2018年9月29日上午10:42:59 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.eight.staticimport;

import static com.java.development.eight.staticimport.Operate.add;
import static com.java.development.eight.staticimport.Operate.div;
import static com.java.development.eight.staticimport.Operate.mul;
import static com.java.development.eight.staticimport.Operate.sub;

/**   
 * @title: StaticImportDemo.java 
 * @package com.java.development.eight.staticimport 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月29日 上午10:42:59 
 * @version: V1.0   
*/
public class StaticImportDemo {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月29日 上午10:42:59
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        System.out.println("3 + 3 = " + add(3, 3));
        System.out.println("3 - 2 = " + sub(3, 3));
        System.out.println("3 * 3 = " + mul(3, 3));
        System.out.println("3 / 3 = " + div(3, 3));

    }

}
