
/**  
* @Title: ComparableDemo03.java
* @Package com.java.development.eleven_class_library.comparable
* @Description: 基于Comparable实现的二叉树操作
* @author Administrator
* @date 2018年10月21日
* @version V1.0  
*/

package com.java.development.eleven_class_library.comparable;

class BinaryTree {
    class Node { //声明一个节点类
        @SuppressWarnings("rawtypes")
        private Comparable data; //保存具体的内容
        private Node       left; //保存左子树
        private Node       right;//保存右子树

        @SuppressWarnings("unchecked")
        public void addNode(Node newNode) {
            //要确定是放在左子树还是右子树
            if (newNode.data.compareTo(this.data) < 0) {
                if (this.left == null) {//放在左子树
                    this.left = newNode;
                } else {
                    this.left.addNode(newNode);
                }
            }
            if (newNode.data.compareTo(this.data) >= 0) {
                if (this.right == null) {//放在右子树
                    this.right = newNode;
                } else {
                    this.right.addNode(newNode);
                }
            }

        }

        public void printNode() {//输出时采用中序遍历
            if (this.left != null) {
                this.left.printNode();//先输出左子树
            }
            System.out.print(this.data + "\t");//再输出根节点
            if (this.right != null) {
                this.right.printNode();//最后输出右子树
            }
        }

    }

    private Node root;//根元素

    @SuppressWarnings("rawtypes")
    public void add(Comparable data) {
        Node newNode = new Node();////每传入一个新的内容就声明一个根节点
        newNode.data = data;
        if (root == null) {
            root = newNode;//如果是第1个元素，设置成根元素
        } else {
            root.addNode(newNode);//确定结点是放在左子树还是右子树
        }
    }

    public void print() {//输出结点
        this.root.printNode();
    }
}

/**
* @ClassName: ComparableDemo03
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月21日
*
*/

public class ComparableDemo03 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(8);
        bt.add(3);
        bt.add(3);
        bt.add(10);
        bt.add(9);
        bt.add(1);
        bt.add(5);
        bt.add(5);
        System.out.println("排序之后的结果：");
        bt.print();

    }

}
