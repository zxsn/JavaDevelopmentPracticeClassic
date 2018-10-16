
/**  
* @Title: CharSetDemo02.java
* @Package com.java.development.twelve_java_io.charset
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月28日
* @version V1.0  
*/

package com.java.development.twelve_java_io.charset;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
* @ClassName: CharSetDemo02
* @Description: 使用ISO8859-1编码
* @author Administrator
* @date 2018年10月28日
*
*/

public class CharSetDemo02 {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        File f = new File("d:" + File.separator + "a.txt");
        OutputStream out = new FileOutputStream(f);//实例化输出流
        byte b[] = "中国，你好！".getBytes("ISO8859-1");//指定ISO8859-1编码
        out.write(b);//保存转码之后的数据
        out.close();//关闭输出流
    }

}
