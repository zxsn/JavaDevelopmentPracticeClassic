
/**  
* @Title: FileDemo03.java
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
    * @ClassName: FileDemo03
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月24日
    *
    */

public class FileDemo03 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        String path = "d:" + File.separator + "test.txt";//组合出可以适应操作系统的路径（可以移植性）
        File f = new File(path);//必须给出路径
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
