
/**  
* @Title: ZipInputStreamDemo02.java
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
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/**
* @ClassName: ZipInputStreamDemo02
* @Description:解压缩*.zip文件
* @author Administrator
* @date 2018年10月28日
*
*/

public class ZipInputStreamDemo02 {

    /**
     * @throws Exception 
     * @throws ZipException 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws ZipException, Exception {
        File file = new File("d:" + File.separator + "test.zip");//找到压缩文件
        File outFile = null;//定义输出的文件对象
        ZipFile zipFile = new ZipFile(file);//实例化ZipFile对象
        ZipInputStream zipInput = new ZipInputStream(new FileInputStream(file));//实例化Zip输入流
        ZipEntry entry = null;//定义一个ZipEntry对象，用于接收压缩文件中的每一个实体
        InputStream input = null;//定义输入流，用于读取每一个ZipEntry
        OutputStream out = null;//定义输出流，用于输出每一个ZipEntry
        while ((entry = zipInput.getNextEntry()) != null) {//得到每一个ZipEntry
            System.out.println("解压缩" + entry.getName() + "文件。");
            outFile = new File("d:" + File.separator + entry.getName());//实例化输出文件
            if (!outFile.getParentFile().exists()) {//判断文件夹是否存在
                outFile.getParentFile().mkdirs();//创建文件夹
            }
            if (!outFile.exists()) {//判断文件是否存在
                outFile.createNewFile();//创建文件
            }
            input = zipFile.getInputStream(entry);//得到压缩实体的输入流
            out = new FileOutputStream(outFile);//实例化输出流对象
            int temp = 0;
            while ((temp = input.read()) != -1) {//读取内容
                out.write(temp);//输出内容
            }
            out.close();//关闭输出流

        }
        input.close();//关闭输入流
        zipInput.close();//关闭压缩输入流
        zipFile.close();
    }

}
