/** 
 * projectName:Java开发实战经典 
 * fileName:Ex03.java 
 * packageName:com.java.development.five.exercises 
 * date:2018年9月17日下午7:12:04 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.exercises;

/**   
 * @title: Ex03.java 
 * @package com.java.development.five.exercises 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月17日 下午7:12:04 
 * @version: V1.0   
*/
public class Ex03 {

    /**
     *@title main 
     *@description: TODO编写程序，统计出字符串“want you to know one thing”中字母n和字母o的出现次数。
     *@author: zxsn
     *@date: 2018年9月17日 下午7:12:04
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        String str = "want you to know one thing";
        char[] c = str.toCharArray();
        int n = 0;
        int o = 0;
        for (int i = 0; i < c.length; i++) {
            if ('n' == c[i]) {
                n++;
            }
            if ('o' == c[i]) {
                o++;
            }
        }

        System.out.println(str + "\n字符串中n的个数为：" + n + "，o的个数为：" + o);

    }

}
