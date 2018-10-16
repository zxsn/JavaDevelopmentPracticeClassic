
/**  
* @Title: SystemDemo02.java
* @Package com.java.development.eleven_class_library.system
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月19日
* @version V1.0  
*/

package com.java.development.eleven_class_library.system;

/**
* @ClassName: SystemDemo02
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月19日
*
*/

public class SystemDemo03 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        System.out.println("系统版本号为：" + System.getProperty("os.name")
                           + System.getProperty("os.version") + System.getProperty("os.arch"));
        System.out.println("系统用户为：" + System.getProperty("user.name"));
        System.out.println("当前用户目录：" + System.getProperty("user.home"));
        System.out.println("当前用户工作目录：" + System.getProperty("user.dir"));

    }

}
