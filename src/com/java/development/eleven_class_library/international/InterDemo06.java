
/**  
* @Title: InterDemo06.java
* @Package com.java.development.eleven_class_library.international
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月19日
* @version V1.0  
*/

package com.java.development.eleven_class_library.international;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
    * @ClassName: InterDemo06
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月19日
    *
    */

public class InterDemo06 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Locale zhLoc = new Locale("zh", "CN");
        //涨到中文的属性文件
        ResourceBundle zhrb = ResourceBundle
            .getBundle("com.java.development.eleven_class_library.international.Message", zhLoc);
        String str1 = zhrb.getString("info");
        System.out.println("内容：" + MessageFormat.format(str1, "贾利鑫"));
    }

}
