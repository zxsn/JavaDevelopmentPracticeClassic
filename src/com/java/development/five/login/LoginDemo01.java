/** 
 * projectName:Java开发实战经典 
 * fileName:LoginDemo01.java 
 * packageName:com.java.development.five.login 
 * date:2018年9月17日下午3:01:42 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.login;

/**   
 * @title: LoginDemo01.java 
 * @package com.java.development.five.login 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月17日 下午3:01:42 
 * @version: V1.0   
*/
public class LoginDemo01 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午3:01:42
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("输入的参数不正确，系统退出！");
            System.out.println("格式：java LoginDemo01 用户名 密码");
            System.exit(1);
        }
        String name = args[0];
        String password = args[1];
        if (name.equals("jialixin") && password.equals("java")) {
            System.out.println("欢迎" + name + "光临！");
        } else {
            System.out.println("错误的用户名和密码！");
        }
    }

}
