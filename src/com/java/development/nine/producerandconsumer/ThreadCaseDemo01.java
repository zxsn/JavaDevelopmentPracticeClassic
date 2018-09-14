
/**  
* @Title: ThreadCaseDemo01.java
* @Package com.java.development.nine.producerandconsumer
* @Description: TODO(用一句话描述该文件做什么)
* @author houdo
* @date 2018年10月3日
* @version V1.0  
*/

package com.java.development.nine.producerandconsumer;

class Info { //定义信息类
    private String name    = "李兴华";    //信息内容，指定默认值
    private String content = "Java 讲师";//信息内容，指定默认值

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
                this.info.setName("李兴华");//设置信息名称
                try {
                    Thread.sleep(90);
                } catch (InterruptedException e) {
                    // TODO 自动生成的 catch 块
                    e.printStackTrace();
                }
                this.info.setContent("Java讲师");//设置信息内容
                flag = false;
            } else {
                this.info.setName("mldn");//设置信息名称
                try {
                    Thread.sleep(90);
                } catch (InterruptedException e) {
                    // TODO 自动生成的 catch 块
                    e.printStackTrace();
                }
                this.info.setContent("www.mldnjava.cn");//设置信息内容
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
            System.out.println(this.info.getName() + "-->" + this.info.getContent());//取出信息
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

public class ThreadCaseDemo01 {

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
