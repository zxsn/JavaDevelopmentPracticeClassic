
/**  
* @Title: Variableparameters.java
* @Package com.java.development.first
* @Description: TODO(用一句话描述该文件做什么)
* @author houdo
* @date 2018年9月11日
* @version V1.0  
*/

package com.java.development.first;

/**
* @ClassName: Variableparameters
* @Description: TODO(这里用一句话描述这个类的作用)
* @author houdo
* @date 2018年9月11日
*
*/

public class Variableparameters {

    /**
        * @Title: main
        * @Description: TODO(可变长参数的测试)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("不传递参数（fun()）:");
        fun();
        System.out.print("\n传递参数（fun()）:");
        fun(1, 2, 3, 4);
    }

    /**
    * @Title: fun
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param     参数
    * @return void    返回类型
    * @throws
    */

    private static void fun(int... arg) {
        //Syntax error, varargs are only available if source level is 1.5 or greater
        for (int i = 0; i < arg.length; i++) {
            if (arg.length - 1 != i)
                System.out.print(arg[i] + "、");
            else
                System.out.println(arg[i]);
        }

    }

}
