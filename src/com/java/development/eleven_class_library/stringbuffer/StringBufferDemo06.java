
/**  
* @Title: StringBufferDemo06.java
* @Package com.java.development.eleven_class_library.stringbuffer
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月18日
* @version V1.0  
*/

package com.java.development.eleven_class_library.stringbuffer;

/**
* @ClassName: StringBufferDemo06
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月18日
*
*/

public class StringBufferDemo06 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        buf.append("Hello ").append("World!!");
        buf.replace(6, 11, "JiaLiXin");//World替换为JiaLiXin
        String str = buf.substring(6, 15);//指定截取范围，并将内容转换为String类型
        System.out.println("截取之后的内容：" + str);

    }

}
