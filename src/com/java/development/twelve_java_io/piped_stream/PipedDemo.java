
/**  
* @Title: PipedDemo.java
* @Package com.java.development.twelve_java_io.piped_stream
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月25日
* @version V1.0  
*/

package com.java.development.twelve_java_io.piped_stream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Send implements Runnable {
    private PipedOutputStream pos = null;//管道输出流

    public Send() {
        pos = new PipedOutputStream();//实例化输出流
    }
    /* (非 Javadoc)
    * 
    * 
    * @see java.lang.Runnable#run()
    */

    @Override
    public void run() {
        String str = "Hello World!!!";
        try {
            this.pos.write(str.getBytes());//输出信息
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            pos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
    * @return pos
    */

    public PipedOutputStream getPos() {
        return pos;
    }

}

class Receive implements Runnable {
    private PipedInputStream pis = null;

    /**
     * 创建一个新的实例 Receive.
     *
     * @param pis
     */

    public Receive() {
        this.pis = new PipedInputStream();//实例化输入流
    }

    /* (非 Javadoc)
    * 
    * 
    * @see java.lang.Runnable#run()
    */

    @Override
    public void run() {
        byte b[] = new byte[1024];
        int len = 0;
        try {
            len = this.pis.read(b);//接收数据
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            pis.close();
        } catch (IOException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        System.out.println("接收到的内容为：" + new String(b, 0, len));
    }

    /**
    * @return pis
    */

    public PipedInputStream getPis() {
        return pis;
    }

}

/**
* @ClassName: PipedDemo
* @Description:验证管道流
* @author Administrator
* @date 2018年10月25日
*
*/

public class PipedDemo {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Send s = new Send();
        Receive r = new Receive();
        try {
            s.getPos().connect(r.getPis());//连接管道
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Thread(s).start();//启动线程
        new Thread(r).start();
    }

}
