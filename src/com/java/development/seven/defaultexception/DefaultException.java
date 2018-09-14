/** 
 * projectName:Java开发实战经典 
 * fileName:DefaultException.java 
 * packageName:com.java.development.seven.defaultexception 
 * date:2018年9月28日下午5:04:42 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.seven.defaultexception;

class MyException extends Exception {

    /**   
     * @Fields serialVersionUID : TODO
     */
    private static final long serialVersionUID = 1L;

    public MyException(String msg) { //构造方法接收异常信息
        super(msg); //调用父类中的构造方法
    }

}

/**   
 * @title: DefaultException.java 
 * @package com.java.development.seven.defaultexception 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月28日 下午5:04:42 
 * @version: V1.0   
*/
public class DefaultException {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月28日 下午5:04:42
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        try {
            throw new MyException("自定义异常。");
        } catch (MyException e) {
            System.out.println(e);
        }

    }

}
