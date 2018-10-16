
/**  
* @Title: FileDemo11.java
* @Package com.java.development.twelve_java_io
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月24日
* @version V1.0  
*/

package com.java.development.twelve_java_io.file;

import java.io.File;

/**
    * @ClassName: FileDemo11
    * @Description: 列出指定目录的全部内容
    * @author Administrator
    * @date 2018年10月24日
    *
    */

public class FileDemo11 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        File my = new File("d:" + File.separator);
        print(my);
    }

    /**
    * @Title: print
    * @Description:打印目录
    * @param @param my    参数
    * @return void    返回类型
    * @throws
    */

    public static void print(File file) {
        if (file != null) {//增加一个检查机制
            if (file.isDirectory()) {//判断是否是目录
                File files[] = file.listFiles();//如果是目录，列出全部的内容
                if (files != null) {//有可能无法列出目录中的文件
                    for (int i = 0; i < files.length; i++) {
                        print(files[i]);//继续列出内容
                    }
                }
            } else {
                System.out.println(file);//如果不是目录，则直接打印路径信息
            }
        }

    }

}
