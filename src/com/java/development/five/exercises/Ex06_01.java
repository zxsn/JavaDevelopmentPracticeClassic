/** 
 * projectName:Java开发实战经典 
 * fileName:Ex06_01.java 
 * packageName:com.java.development.five.exercises 
 * date:2018年9月19日下午6:06:57 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.exercises;

/**   
 * @title: Ex06_01.java 
 * @package com.java.development.five.exercises 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月19日 下午6:06:57 
 * @version: V1.0   
*/
class Learn {
    private char   c[];
    private String str2;
    private int    indexOf;//确定日期的起始位置
    private int    j;      //长度

    public Learn(String str) {//将字符串转换成字符数组
        c = str.toCharArray();
    }

    public void search() {
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= '0' && c[i] <= '9') {
                j++;
            } else {
                indexOf++;
            }
        }
        str2 = new String(c, indexOf, j);
        System.out.println("日期为：" + str2);
    }
}

public class Ex06_01 {

    /**
     *@title main 
     *@description: TODO（1）从字符串”Java 技术学习班 20070326” 中提取开班日期。
     *@author: zxsn
     *@date: 2018年9月19日 下午6:06:57
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        //方法一
        String str = "Java技术学习班20070326";
        String newStr = str.replaceAll("\\D", "");//正则表达式
        System.out.println("日期为：" + newStr);
        //方法二
        Learn str1 = null;
        str1 = new Learn("Java技术学习班20070326");
        str1.search();
    }

}
