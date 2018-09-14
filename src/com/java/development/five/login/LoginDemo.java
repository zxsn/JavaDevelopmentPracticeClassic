package com.java.development.five.login;

public class LoginDemo { //javac -encoding utf-8 LoginDemo.java
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
