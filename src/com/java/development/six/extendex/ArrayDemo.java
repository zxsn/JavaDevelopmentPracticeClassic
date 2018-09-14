/** 
 * projectName:Java开发实战经典 
 * fileName:ArrayDemo.java 
 * packageName:com.java.development.six.extendex 
 * date:2018年9月21日下午2:33:32 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.extendex;

/**   
 * @title: ArrayDemo.java 
 * @package com.java.development.six.extendex 
 * @description: TODO定义一个整型数组类，要求包含构造方法，增加数据及输出数据成员方法，并利用数组实现动态内存分配。
 * 在此基础上定义出以下子类：
 * （1）排序类---实现排序
 * （2）反转类---实现数据方向存放
 * @author: zxsn
 * @date: 2018年9月21日 下午2:33:32 
 * @version: V1.0   
*/

public class ArrayDemo {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月21日 下午2:33:32
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        SortArray a = null;
        a = new SortArray(5);
        System.out.println(a.add(23));
        System.out.println(a.add(21));
        System.out.println(a.add(2));
        System.out.println(a.add(42));
        System.out.println(a.add(5));
        System.out.println(a.add(6));
        print(a.getArray());

        ReverseArray b = null;
        b = new ReverseArray(5);
        System.out.println(b.add(23));
        System.out.println(b.add(21));
        System.out.println(b.add(2));
        System.out.println(b.add(42));
        System.out.println(b.add(5));
        System.out.println(b.add(6));
        print(b.getArray());

    }

    public static void print(int i[]) {
        for (int j = 0; j < i.length; j++) {
            System.out.print(i[j] + "、");
        }
    }
}
