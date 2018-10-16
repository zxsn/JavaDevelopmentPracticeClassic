
/**  
* @Title: TestTask.java
* @Package com.java.development.eleven_class_library.timer
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月23日
* @version V1.0  
*/

package com.java.development.eleven_class_library.timer;

import java.util.Timer;

/**
    * @ClassName: TestTask
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月23日
    *
    */

public class TestTask {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Timer t = new Timer();
        MyTask mytask = new MyTask();//定义任务
        t.schedule(mytask, 1000, 2000);

    }

}
