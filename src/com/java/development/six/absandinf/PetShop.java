/** 
 * projectName:Java开发实战经典 
 * fileName:PetShop.java 
 * packageName:com.java.development.six.absandinf 
 * date:2018年9月27日上午11:43:56 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.absandinf;

/**   
 * @title: PetShop.java 
 * @package com.java.development.six.absandinf 
 * @description: 宠物商店
 * @author: zxsn
 * @date: 2018年9月27日 上午11:43:56 
 * @version: V1.0   
*/
public class PetShop {
    private Pet[] pets; //宠物数组
    private int   foot; //数组下标

    public PetShop(int len) { //构造方法开辟宠物数组的空间
        if (len > 0) {
            this.pets = new Pet[len];
        } else {
            this.pets = new Pet[1];
        }
    }

    /**
     *@title add 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月27日 上午11:46:59
     *@throws 
     */
    public boolean add(Pet pet) { //增加宠物
        if (this.foot < this.pets.length) {
            this.pets[this.foot] = pet;
            this.foot++;
            return true;
        } else {
            return false;
        }

    }

    public Pet[] search(String keyWord) {
        Pet p[] = null;
        int count = 0;
        //确认开辟的空间大小，看有多少个宠物符合查询条件
        for (int i = 0; i < this.pets.length; i++) {
            if (this.pets[i] != null) {
                if (this.pets[i].getName().indexOf(keyWord) != -1
                    || this.pets[i].getColor().indexOf(keyWord) != -1) {
                    count++;
                }
            }

        }
        p = new Pet[count];
        int f = 0; //数组下标
        //保存查询到的数组信息
        for (int i = 0; i < this.pets.length; i++) {
            if (this.pets[i] != null) {
                if (this.pets[i].getName().indexOf(keyWord) != -1
                    || this.pets[i].getColor().indexOf(keyWord) != -1) {
                    p[f] = this.pets[i];
                    f++;
                }
            }

        }
        return p;
    }

}
