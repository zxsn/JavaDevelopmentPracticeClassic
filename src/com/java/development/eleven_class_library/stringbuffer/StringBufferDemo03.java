
/**  
* @Title: StringBufferDemo03.java
* @Package com.java.development.eleven_class_library.stringbuffer
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月18日
* @version V1.0  
*/

package com.java.development.eleven_class_library.stringbuffer;

/**
* @ClassName: StringBufferDemo03
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月18日
*
*/

public class StringBufferDemo03 {

    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        buf.append("World!!");
        buf.insert(0, "Hello ");
        System.out.println(buf);
        buf.insert(buf.length(), "MLDN ~");
        System.out.println(buf);
    }

}
