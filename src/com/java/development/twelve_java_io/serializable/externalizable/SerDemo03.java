
/**  
* @Title: SerDemo03.java
* @Package com.java.development.twelve_java_io.serializable.externalizable
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月29日
* @version V1.0  
*/

package com.java.development.twelve_java_io.serializable.externalizable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.java.development.twelve_java_io.serializable.Person;

/**
* @ClassName: SerDemo03
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月29日
*
*/

public class SerDemo03 {

    /**
     * @throws Exception 
        * @Title: main
        * @Description:序列化和反序列化Person对象
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        ser();
        dser();

    }

    public static void ser() throws Exception {//序列化操作
        File f = new File("d:" + File.separator + "test.txt");
        ObjectOutputStream oos = null;
        OutputStream out = new FileOutputStream(f);//文件输出流
        oos = new ObjectOutputStream(out);//为对象输出流实例化
        oos.writeObject(new Person("贾利鑫", 25));//保存对象到文件
        oos.close();
    }

    public static void dser() throws Exception {//反序列化操作
        File f = new File("d:" + File.separator + "test.txt");
        ObjectInputStream ois = null;
        InputStream out = new FileInputStream(f);//文件输入流
        ois = new ObjectInputStream(out);//为对象输入流实例化
        Object obj = ois.readObject();//读取对象
        System.out.println(obj);
        ois.close();
    }
}
