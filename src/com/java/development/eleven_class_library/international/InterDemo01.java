
/**  
* @Title: InterDemo01.java
* @Package com.java.development.eleven_class_library.international
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月18日
* @version V1.0  
*/

package com.java.development.eleven_class_library.international;

import java.util.ResourceBundle;

/**
    * @ClassName: InterDemo01
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月18日
    *
    */

public class InterDemo01 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("Message");//此处必须在src下新建Message.properties文件。
        System.out.println("内容：" + rb.getString("info"));

    }

}
