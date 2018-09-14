/** 
 * projectName:Java开发实战经典 
 * fileName:PetShopDemo.java 
 * packageName:com.java.development.six.absandinf 
 * date:2018年9月27日下午12:04:36 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.seven.exercises;

/**   
 * @title: PetShopDemo.java 
 * @package com.java.development.six.absandinf 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月27日 下午12:04:36 
 * @version: V1.0   
*/
public class PetShopDemo {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月27日 下午12:04:36
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        PetShop ps = new PetShop(5);
        try {
            ps.add(new Cat("白猫", "白色的", 2));
            ps.add(new Cat("黑猫", "黑色的", 3));
            ps.add(new Cat("花猫", "花色的", 3));
            ps.add(new Dog("拉布拉多", "黄色的", 3));
            ps.add(new Dog("金毛", "金色的", 3));
            ps.add(new Dog("黑狗", "黑色的", 3));//增加宠物失败
            print(ps.search("黑"));
        } catch (PetException e) {
            e.printStackTrace();
        }

    }

    /**
     *@title print 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月27日 下午12:09:00
     *@param search
     *@throws 
     */
    private static void print(Pet p[]) {
        for (int i = 0; i < p.length; i++) {
            if (p[i] != null) {
                System.out.println(p[i].getName() + "，" + p[i].getColor() + "，" + p[i].getAge());
            }

        }

    }

}
