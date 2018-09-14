/** 
 * projectName:Java开发实战经典 
 * fileName:PackageDemo.java 
 * packageName:com.java.development.eight.packagedemo 
 * date:2018年9月29日上午10:04:48 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.eight.packagedemo;

class Demo {
    public String getInfo() {
        return "Hello World!!!";
    }
}

/**   
 * @title: PackageDemo.java 
 * @package com.java.development.eight.packagedemo 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月29日 上午10:04:48 
 * @version: V1.0   
*/
public class PackageDemo {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月29日 上午10:04:48
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        System.out.println(new Demo().getInfo());

    }

}
