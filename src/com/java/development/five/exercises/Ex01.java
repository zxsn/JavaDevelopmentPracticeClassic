/** 
 * projectName:Java开发实战经典 
 * fileName:ex01.java 
 * packageName:com.java.development.five.exercises 
 * date:2018年9月17日下午5:46:07 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.exercises;

/**   
 * @title: ex01.java 
 * @package com.java.development.five.exercises 
 * @description: TODO编写一个代表地址的Address类，地址信息由国家，省份，城市，街道，邮编组成，并且可以返回完整的地址信息。
 * @author: zxsn
 * @date: 2018年9月17日 下午5:46:07 
 * @version: V1.0   
*/
class Address {
    private String country;   //国家
    private String province;  //省份
    private String city;      //城市
    private String street;    //街道
    private String postalcode;//邮编

    public Address(String country, String province, String city, String street, String postalcode) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.postalcode = postalcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

}

public class Ex01 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午5:46:07
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Ex01 test = new Ex01();
        Address as = new Address("中国", "北京市", "昌平区", "十三陵镇", "102213");
        test.print(as);
    }

    /**
     *@title print 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 下午6:22:09
     *@throws 
     */
    private void print(Address address) {
        System.out.println("地址信息如下：");
        System.out.println("国家：" + address.getCountry() + "\n省份：" + address.getProvince() + "\n城市："
                           + address.getCity() + "\n街道：" + address.getStreet() + "\n邮编："
                           + address.getPostalcode());

    }

}
