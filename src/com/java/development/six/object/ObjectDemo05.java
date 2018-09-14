/** 
 * projectName:Java开发实战经典 
 * fileName:ObjectDemo05.java 
 * packageName:com.java.development.six.object 
 * date:2018年9月27日下午3:41:50 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.object;

/**   
 * @title: ObjectDemo05.java 
 * @package com.java.development.six.object 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月27日 下午3:41:50 
 * @version: V1.0   
*/
public class ObjectDemo05 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月27日 下午3:41:50
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        int temp[] = { 1, 3, 5, 7, 9 };
        Object obj = temp;
        print(obj);
    }

    public static void print(Object o) {
        if (o instanceof int[]) {
            int x[] = (int[]) o;
            for (int i = 0; i < x.length; i++) {
                System.out.print(x[i] + "\t");

            }
        }
    }
}
