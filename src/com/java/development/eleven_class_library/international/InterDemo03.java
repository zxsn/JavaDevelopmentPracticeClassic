
/**  
* @Title: InterDemo03.java
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
    * @ClassName: InterDemo03
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月19日
    *
    */

public class InterDemo03 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Locale zhLoc = new Locale("zh", "CN");//表示中国地区
        Locale enLoc = new Locale("en", "US");//表示美国地区
        Locale frLoc = new Locale("fr", "FR");//表示法国地区
        //找到属性文件
        ResourceBundle zhrb = ResourceBundle.getBundle("Message", zhLoc);
        ResourceBundle enrb = ResourceBundle.getBundle("Message", enLoc);
        ResourceBundle frrb = ResourceBundle.getBundle("Message", frLoc);
        //依次读取各个属性文件的内容，通过键值读取，此时的键值名称为"Info"
        String str1 = zhrb.getString("info");
        String str2 = enrb.getString("info");
        String str3 = frrb.getString("info");
        //使用MessageFormat格式化动态文本
        System.out.println("中文：" + MessageFormat.format(str1, "贾利鑫"));
        System.out.println("英文：" + MessageFormat.format(str2, "JiaLiXin"));
        System.out.println("法文：" + MessageFormat.format(str3, "JiaLiXin"));

    }

}
