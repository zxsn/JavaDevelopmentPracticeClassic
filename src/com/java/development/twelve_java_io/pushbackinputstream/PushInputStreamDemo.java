
/**  
* @Title: PushInputStreamDemo.java
* @Package com.java.development.twelve_java_io.pushinputstream
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月28日
* @version V1.0  
*/

package com.java.development.twelve_java_io.pushbackinputstream;

import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;

/**
    * @ClassName: PushInputStreamDemo
    * @Description:操作回退流
    * @author Administrator
    * @date 2018年10月28日
    *
    */

public class PushInputStreamDemo {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        String str = "www.mldnjava.cn";
        PushbackInputStream push = null;//定义回退流对象
        ByteArrayInputStream bai = null;//定义内存输入流
        bai = new ByteArrayInputStream(str.getBytes());//实例化内存输入流
        push = new PushbackInputStream(bai);//实例化回退流duix
        System.out.print("读取之后的数据为：");
        int temp = 0;
        while ((temp = push.read()) != -1) {
            if (temp == '.') {
                push.unread(temp);//回退到缓存区前面
                temp = push.read();//空出此数据
                System.out.print("退回（" + (char) temp + "）");
            } else {
                System.out.print((char) temp);
            }
        }
    }

}
