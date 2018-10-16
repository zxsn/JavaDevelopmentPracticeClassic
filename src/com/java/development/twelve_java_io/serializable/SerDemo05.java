
/**  
* @Title: SerDemo05.java
* @Package com.java.development.twelve_java_io.serializable
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月29日
* @version V1.0  
*/

package com.java.development.twelve_java_io.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
* @ClassName: SerDemo05
* @Description: 序列化多个Person对象
* @author Administrator
* @date 2018年10月29日
*
*/

public class SerDemo05 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        Person per[] = { new Person("张三", 30), new Person("李四", 31), new Person("王五", 32) };

        ser(per);

        Object o[] = dser();
        for (int i = 0; i < o.length; i++) {
            Person p = (Person) o[i];
            System.out.println(p);
        }
    }

    public static void ser(Person[] per) throws Exception {//序列化操作
        File f = new File("d:" + File.separator + "test.txt");
        ObjectOutputStream oos = null;
        OutputStream out = new FileOutputStream(f);//文件输出流
        oos = new ObjectOutputStream(out);//为对象输出流实例化
        oos.writeObject(per);//保存对象数组到文件
        oos.close();
    }

    public static Object[] dser() throws Exception {//反序列化操作
        File f = new File("d:" + File.separator + "test.txt");
        ObjectInputStream ois = null;
        InputStream out = new FileInputStream(f);//文件输入流
        ois = new ObjectInputStream(out);//为对象输入流实例化
        Object obj[] = (Object[]) ois.readObject();//读取对象

        ois.close();
        return obj;
    }

}
