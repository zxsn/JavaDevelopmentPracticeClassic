/** 
 * projectName:Java开发实战经典 
 * fileName:ThrowDemo02.java 
 * packageName:com.java.development.seven.throws_throw 
 * date:2018年9月28日下午4:40:52 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.seven.throws_throw;

class Math2 {
    public int div(int i, int j) throws Exception {
        System.out.println("*************计算开始****************");
        int temp = 0;
        try {
            temp = i / j;
        } catch (Exception e) {
            throw e;
        } finally {
            System.out.println("*************计算结束****************");
        }
        return temp;
    }
}

/**   
 * @title: ThrowDemo02.java 
 * @package com.java.development.seven.throws_throw 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月28日 下午4:40:52 
 * @version: V1.0   
*/
public class ThrowDemo02 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月28日 下午4:40:52
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Math2 m = new Math2();
        try {
            System.out.println("除法操作：" + m.div(10, 0));
        } catch (Exception e) {
            System.out.println("异常产生：" + e);
        }

    }

}
