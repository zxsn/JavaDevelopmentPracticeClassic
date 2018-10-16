
/**  
* @Title: Operate.java
* @Package com.java.development.twelve_java_io.bufferedreader
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月27日
* @version V1.0  
*/

package com.java.development.twelve_java_io.instance_operation;

import java.io.File;

/**
* @ClassName: Operate
* @Description:操作类
* @author Administrator
* @date 2018年10月27日
*
*/

public class Operate {

    public static void add() {//增加操作
        InputData input = new InputData();//实例化输入数据对象
        FileOperate fo = new FileOperate("d:" + File.separator + "test.txt");
        String name = input.getString("请输入姓名：");
        int age = input.getInt("请输入年龄：", "年龄必须是数字！");
        Person per = new Person(name, age);
        try {
            fo.save(per);//保存对象
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("信息增加成功！");
    }

    public static void delete() {//删除操作
        FileOperate fo = new FileOperate("d:" + File.separator + "test.txt");
        try {
            fo.save(null);//清楚对象
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("信息删除成功！");
    }

    public static void update() {//更新操作
        InputData input = new InputData();//实例化输入数据对象
        FileOperate fo = new FileOperate("d:" + File.separator + "test.txt");
        Person per = null;
        try {
            per = (Person) fo.load();//读取数据
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (per != null) {
            String name = input.getString("请输入新的姓名（原姓名：" + per.getName() + "）：");
            int age = input.getInt("请输入新的年龄（原年龄：" + per.getAge() + "）：", "年龄必须是数字！");

            per = new Person(name, age);//重新实例化对象
            try {
                fo.save(per);//重新保存对象
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("信息更新成功！");
        } else {
            System.out.println("请先添加数据！");
        }
    }

    public static void find() {//查找操作
        FileOperate fo = new FileOperate("d:" + File.separator + "test.txt");
        Person per = null;
        try {
            per = (Person) fo.load();//读取对象
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(per);
    }
}
