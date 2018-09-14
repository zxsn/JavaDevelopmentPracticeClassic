/** 
 * projectName:Java开发实战经典 
 * fileName:ThrowDemo01.java 
 * packageName:com.java.development.seven.throws_throw 
 * date:2018年9月28日下午4:27:37 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.seven.throws_throw;

/**   
 * @title: ThrowDemo01.java 
 * @package com.java.development.seven.throws_throw 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月28日 下午4:27:37 
 * @version: V1.0   
*/
public class ThrowDemo01 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月28日 下午4:27:37
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        try {
            throw new Exception("自己抛出的异常！");
        } catch (Exception e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }

    }

}
