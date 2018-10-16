
/**  
* @Title: DataInputStreanDemo.java
* @Package com.java.development.twelve_java_io.dataoutputstream
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月28日
* @version V1.0  
*/

package com.java.development.twelve_java_io.dataoutputstream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
    * @ClassName: DataInputStreanDemo
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月28日
    *
    */

public class DataInputStreanDemo {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        DataInputStream dis = null;//声明数据输入流对象
        File f = new File("d:" + File.separator + "order.txt");//要读取的文件
        dis = new DataInputStream(new FileInputStream(f));//实例化数据输入流对象
        String name = null;//接收名称
        float price = 0.0f;//接收价格
        int num = 0;//接收数量
        char temp[] = null;//接收字符串数据
        char c = 0;//声明字符变量，接收读取数据
        int len = 0;
        try {
            while (true) {//循环读取
                temp = new char[200];//开辟空间
                len = 0;
                while ((c = dis.readChar()) != '\t') {//读取字符
                    temp[len] = c;//接收内容
                    len++;
                }
                name = new String(temp, 0, len);//将字符数组变为String
                price = dis.readFloat();
                dis.readChar();
                num = dis.readInt();
                dis.readChar();
                System.out.printf("名称：%s；价格：%5.2f；数量：%d\n", name, price, num);
            }
        } catch (Exception e) {//如果读到底，则会出现异常。这里不要输出打印信息
        }
        dis.close();
    }

}
