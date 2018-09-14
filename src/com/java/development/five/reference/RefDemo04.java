/** 
 * projectName:Java开发实战经典 
 * fileName:RefDemo04.java 
 * packageName:com.java.development.five.reference 
 * date:2018年9月14日上午10:18:56 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.reference;

/**   
 * @title: RefDemo04.java 
 * @package com.java.development.five.reference 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月14日 上午10:18:56 
 * @version: V1.0   
*/
class RefDemo04Demo {
    private int temp = 30;

    public void fun(RefDemo04Demo d2) {
        d2.temp = 40;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int t) {
        temp = t;
    }
}

public class RefDemo04 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月14日 上午10:18:56
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        RefDemo04Demo d1 = new RefDemo04Demo();
        d1.setTemp(50);
        d1.fun(d1);
        System.out.println("temp = " + d1.getTemp());

    }

}
