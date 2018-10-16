
/**  
* @Title: InputStreamDemo05.java
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
* @ClassName: InputStreamDemo05
* @Description:另一种方式读取
* @author Administrator
* @date 2018年10月25日
*
*/

public class InputStreamDemo05 {

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
        int len = 0;
        byte b[] = new byte[1024];//将所有的内容读取到此数组之中
        int temp = 0;//接受读取的每一个内容
        while ((temp = in.read()) != -1) {
            //将每次的读取内容给temp变量，如果temp的值不是-1，则表示文件没有读完
            b[len] = (byte) temp;
            len++;
        }
        //第4步，关闭流操作
        in.close();
        System.out.println("内容为：" + new String(b, 0, len));

    }

}
