/** 
 * projectName:Java开发实战经典 
 * fileName:Ex08.java 
 * packageName:com.java.development.five.exercises 
 * date:2018年9月20日下午4:52:17 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.exercises;

/**   
 * @title: Ex08.java 
 * @package com.java.development.five.exercises 
 * @description: TODO构造一个银行账户类，类的构成包括如下内容：
1）数据成员用户的账户名称、用户的账户余额（private数据类型）
2）方法包括开户（设置账户名称及余额），利用构造方法完成。
3）查询余额
 * @author: zxsn
 * @date: 2018年9月20日 下午4:52:17 
 * @version: V1.0   
*/
class Bank {
    private String account;
    private float  balance;

    public Bank(String account, float balance) {
        super();
        this.account = account;
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void query(String account) {
        System.out.println(this.account + "的账户余额为：" + this.getBalance());
    }

}

public class Ex08 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月20日 下午4:52:17
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Bank b1 = new Bank("张三", 54321f);
        b1.query("张三");
        Bank b2 = new Bank("李四", 1314f);
        b2.query("李四");

    }

}
