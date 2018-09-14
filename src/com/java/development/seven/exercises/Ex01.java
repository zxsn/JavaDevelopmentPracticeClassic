/** 
 * projectName:Java开发实战经典 
 * fileName:Ex01.java 
 * packageName:com.java.development.seven.exercises 
 * date:2018年9月28日下午5:22:40 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.seven.exercises;

/**   
 * @title: Ex01.java 
 * @package com.java.development.seven.exercises 
 * @description: TODO编写应用程序，从命令行输入两个小数参数，求它们的商。
 * 要求程序中捕捉NumberFormatException异常和ArithmeticException异常。
 * @author: zxsn
 * @date: 2018年9月28日 下午5:22:40 
 * @version: V1.0   
*/
public class Ex01 {

    /**
     * @throws Exception 
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月28日 下午5:22:40
     *@param args
     *@throws 
     */
    public static void main(String[] args) throws Exception { // javac -encoding UTF-8 Ex01.java
        System.out.println("----------------计算开始-----------------");
        try {
            String str1 = args[0]; //注意：此处就会产生异常
            String str2 = args[1];
            double a = Double.parseDouble(str1);
            double b = Double.parseDouble(str2);
            if (b == 0) { //此处不能使用系统的异常处理，小数是不会出现异常。
                throw new ArithmeticException();
            }
            double temp = a / b;
            System.out.println("两个小数的商为：" + temp);

        } catch (ArithmeticException ae) {
            System.out.println("除数不能为零！" + ae);
        } catch (ArrayIndexOutOfBoundsException aoe) {
            System.out.println("数组越界异常：" + aoe);
        } catch (NumberFormatException nfe) {
            System.out.println("数字格式化异常：" + nfe);
        } finally {
            System.out.println("----------------计算结束-----------------");
        }

    }

}
