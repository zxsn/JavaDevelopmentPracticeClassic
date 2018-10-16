
/**  
* @Title: Message_zh_CN.java
* @Package com.java.development.eleven_class_library.international
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月19日
* @version V1.0  
*/

package com.java.development.eleven_class_library.international;

import java.util.ListResourceBundle;

/**
    * @ClassName: Message_zh_CN
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月19日
    *
    */

public class Message_zh_CN extends ListResourceBundle {

    private final Object data[][] = { { "info", "你好，{0}！" } };

    /* (非 Javadoc)
    * 
    * 
    * @return
    * @see java.util.ListResourceBundle#getContents()
    */

    @Override
    protected Object[][] getContents() {//覆写方法
        // TODO 自动生成的方法存根
        return data;
    }

}
