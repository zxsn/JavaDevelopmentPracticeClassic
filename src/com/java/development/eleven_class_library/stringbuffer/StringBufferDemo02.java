
/**  
* @Title: StringBufferDemo02.java
* @Package com.java.development.eleven_class_library.stringbuffer
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月18日
* @version V1.0  
*/

package com.java.development.eleven_class_library.stringbuffer;

/**
* @ClassName: StringBufferDemo02
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月18日
*
*/

public class StringBufferDemo02 {

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
        fun(buf);
        System.out.println(buf);

    }

    /**
    * @Title: fun
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param @param buf    参数
    * @return void    返回类型
    * @throws
    */

    public static void fun(StringBuffer s) {
        s.append("MLDN ").append("LiXingHua");

    }

}
