
/**  
* @Title: StringBufferDemo01.java
* @Package com.java.development.eleven_class_library.stringbuffer
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月18日
* @version V1.0  
*/

package com.java.development.eleven_class_library.stringbuffer;

/**
* @ClassName: StringBufferDemo01
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月18日
*
*/

public class StringBufferDemo01 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();//声明StringBuffer对象
        buf.append("Hello ");
        buf.append("World").append("!!!");
        buf.append("\n");
        buf.append("数字 = ").append(1).append("\n");
        buf.append("字符 = ").append('C').append("\n");
        buf.append("布尔 = ").append(true);
        System.out.println(buf);

    }

}
