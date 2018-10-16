
/**  
* @Title: Introduction.java
* @Package com.java.development.ten_generics.example
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月18日
* @version V1.0  
*/

package com.java.development.ten_generics.example;

/**
* @ClassName: Introduction
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月18日
*
*/

public class Introduction implements Info {
    private String name;
    private String sex;
    private int    age;

    /**
     * 创建一个新的实例 Introduction.
     *
     * @param name
     * @param sex
     * @param age
     */

    public Introduction(String name, String sex, int age) {
        this.setName(name);
        this.setSex(sex);
        this.setAge(age);
    }

    /**
    * @return name
    */

    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
    * @return sex
    */

    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */

    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
    * @return age
    */

    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */

    public void setAge(int age) {
        this.age = age;
    }

    
        /* (非 Javadoc)
        * 
        * 
        * @return
        * @see java.lang.Object#toString()
        */
        
    @Override
    public String toString() {
        return "基本信息：" +"\n"+
                "\t|-姓名："+this.name+"\n"+
                "\t|-性别："+this.sex+"\n"+
                "\t|-年龄："+this.age;//返回对象的信息
    }

}
