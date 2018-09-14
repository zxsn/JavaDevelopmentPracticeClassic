/** 
 * projectName:Java开发实战经典 
 * fileName:SortArray.java 
 * packageName:com.java.development.six.extendex 
 * date:2018年9月21日下午2:43:49 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.extendex;

/**   
 * @title: SortArray.java 
 * @package com.java.development.six.extendex 
 * @description: TODO排序类
 * @author: zxsn
 * @date: 2018年9月21日 下午2:43:49 
 * @version: V1.0   
*/
public class SortArray extends Array {//排序类

    /**   
     * @title: SortArray   
     * @description: TODO
     * @param: @param len  
     * @throws   
     */
    public SortArray(int len) {
        super(len);
        // TODO 自动生成的构造函数存根
    }

    public int[] getArray() {//覆写getArray()方法
        java.util.Arrays.sort(super.getArray());
        return super.getArray();

    }

}
