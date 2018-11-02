
/**  
* @Title: DataOutputStreamDemo.java
* @Package com.java.development.twelve_java_io.dataoutputstream
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月28日
* @version V1.0  
*/

package com.java.development.twelve_java_io.dataoutputstream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
* @ClassName: DataOutputStreamDemo
* @Description:将订单数据写入到文件order.txt中
* @author Administrator
* @date 2018年10月28日
*
*/

public class DataOutputStreamDemo {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        DataOutputStream dos = null;//声明数据输入流对象
        File f = new File("d:" + File.separator + "order.txt");//指定文件的保存路径
        dos = new DataOutputStream(new FileOutputStream(f));//实例化数据输出流对象
		String names[] = {"衬衣", "手套", "围巾"};
        float prices[] = { 98.3f, 30.3f, 50.5f };
        int nums[] = { 3, 2, 1 };
        for (int i = 0; i < names.length; i++) {//循环写入
            dos.writeChars(names[i]);
            dos.writeChar('\t');//加入分隔符
            dos.writeFloat(prices[i]);
            dos.writeChar('\t');
            dos.writeInt(nums[i]);
            dos.writeChar('\n');//换行
        }
        dos.close();
    }

}
