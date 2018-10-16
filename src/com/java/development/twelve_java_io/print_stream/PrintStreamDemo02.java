
/**  
* @Title: PrintStreamDemo02.java
* @Package com.java.development.twelve_java_io.print_stream
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月27日
* @version V1.0  
*/

package com.java.development.twelve_java_io.print_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
* @ClassName: PrintStreamDemo02
* @Description:格式化输出
* @author Administrator
* @date 2018年10月27日
*
*/

public class PrintStreamDemo02 {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        PrintStream ps = null;
        //此时通过FileOutputStream实例化，意味着所有的输出是向文件之中打印
        ps = new PrintStream(new FileOutputStream(new File("d:" + File.separator + "test.txt")));
        String name = "贾利鑫";
        int age = 25;
        float score = 990.356f;
        char sex = 'F';
        //格式化输出，字符串使用%s、整数使用%d、小数使用%f、字符使用%c
        ps.printf("姓名：%s；年龄：%d；成绩：%.3f；性别：%c", name, age, score, sex);
        ps.close();
    }

}
