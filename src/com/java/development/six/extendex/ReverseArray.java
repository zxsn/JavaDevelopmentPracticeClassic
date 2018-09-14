/** 
 * projectName:Java开发实战经典 
 * fileName:ReverseArray.java 
 * packageName:com.java.development.six.extendex 
 * date:2018年9月21日下午2:47:21 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.extendex;

/**   
 * @title: ReverseArray.java 
 * @package com.java.development.six.extendex 
 * @description: TODO反转类
 * @author: zxsn
 * @date: 2018年9月21日 下午2:47:21 
 * @version: V1.0   
*/
public class ReverseArray extends Array {//数组反转类

    /**   
     * @title: ReverseArray   
     * @description: TODO
     * @param: @param len  
     * @throws   
     */
    public ReverseArray(int len) {
        super(len);
        // TODO 自动生成的构造函数存根
    }

    public int[] getArray() {
        int center = super.getArray().length / 2;
        int head = 0; //头索引
        int tail = super.getArray().length - 1; //尾索引
        for (int x = 0; x < center; x++) {
            int temp = super.getArray()[head];
            super.getArray()[head] = super.getArray()[tail];
            super.getArray()[tail] = temp;
            head++;
            tail--;
        }
        return super.getArray();

    }

}
