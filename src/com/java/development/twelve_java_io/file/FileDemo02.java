
/**  
* @Title: FileDemo02.java
* @Package com.java.development.twelve_java_io
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月24日
* @version V1.0  
*/

package com.java.development.twelve_java_io.file;

import java.io.File;

/**
* @ClassName: FileDemo02
* @Description:观察File类中提供的两个常量
* @author Administrator
* @date 2018年10月24日
*
*/

public class FileDemo02 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        System.out.println("pathSeparator：" + File.pathSeparator);//调用静态常量
        System.out.println("separator：" + File.separator);

    }

}
