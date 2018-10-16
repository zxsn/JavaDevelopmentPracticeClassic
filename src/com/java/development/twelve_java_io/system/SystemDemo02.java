
/**  
* @Title: SystemDemo02.java
* @Package com.java.development.twelve_java_io.system
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月27日
* @version V1.0  
*/

package com.java.development.twelve_java_io.system;

/**
* @ClassName: SystemDemo02
* @Description: 错误信息输出
* @author Administrator
* @date 2018年10月27日
*
*/

public class SystemDemo02 {

    /**
        * @Title: main
        * @Description:错误信息输出
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        String str = "hello";
        try {
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            System.err.println(e);
        }

    }

}
