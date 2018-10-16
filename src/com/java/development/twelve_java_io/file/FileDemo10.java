
/**  
* @Title: FileDemo10.java
* @Package com.java.development.twelve_java_io
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月24日
* @version V1.0  
*/

package com.java.development.twelve_java_io.file;

import java.io.File;

/**
    * @ClassName: FileDemo10
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月24日
    *
    */

public class FileDemo10 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        File f = new File("d:" + File.separator);
        if (f.isDirectory()) {//判断是否是目录
            System.out.println(f.getPath() + "路径是目录");
        } else {
            System.out.println(f.getPath() + "路径不是目录");
        }

    }

}
