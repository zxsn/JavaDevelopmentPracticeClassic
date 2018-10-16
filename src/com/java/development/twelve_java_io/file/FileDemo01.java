
/**  
* @Title: FileDemo01.java
* @Package com.java.development.twelve_java_io
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月24日
* @version V1.0  
*/

package com.java.development.twelve_java_io.file;

import java.io.File;
import java.io.IOException;

/**
    * @ClassName: FileDemo01
    * @Description:创建新文件
    * @author Administrator
    * @date 2018年10月24日
    *
    */

public class FileDemo01 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        File f = new File("D:\\test.txt");//必须给出完整路径
        try {
            f.createNewFile();//根据给定的路径创建新文件
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
