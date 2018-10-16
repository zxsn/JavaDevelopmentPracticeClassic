
/**  
* @Title: RuntimeDemo03.java
* @Package com.java.development.eleven_class_library.runtime
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月18日
* @version V1.0  
*/

package com.java.development.eleven_class_library.runtime;

import java.io.IOException;

/**
    * @ClassName: RuntimeDemo03
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月18日
    *
    */

public class RuntimeDemo03 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();//通过Runtime的静态方法为其进行实例化操作
        Process pro = null;//声明一个Process对象，接收启动的进程
        try {
            pro = run.exec("notepad.exe");
        } catch (IOException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        pro.destroy();
    }

}
