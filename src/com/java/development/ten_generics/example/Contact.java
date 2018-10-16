
/**  
* @Title: Contact.java
* @Package com.java.development.ten_generics.example
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月18日
* @version V1.0  
*/

package com.java.development.ten_generics.example;

/**
* @ClassName: Contact
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月18日
*
*/

public class Contact implements Info {//实现Info接口
    private String address; //联系地址
    private String telphone;//联系电话
    private String zipcode; //邮编地址

    /**
     * 创建一个新的实例 Contact.
     *
     * @param address
     * @param telphone
     * @param zipcode
     */

    public Contact(String address, String telphone, String zipcode) {
        this.setAddress(address);
        this.setTelphone(telphone);
        this.setZipcode(zipcode);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    
        /* (非 Javadoc)
        * 
        * 
        * @return
        * @see java.lang.Object#toString()
        */
        
    @Override
    public String toString() {
        return "联系方式：" +"\n"+
                "\t|-联系电话："+this.telphone+"\n"+
                "\t|-联系地址："+this.address+"\n"+
                "\t|-联系编码："+this.zipcode;//返回对象的信息
    }

}
