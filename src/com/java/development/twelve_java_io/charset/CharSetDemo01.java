
/**  
* @Title: CharSetDemo01.java
* @Package com.java.development.twelve_java_io.charset
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月28日
* @version V1.0  
*/

package com.java.development.twelve_java_io.charset;

/**
* @ClassName: CharSetDemo01
* @Description:获取JVM的默认编码
* @author Administrator
* @date 2018年10月28日
*
*/

public class CharSetDemo01 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {//右键Java文件，属性--资源设置文本文件编码格式
        System.out.println("系统默认编码：" + System.getProperty("file.encoding"));//获取当前系统编码
    }

}
