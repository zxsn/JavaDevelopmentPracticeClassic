
/**  
* @Title: TestDemo.java
* @Package com.java.development.twelve_java_io.outputsteam
* @Description: 自动关闭接口验证
* @author Administrator
* @date 2018年10月25日
* @version V1.0  
*/

package com.java.development.twelve_java_io.putsteam;

class Net implements AutoCloseable {

    /* (非 Javadoc)
    * 
    * 
    * @throws Exception
    * @see java.lang.AutoCloseable#close()
    */

    @Override
    public void close() throws Exception {
        System.out.println("****　网络资源自动关闭，释放资源。");

    }

    public void info() throws Exception {//假设有异常抛出
        System.out.println("**** 欢迎访问：www.yootk.com");
    }

}

/**
* @ClassName: TestDemo
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月25日
*
*/

public class TestDemo {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        try (Net n = new Net()) {
            n.info();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
