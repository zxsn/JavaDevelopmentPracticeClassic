/** 
 * projectName:Java开发实战经典 
 * fileName:LoginDemo02.java 
 * packageName:com.java.development.five.login 
 * date:2018年9月17日下午4:09:30 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.login;

/**   
 * @title: LoginDemo02.java 
 * @package com.java.development.five.login 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月17日 下午4:09:30 
 * @version: V1.0   
*/
class Check {
    /**
     *@title validate 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午4:11:15
     *@throws 
     */
    boolean validate(String name, String password) {
        if (name.equals("jialixin") && password.equals("java")) {
            return true;
        } else
            return false;

    }
}

class Operate {
    private String info[];

    public Operate(String info[]) {
        this.info = info;
    }

    /**
     *@title login 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午4:13:25
     *@return
     *@throws 
     */
    public String login() {
        Check check = new Check();
        this.isExit();
        String name = this.info[0];
        String password = this.info[1];
        String str = null;
        if (check.validate(name, password)) {
            str = "欢迎" + name + "光临！";
        } else {
            str = "错误的用户名和密码！";
        }
        return str;

    }

    /**
     *@title isExit 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午4:15:47
     *@throws 
     */
    private void isExit() {
        if (this.info.length != 2) {
            System.out.println("输入的参数不正确，系统退出！");
            System.out.println("格式：java LoginDemo02 用户名 密码");
            System.exit(1);
        }

    }

}

public class LoginDemo02 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午4:09:30
     *@param args
     *@throws 
     */
    public static void main(String[] args) { //javac -encoding utf-8 LoginDemo02.java
        Operate oper = new Operate(args); //java LoginDemo02 jialixin java
        System.out.println(oper.login());

    }

}
