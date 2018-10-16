
/**  
* @Title: SerDemo02.java
* @Package com.java.development.twelve_java_io.serializable
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月29日
* @version V1.0  
*/

package com.java.development.twelve_java_io.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
    * @ClassName: SerDemo02
    * @Description:从文件中将Person对象反序列化（读取）
    * @author Administrator
    * @date 2018年10月29日
    *
    */

public class SerDemo02 {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        File f = new File("d:" + File.separator + "test.txt");
        ObjectInputStream ois = null;
        InputStream out = new FileInputStream(f);//文件输入流
        ois = new ObjectInputStream(out);//为对象输入流实例化
        Object obj = ois.readObject();//读取对象
        System.out.println(obj);
        ois.close();

    }

}
