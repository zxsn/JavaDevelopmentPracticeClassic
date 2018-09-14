/** 
 * projectName:Java开发实战经典 
 * fileName:Ex05.java 
 * packageName:com.java.development.five.exercises 
 * date:2018年9月19日下午5:56:26 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.exercises;

/**   
 * @title: Ex05.java 
 * @package com.java.development.five.exercises 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月19日 下午5:56:26 
 * @version: V1.0   
*/
class User {
    private String userName;
    private String password;
    private int    numOfUser;

    public User() {
        super();
    }

    public User(String userName) {
        super();
        this.userName = userName;
    }

    public User(String userName, String password) {
        super();
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNumOfUser() {
        return numOfUser;
    }

    public void setNumOfUser(int numOfUser) {
        this.numOfUser = numOfUser;
    }

    /**
     *@title print 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月19日 下午6:03:07
     *@throws 
     */
    public void print() {
        System.out.println(this.getUserName() + "的密码为" + this.getPassword());

    }
}

public class Ex05 {

    /**
     *@title main 
     *@description: TODO设计一个表示拥护的User类，类中的变量有用户名、口令、记录用户个数的变量，
     *定义类的三个构造方法（无参、为用户名赋值、为用户名和口令赋值）、获取和设置口令的方法和返回类信息的方法。
     *@author: zxsn
     *@date: 2018年9月19日 下午5:56:26
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        User user = null;
        user = new User("张三");
        user.setPassword("java");
        user.print();

        User user1 = new User("李四", "eclipse");
        user1.print();

    }

}
