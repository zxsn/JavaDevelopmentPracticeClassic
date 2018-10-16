
/**  
* @Title: GenercisDemo10.java
* @Package com.java.development.ten_generics
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月16日
* @version V1.0  
*/

package com.java.development.ten_generics.security_warning;

/**
* @ClassName: GenercisDemo10
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月16日
*
*/

public class GenercisDemo10 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        Info i = new Info();//警告：Info 是原始类型。应该将对通用类型 Info<T> 的引用参数化
        i.setVar("贾利鑫");//类型安全：方法 setVar（Object）属于原始类型 Info。应该将对通用类型 Info<T> 的引用参数化
        System.out.println("内容：" + i.getVar());
    }

}
