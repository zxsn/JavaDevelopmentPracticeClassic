/** 
 * projectName:Java开发实战经典 
 * fileName:Array.java 
 * packageName:com.java.development.six.extendex 
 * date:2018年9月21日下午2:33:55 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.extendex;

/**   
 * @title: Array.java 
 * @package com.java.development.six.extendex 
 * @description: TODO数组类
 * @author: zxsn
 * @date: 2018年9月21日 下午2:33:55 
 * @version: V1.0   
*/
public class Array {
    private int temp[]; //整型数组
    private int foot;   //数组下标

    public Array(int len) {//创建数组
        if (len > 0) {
            this.temp = new int[len];
        } else {
            this.temp = new int[1];
        }
    }

    public String add(int i) {//添加数组
        if (this.foot < this.temp.length) {
            this.temp[foot] = i;
            foot++;
            return "添加成功";
        }
        return "添加失败";

    }

    public int[] getArray() {//得到全部数组
        return this.temp;
    }
}
