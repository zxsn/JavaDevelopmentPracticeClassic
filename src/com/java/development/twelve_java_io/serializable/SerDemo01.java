
/**  
* @Title: SerDemo01.java
* @Package com.java.development.twelve_java_io.serializable
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月29日
* @version V1.0  
*/

package com.java.development.twelve_java_io.serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
* @ClassName: SerDemo01
* @Description:将Person类的对象保存再文件之中
* @author Administrator
* @date 2018年10月29日
*
*/

public class SerDemo01 {

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
        ObjectOutputStream oos = null;
        OutputStream out = new FileOutputStream(f);//文件输出流
        oos = new ObjectOutputStream(out);//为对象输出流实例化
        oos.writeObject(new Person("贾利鑫", 25));//保存对象到文件
        oos.close();
    }

}
