
/**  
* @Title: ZipOutputStreamDemo01.java
* @Package com.java.development.twelve_java_io.zipstream
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月28日
* @version V1.0  
*/

package com.java.development.twelve_java_io.zipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
    * @ClassName: ZipOutputStreamDemo01
    * @Description: 压缩一个文件
    * @author Administrator
    * @date 2018年10月28日
    *
    */

public class ZipOutputStreamDemo01 {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        File file = new File("d:" + File.separator + "test.txt");//定义要压缩的文件
        File zipFile = new File("d:" + File.separator + "test.zip");//定义压缩文件名称
        InputStream input = new FileInputStream(file);//定义输入文件流
        ZipOutputStream zipOut = null;//定义压缩输出流
        //实例化压缩 输出流对象，并指定压缩文件的输出路径
        zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
        //每一个被压缩的文件都用ZipEntry表示，需要为每一个压缩后的文件设置名称
        zipOut.putNextEntry(new ZipEntry(file.getName()));//创建ZipEntry
        zipOut.setComment("测试文件");//设置注释
        int temp = 0;//接收输入的数据
        while ((temp = input.read()) != -1) {//读取内容
            zipOut.write(temp);//压缩输出内容
        }
        zipOut.close();
        input.close();
    }

}
