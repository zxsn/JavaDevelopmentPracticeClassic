
/**  
* @Title: Menu.java
* @Package com.java.development.twelve_java_io.bufferedreader
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月27日
* @version V1.0  
*/

package com.java.development.twelve_java_io.bufferedreader;

import com.java.development.twelve_java_io.bufferedreader.ExecDemo03.InputData;

/**
* @ClassName: Menu
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月27日
*
*/

public class Menu {
    public Menu() {
        while (true) {
            this.show();//无限制调用菜单的显示
        }
    }

    /**
    * @Title: show
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param     参数
    * @return void    返回类型
    * @throws
    */

    public void show() {
        System.out.println("====xxx系统====");
        System.out.println("[1]、增加操作");
        System.out.println("[2]、删除操作");
        System.out.println("[3]、修改操作");
        System.out.println("[4]、查看操作");
        System.out.println("[0]、系统退出\n");
        ExecDemo03 ed = new ExecDemo03();
        InputData input = ed.new InputData();//还是使用之前的输入数据程序
        int i = input.getInt("请选择：", "请输入正确的选项！");
        switch (i) {
            case 1: {
                Operate.add();//调用操作类的增加操作
                break;
            }
            case 2: {
                Operate.delete();//调用操作类的删除操作
                break;
            }
            case 3: {
                Operate.update();//调用操作类的更新操作
                break;
            }
            case 4: {
                Operate.find();//调用操作类的查找操作
                break;
            }
            case 0: {
                System.exit(1);//系统退出
                break;
            }
            default: {
                System.out.println("请选择正确的操作！");
            }
        }
    }
}
