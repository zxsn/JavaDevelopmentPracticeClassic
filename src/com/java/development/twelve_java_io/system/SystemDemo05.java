
/**  
* @Title: SystemDemo05.java
* @Package com.java.development.twelve_java_io.system
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月27日
* @version V1.0  
*/

package com.java.development.twelve_java_io.system;

import java.io.InputStream;

/**
    * @ClassName: SystemDemo05
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月27日
    *
    */

public class SystemDemo05 {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        InputStream input = System.in;//指定键盘接收数据
        StringBuffer buf = new StringBuffer();//声明StringBuffer用来接收数据
        System.out.print("请输入内容：");
        int temp = 0;
        while ((temp = input.read()) != -1) {//巡航接收
            char c = (char) temp;//将数据变为字符
            if (c == '\n') {//退出循环，输入回车表示输入完成
                break;
            }
            buf.append(c);//追加数据
        }
        System.out.println("输入的内容为：" + buf);
        input.close();
    }

}
