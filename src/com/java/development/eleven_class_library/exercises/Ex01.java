
/**  
* @Title: Ex01.java
* @Package com.java.development.eleven_class_library.exercises
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月24日
* @version V1.0  
*/

package com.java.development.eleven_class_library.exercises;

/**
* @ClassName: Ex01
* @Description:定义一个StringBuffer类对象，然后通过append（）方法想对象中添加26个小写字母，
* 要求每次只添加一次，共添加26次，然后按照逆序的方式输出，并且可以删除前5个字符。
* @author Administrator
* @date 2018年10月24日
*
*/

public class Ex01 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        //依次添加26个小写字母
        for (int i = 0; i < 26; i++) {
            buf.append((char) ('a' + i));//'A'的ASCII值为65，'a'的ASCII值为97
        }
        System.out.println("添加后的字符串为：" + buf);
        System.out.println("逆序输出：" + buf.reverse());
        System.out.println("删除前5个字符为：" + buf.delete(0, 5));
    }

}
