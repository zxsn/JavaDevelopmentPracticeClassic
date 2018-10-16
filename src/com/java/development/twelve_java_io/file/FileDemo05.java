
/**  
* @Title: FileDemo05.java
* @Package com.java.development.twelve_java_io
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月24日
* @version V1.0  
*/

package com.java.development.twelve_java_io.file;

import java.io.File;

/**
    * @ClassName: FileDemo05
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月24日
    *
    */

public class FileDemo05 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        File f = new File("d:" + File.separator + "test.txt");
        if (f.exists()) {//判断文件是否存在
            f.delete();//如果存在，则删除文件
        }
    }

}
