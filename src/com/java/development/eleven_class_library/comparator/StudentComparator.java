
/**  
* @Title: StudentComparator.java
* @Package com.java.development.eleven_class_library.comparator
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月21日
* @version V1.0  
*/

package com.java.development.eleven_class_library.comparator;

import java.util.Comparator;

/**
* @ClassName: StudentComparator
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月21日
*
*/

public final class StudentComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        /*if (s1.equals(s2)) {//如果相等，则返回0
            return 0;
        } else if (s1.getAge() < s2.getAge()) {//按年龄比较
            return 1;
        } else {
            return -1;
        }*/
        if (s1.getScore() > s2.getScore()) {//成绩由高到低
            return -1;
        } else if (s1.getScore() < s2.getScore()) {
            return 1;
        } else {
            if (s1.getAge() > s2.getAge()) {//年龄由低到高 
                return 1;
            } else if (s1.getAge() < s2.getAge()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

}
