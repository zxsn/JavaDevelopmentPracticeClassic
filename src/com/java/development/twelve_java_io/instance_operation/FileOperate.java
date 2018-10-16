
/**  
* @Title: FileOperate.java
* @Package com.java.development.twelve_java_io.instance_operation
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月29日
* @version V1.0  
*/

package com.java.development.twelve_java_io.instance_operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
* @ClassName: FileOperate
* @Description: 文件操作类
* @author Administrator
* @date 2018年10月29日
*
*/

public class FileOperate {//此类专门用来保存和读取对象
    private File file = null;//定义一个文件对象

    /**
     * 创建一个新的实例 FileOperate.
     *
     * @param file
     */

    public FileOperate(String pathName) {//通过构造方法传递文件路径
        this.file = new File(pathName);//实例化File类对象
    }

    public boolean save(Object obj) throws Exception {//可以保存对象
        ObjectOutputStream oos = null;//对象输出流
        boolean flag = false;//定义操作标记位
        try {
            oos = new ObjectOutputStream(new FileOutputStream(this.file));//实例化对象输出流
            oos.writeObject(obj);//保存对象
            flag = true;
        } catch (Exception e) {
            throw e;//有异常抛出
        } finally {
            if (oos != null) {//判断对象输出流是否被实例化
                oos.close();//不管是否有异常都关闭
            }
        }
        return flag;

    }

    public Object load() throws Exception {//读取对象
        Object obj = null;//接收保存的对象
        ObjectInputStream ois = null;//声明对象输入流
        try {
            ois = new ObjectInputStream(new FileInputStream(file));//实例化对象输入流
            obj = ois.readObject();//读取对象
            return obj;
        } catch (Exception e) {
            throw e;
        } finally {
            if (ois != null) {//判断对象输入流是否被实例化
                ois.close();
            }
        }

    }
}
