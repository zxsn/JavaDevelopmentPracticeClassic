/** 
 * projectName:Java开发实战经典 
 * fileName:Dog.java 
 * packageName:com.java.development.six.absandinf 
 * date:2018年9月27日上午11:35:30 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.seven.exercises;

/**   
 * @title: Dog.java 
 * @package com.java.development.six.absandinf 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月27日 上午11:35:30 
 * @version: V1.0   
*/
public class Dog implements Pet {
    private String name;
    private String color;
    private int    age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
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
            throw new PetException("狗必须有名字！");
        }
    }

    public void setColor(String color) throws PetException {
        if (color != null && color != "") {
            this.color = color;
        } else {
            throw new PetException("狗的颜色不能为空！");
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
