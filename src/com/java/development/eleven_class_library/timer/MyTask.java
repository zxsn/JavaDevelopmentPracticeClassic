
/**  
* @Title: MyTask.java
* @Package com.java.development.eleven_class_library.timer
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月23日
* @version V1.0  
*/

package com.java.development.eleven_class_library.timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
    * @ClassName: MyTask
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月23日
    *
    */

public class MyTask extends TimerTask {

    /* (非 Javadoc)
    * 
    * 
    * @see java.util.TimerTask#run()
    */

    @Override
    public void run() {
        SimpleDateFormat sdf = null;
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println("执行安排时间为：" + sdf.format(this.scheduledExecutionTime()));
        System.out.println("当前系统时间为：" + sdf.format(new Date()));
        long temp = this.scheduledExecutionTime();
        if (temp % 5 == 0) {
            this.cancel();
        }
    }

}
