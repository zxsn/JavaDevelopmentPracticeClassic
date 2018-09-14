/** 
 * projectName:Java开发实战经典 
 * fileName:WrapperDemo04.java 
 * packageName:com.java.development.six.wrapper 
 * date:2018年9月27日下午3:53:16 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.wrapper;

/**   
 * @title: WrapperDemo04.java 
 * @package com.java.development.six.wrapper 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月27日 下午3:53:16 
 * @version: V1.0   
*/
public class WrapperDemo04 {
    public static void main(String[] args) {
        String str1 = "30";
        String str2 = "30.3";
        int x = Integer.parseInt(str1);//将字符串变成int
        float y = Float.parseFloat(str2);//将字符串变成float
        System.out.println("整数乘方：" + x + "*" + x + "=" + (x * x));
        System.out.println("小数乘方：" + y + "*" + y + "=" + (y * y));
    }
}
