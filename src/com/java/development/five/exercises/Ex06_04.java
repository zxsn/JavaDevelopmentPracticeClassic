/** 
 * projectName:Java开发实战经典 
 * fileName:Ex06_04.java 
 * packageName:com.java.development.five.exercises 
 * date:2018年9月19日下午9:28:39 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.exercises;

/**   
 * @title: Ex06_04.java 
 * @package com.java.development.five.exercises 
 * @description: TODO清除”Java 技术学习班 20070326” 中所有0。
 * @author: zxsn
 * @date: 2018年9月19日 下午9:28:39 
 * @version: V1.0   
*/
public class Ex06_04 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月19日 下午9:28:39
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        String str = "Java 技术学习班 20070326";
        //方法一
        System.out.println("原字符串为：" + str);
        String newStr = str.replaceAll("0", "");//将字符串中的所有0替换为空即可
        System.out.println("替换0后的字符串为：" + newStr);

        //方法二
        int num = 0;
        char c[] = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '0') {//找到字符数组中0的位置
                int j = i;
                for (; j + 1 < c.length - num; j++) {//将后面的字符都前移
                    c[j] = c[j + 1];
                }
                i--;//前移后有可能还有0，重新查找
                num++;//统计0的个数，使之后可以确定字符数组的长度
            }
        }
        System.out.println("删除0后的字符串为：" + new String(c, 0, c.length - num));
    }

}
