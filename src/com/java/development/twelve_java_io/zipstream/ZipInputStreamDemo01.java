
/**  
* @Title: ZipInputStreamDemo01.java
* @Package com.java.development.twelve_java_io.zipstream
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月28日
* @version V1.0  
*/

package com.java.development.twelve_java_io.zipstream;

import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
* @ClassName: ZipInputStreamDemo01
* @Description:取得*.zip中的一个ZipEntry
* @author Administrator
* @date 2018年10月28日
*
*/

public class ZipInputStreamDemo01 {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        File zipFlie = new File("d:" + File.separator + "test.zip");
        ZipInputStream input = null;//定义压缩输入流
        input = new ZipInputStream(new FileInputStream(zipFlie));//实例化压缩输入流
        ZipEntry entry = input.getNextEntry();//得到一个压缩实体
        System.out.println("压缩实体名称：" + entry.getName());//输出实体名称
        input.close();
    }

}
