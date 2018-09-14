/** 
 * projectName:Java开发实战经典 
 * fileName:BuildingBlocks.java 
 * packageName:com.java.development.five.codeblock 
 * date:2018年9月17日上午10:08:52 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.five.codeblock;

/**   
 * @title: BuildingBlocksDemo.java 
 * @package com.java.development.five.codeblock 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月17日 上午10:08:52 
 * @version: V1.0   
*/
class BuildingBlocks {
    {
        System.out.println("1、构造快。");
    }

    public BuildingBlocks() {
        System.out.println("2、构造方法。");
    }
}

public class BuildingBlocksDemo {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月17日 上午10:08:52
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        new BuildingBlocks();
        new BuildingBlocks();
        new BuildingBlocks();
    }

}
