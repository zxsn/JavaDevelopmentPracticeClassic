/** 
 * projectName:Java开发实战经典 
 * fileName:Student.java 
 * packageName:com.java.development.six.absandinf 
 * date:2018年9月21日下午5:58:01 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.absandinf;

/**   
 * @title: Student.java 
 * @package com.java.development.six.absandinf 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月21日 下午5:58:01 
 * @version: V1.0   
*/
public class Student extends Person {
    private float score;

    /**
     * @param score    
     * @title: Student   
     * @description: TODO
     * @param: @param name
     * @param: @param age  
     * @throws   
     */
    public Student(String name, int age, float score) {
        super(name, age);
        this.score = score;
    }

    /**   
     * @title: getContent
     * @description: TODO
     * @return   
     * @see com.java.development.six.absandinf.Person#getContent()     
     */
    @Override
    public String getContent() {
        String content = "学生信息--->姓名：" + super.getName() + "；年龄：" + super.getAge() + "；成绩："
                         + this.score;
        return content;
    }

}
