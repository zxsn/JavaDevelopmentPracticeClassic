/** 
 * projectName:Java开发实战经典 
 * fileName:Cat.java 
 * packageName:com.java.development.six.absandinf 
 * date:2018年9月27日上午11:39:57 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.seven.exercises;

/**   
 * @title: Cat.java 
 * @package com.java.development.six.absandinf 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月27日 上午11:39:57 
 * @version: V1.0   
*/
public class Cat implements Pet {
    private String name;
    private String color;
    private int    age;

    /**
     * @throws PetException    
     * @title: Cat   
     * @description: TODO
     * @param:   
     * @throws   
     */
    public Cat(String name, String color, int age) throws PetException {
        this.setName(name);
        this.setColor(color);
        this.setAge(age);
    }

    /**   
     * @title: getName
     * @description: TODO
     * @return   
     * @see com.java.development.six.absandinf.Pet#getName()     
     */
    @Override
    public String getName() {
        // TODO 自动生成的方法存根
        return this.name;
    }

    /**   
     * @title: getColor
     * @description: TODO
     * @return   
     * @see com.java.development.six.absandinf.Pet#getColor()     
     */
    @Override
    public String getColor() {
        // TODO 自动生成的方法存根
        return this.color;
    }

    /**   
     * @title: getAge
     * @description: TODO
     * @return   
     * @see com.java.development.six.absandinf.Pet#getAge()     
     */
    @Override
    public int getAge() {
        // TODO 自动生成的方法存根
        return this.age;
    }

    public void setName(String name) throws PetException {
        if (name != null && name != "") {
            this.name = name;
        } else {
            throw new PetException("猫必须有名字！");
        }
    }

    public void setColor(String color) throws PetException {
        if (color != null && color != "") {
            this.color = color;
        } else {
            throw new PetException("猫的颜色不能为空！");
        }
    }

    public void setAge(int age) throws PetException {
        if (age > 0) {
            this.age = age;
        } else {
            throw new PetException("猫的年龄设置错误！");
        }
    }

}
