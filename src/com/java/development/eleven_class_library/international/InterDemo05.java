
/**  
* @Title: InterDemo05.java
* @Package com.java.development.eleven_class_library.international
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月19日
* @version V1.0  
*/

package com.java.development.eleven_class_library.international;

/**
* @ClassName: InterDemo05
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月19日
*
*/

public class InterDemo05 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        System.out.print("第一次运行：");
        Object[] arg1 = { "JLX", "Jia", "贾利鑫" };//对象数组，保存所有具体内容
        fun(arg1);//传入3个参数
        System.out.print("\n第二次运行：");
        Object[] arg2 = { "MLDN" };
        fun(arg2);//传入1个参数
        System.out.print("\n第三次运行：");
        Object[] arg3 = {};
        fun(arg3);//没有参数传入
    }

    /**
    * @Title: fun
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @return void    返回类型
    * @throws
    */

    private static void fun(Object... args) {//可以输入任意多个参数，使用数组表示
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + "、");

        }

    }

}
