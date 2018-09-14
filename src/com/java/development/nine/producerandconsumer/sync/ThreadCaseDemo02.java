
/**  
* @Title: ThreadCaseDemo01.java
* @Package com.java.development.nine.producerandconsumer
* @Description: TODO(用一句话描述该文件做什么)
* @author houdo
* @date 2018年10月3日
* @version V1.0  
*/

package com.java.development.nine.producerandconsumer.sync;

class Info { //定义信息类
    private String name    = "李兴华";    //信息内容，指定默认值
    private String content = "Java 讲师";//信息内容，指定默认值

    public synchronized void set(String name, String content) {//通过同步方法解决信息不同步问题
        this.setName(name);//设置信息名称
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        this.setContent(content);//设置信息内容

    }

    public synchronized void get() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        System.out.println(this.getName() + "-->" + this.getContent());//取出信息
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

class Producer implements Runnable { //定义生产者线程
    private Info info = null; //保存Info引用

    public Producer(Info info) { //通过构造方法设置Info属性内容
        this.info = info;
    }

    /* (非 Javadoc)
    * 
    * 
    * @see java.lang.Runnable#run()
    */

    @Override
    public void run() {
        boolean flag = false;//定义标记位
        for (int i = 0; i < 50; i++) {

            if (flag) {//如果为true，则设置第1个信息
                this.info.set("李兴华", "Java讲师");
                flag = false;
            } else {
                this.info.set("mldn", "www.mldnjava.cn");
                flag = true;
            }
        }

    }
}

class Consumer implements Runnable {//定义消费者线程
    private Info info = null;

    public Consumer(Info info) {//通过构造方法设置Info属性内容
        this.info = info;//为info属性初始化
    }

    /* (非 Javadoc)
    * 
    * 
    * @see java.lang.Runnable#run()
    */

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO 自动生成的 catch 块
                e.printStackTrace();
            }
            this.info.get();
        }

    }
}

/**
* @ClassName: ThreadCaseDemo01
* @Description: TODO(这里用一句话描述这个类的作用)
* @author houdo
* @date 2018年10月3日
*
*/

public class ThreadCaseDemo02 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Info i = new Info();//实例化Info对象
        Producer pro = new Producer(i);//实例化生产者，传递Info引用
        Consumer con = new Consumer(i);//实例化消费者，传递Info引用
        new Thread(pro).start();
        new Thread(con).start();

    }

}
