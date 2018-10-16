
/**  
* @Title: RuntimeDemo01.java
* @Package com.java.development.eleven_class_library.runtime
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月18日
* @version V1.0  
*/

package com.java.development.eleven_class_library.runtime;

/**
* @ClassName: RuntimeDemo01
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月18日
*
*/

public class RuntimeDemo01 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();//通过Runtime类的静态方法为其进行实例化操作
        System.out.println("JVM最大内存量：" + run.maxMemory());
        System.out.println("JVM空闲内存量：" + run.freeMemory());
        String str = "Hello" + "World" + "!!!" + "\t" + "Welcome" + "To" + "MLDN" + "~";
        System.out.println(str);
        for (int i = 0; i < 1000; i++) {//循环修改String,产生多个垃圾，会占用内存
            str += i;
        }
        System.out.println("操作String之后的，JVM空闲内存量：" + run.freeMemory());
        run.gc();//进行垃圾收集，释放空间
        System.out.println("垃圾回收之后的，JVM 空闲内存量：" + run.freeMemory());

    }

}
