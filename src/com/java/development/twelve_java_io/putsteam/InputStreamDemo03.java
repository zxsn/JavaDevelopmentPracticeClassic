
/**  
* @Title: InputStreamDemo03.java
* @Package com.java.development.twelve_java_io.putsteam
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月25日
* @version V1.0  
*/

package com.java.development.twelve_java_io.putsteam;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
    * @ClassName: InputStreamDemo03
    * @Description:开辟指定大小的byte数组
    * @author Administrator
    * @date 2018年10月25日
    *
    */

public class InputStreamDemo03 {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        //第1步，使用File找到一个文件
        File f = new File("d:" + File.separator + "test.txt");
        //第2步，通过子类实例化父类对象
        InputStream in = null;
        in = new FileInputStream(f);
        //第3步，进行读取操作
        byte b[] = new byte[(int) f.length()];
        in.read(b);
        //第4步，关闭流操作
        in.close();
        System.out.println("内容为：" + new String(b));
    }

}
