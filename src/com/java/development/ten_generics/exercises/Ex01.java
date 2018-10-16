
/**  
* @Title: Ex01.java
* @Package com.java.development.ten_generics.exercises
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月18日
* @version V1.0  
*/

package com.java.development.ten_generics.exercises;

class Data<T> {//数据类
    private T info;

    public Data(T info) {
        this.setInfo(info);
    }

    /**
    * @return info
    */

    public T getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */

    public void setInfo(T info) {
        this.info = info;
    }

}

class Operation {//操作类
    private Data<?>[] datas;//定义数组
    private int       foot; //定义数组下标

    public Operation(int len) {//通过构造函数创建数组
        if (len > 0) {
            this.datas = new Data[len];
        } else
            this.datas = new Data[1];
    }

    public void add(Data<?> data) {//添加数据
        if (this.foot < this.datas.length) {
            this.datas[this.foot] = data;
            this.foot++;
        } else {
            System.out.println("数组已满！");
        }
    }

    public boolean search(Object o) {//查询
        int i = -1;//表示数组下标
        boolean flag = false;//标记位，没有这个标记位只能查询到一个元素
        for (Data<?> data : this.datas) {
            i++;
            if (data.getInfo().getClass() == o.getClass()
                && o.toString().equals(data.getInfo().toString())) {
                System.out.print("\tdata[" + i + "]");
                flag = true;
            }
        }
        return flag;
    }

    public void print() {
        int i = 0;
        for (Data<?> data : this.datas) {
            System.out.println("data[" + (i++) + "]=" + data.getInfo().toString() + "\t数据所属类："
                               + data.getInfo().getClass().toString().split(" ")[1]);
        }
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    /* (非 Javadoc)
    * 
    * 
    * @return
    * @see java.lang.Object#toString()
    */

    @Override
    public String toString() {
        return name;
    }

}

/**
* @ClassName: Ex01
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月18日
*
*/

public class Ex01 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Operation op = new Operation(6);
        op.add(new Data<Integer>(10));
        op.add(new Data<Float>(12.0f));
        op.add(new Data<String>("贾利鑫"));
        op.add(new Data<Integer>(10));
        op.add(new Data<Double>(12.0));
        op.add(new Data<Person>(new Person("贾利鑫")));
        op.print();
        System.out.println(op.search(10) ? "\t存在" : "不存在");//查询Integer类
        System.out.println(op.search(12.0) ? "\t存在" : "不存在");//查询Double类
        System.out.println(op.search(12.0f) ? "\t存在" : "不存在");//查询Float类
        System.out.println(op.search("贾利鑫") ? "\t存在" : "不存在");//查询String类
        Person p = new Person("李四");
        System.out.println(op.search(p) ? "存在" : "不存在");//查询Person类
    }

}
