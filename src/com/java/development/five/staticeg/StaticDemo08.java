/** 
 * projectName:Java开发实战经典 
 * fileName:StaticDemo08.java 
 * packageName:com.java.development.five.staticeg 
 * date:2018年9月14日下午12:12:49 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.staticeg;

/**   
 * @title: StaticDemo08.java 
 * @package com.java.development.five.staticeg 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月14日 下午12:12:49 
 * @version: V1.0   
*/
public class StaticDemo08 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月14日 下午12:12:49
     *@param args
     *@throws 
     */
    public static void main(String[] args) { //此程序只能在终端运行
        if (args.length != 3) {
            System.exit(1);
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("第" + (i + 1) + "个参数：" + args[i]);

        }

    }

}
