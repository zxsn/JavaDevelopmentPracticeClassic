/** 
 * projectName:Java开发实战经典 
 * fileName:Worker.java 
 * packageName:com.java.development.six.absandinf 
 * date:2018年9月21日下午6:03:25 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.absandinf;

/**   
 * @title: Worker.java 
 * @package com.java.development.six.absandinf 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月21日 下午6:03:25 
 * @version: V1.0   
*/
public class Worker extends Person {
    private float salary;

    /**   
     * @title: Worker   
     * @description: TODO
     * @param: @param name
     * @param: @param age  
     * @throws   
     */
    public Worker(String name, int age, float salary) {
        super(name, age);
        this.salary = salary;
    }

    /**   
     * @title: getContent
     * @description: TODO
     * @return   
     * @see com.java.development.six.absandinf.Person#getContent()     
     */
    @Override
    public String getContent() {
        String content = "工人信息--->姓名：" + super.getName() + "；年龄：" + super.getAge() + "；工资："
                         + this.salary;
        return content;
    }

}
