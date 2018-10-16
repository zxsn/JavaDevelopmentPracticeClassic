
/**  
* @Title: ComparableDemo02.java
* @Package com.java.development.eleven_class_library.comparable
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月20日
* @version V1.0  
*/

package com.java.development.eleven_class_library.comparable;

/**
* @ClassName: ComparableDemo02
* @Description:Integer为Comparable接口实例化
* @author Administrator
* @date 2018年10月20日
*
*/

public class ComparableDemo02 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        Comparable com = null;//声明一个Comparable接口对象
        com = 30;//通过Integer类为Comparable实例化
        System.out.println("内容：" + com);//实际上调用的是toString()方法

    }

}
