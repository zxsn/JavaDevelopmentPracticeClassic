
/**  
* @Title: Ex01.java
* @Package com.java.book.nine.exercises
* @Description: 设计4个线程对象，两个线程执行减操作，两个线程执行加操作。
* @author houdo
* @date 2018年10月4日
* @version V1.0  
*/

package com.java.development.nine.exercises;

/**
* @ClassName: Ex01
* @Description: TODO(这里用一句话描述这个类的作用)
* @author houdo
* @date 2018年10月4日
*
*/

public class Ex01 {
    private int count;//计数器

    class AddThread extends Thread {//递增线程类

        AddThread(String name) {
            super(name);
        }

        /* (非 Javadoc)
        * 
        * 
        * @see java.lang.Thread#run()
        */

        @Override
        public void run() {
            //通过for循环，来开始进行计数器的累加
            for (int i = 1; i <= 20; i++) {
                synchronized ("") {//这里用""比this效果好，用this会出现count没有增加的情况
                    //拦截非法的计数器的值（count>19）
                    if (count > 19) {
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + "：" + (++count));
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class SubtractThread extends Thread {//递减线程类

        /**
         * 创建一个新的实例 SubtractThread.
         *
         * @param name
         */

        public SubtractThread(String name) {
            super(name);
        }

        /* (非 Javadoc)
        * 
        * 
        * @see java.lang.Thread#run()
        */

        @Override
        public void run() {
            //通过for循环，来开始进行计数器的递减
            for (int i = 1; i <= 20; i++) {
                synchronized ("") {
                    //拦截非法的计数器的值（count<=0）
                    if (count <= 0) {
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + "：" + (count--));
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        //思路：
        //a)外部类的对象
        Ex01 outer = new Ex01();
        //b)根据a)步构建4个线程内部来实例
        //i)两个递增线程实例

        //ii)两个递减线程实例
        AddThread add1 = outer.new AddThread("递增线程1");
        AddThread add2 = outer.new AddThread("递增线程2");
        SubtractThread sub1 = outer.new SubtractThread("递减线程1");
        SubtractThread sub2 = outer.new SubtractThread("递减线程2");
        //c)交替执行
        add1.start();
        add2.start();

        outer.waitNowThreadDead(add1);
        outer.waitNowThreadDead(add2);
        System.out.println();
        //下面两个递减线程执行的时机是：上面两个递增线程齐心协力将临界资源从1~20
        sub1.start();
        sub2.start();
    }

    /**
    * @Title: waitNowThreadDead
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param @param add1    参数
    * @return void    返回类型
    * @throws
    */

    private void waitNowThreadDead(Thread nowThread) {
        while (true) {
            if (!nowThread.isAlive()) {
                break;
            }
        }

    }

}
