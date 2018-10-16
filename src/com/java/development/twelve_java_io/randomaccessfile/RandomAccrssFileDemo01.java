
/**  
* @Title: RandomAccrssFileDemo01.java
* @Package com.java.development.twelve_java_io.randomaccess
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月25日
* @version V1.0  
*/

package com.java.development.twelve_java_io.randomaccessfile;

import java.io.File;
import java.io.RandomAccessFile;

/**
* @ClassName: RandomAccrssFileDemo01
* @Description: 使用RandomAccessFile类写入数据
* @author Administrator
* @date 2018年10月25日
*
*/

public class RandomAccrssFileDemo01 {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        File f = new File("d:" + File.separator + "test.txt");//指定要操作文件
        RandomAccessFile rdf = null;
        rdf = new RandomAccessFile(f, "rw");//以读写方式打开文件，会自动创建新文件
        String name = null;
        int age = 0;
        name = "zhangsan";//字符串长度为8
        age = 30;//数字长度为4
        rdf.writeBytes(name);
        rdf.writeInt(age);
        name = "lisi    ";//必须补齐8位，否则读取乱码
        age = 31;
        rdf.writeBytes(name);
        rdf.writeInt(age);
        name = "wangwu  ";
        age = 32;
        rdf.writeBytes(name);
        rdf.writeInt(age);
        rdf.close();//关闭文件
    }

}
