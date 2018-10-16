
/**  
* @Title: StringBufferDemo09.java
* @Package com.java.development.eleven_class_library.stringbuffer
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月18日
* @version V1.0  
*/

package com.java.development.eleven_class_library.stringbuffer;

/**
* @ClassName: StringBufferDemo09
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月18日
*
*/

public class StringBufferDemo09 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        String str = "JiaLiXin";
        for (int i = 0; i < 100; i++) {
            str += i;//不断修改String的内存引用，性能低
        }
        System.out.println(str);
    }

}
