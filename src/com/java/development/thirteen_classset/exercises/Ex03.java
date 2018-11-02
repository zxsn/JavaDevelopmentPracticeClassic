package com.java.development.thirteen_classset.exercises;

/*
 * 
    * @ClassName: Ex03
    * @Description: 自己动手编写一个双向链表
    * @author Administrator
    * @date 2018年11月7日
    *
 */
class DoublyLinkList<T> {// 双向链表类
	private Link<T> first;// 头节点
	private Link<T> last;// 尾节点

	public DoublyLinkList() {// 初始化首尾指针
		first = null;
		last = null;
	}

	public boolean isEmpty() {// 空表
		return first == null;
	}

	public void addFirst(T value) {// 头插
		Link<T> newLink = new Link<T>(value);
		if (isEmpty()) {// 如果链表为空
			last = newLink;// last->newLink
		} else {
			first.pre = newLink;// first.pre->newLink
		}
		newLink.next = first;// newLink->first
		first = newLink;// first->newLink
	}

	public void addLast(T value) {// 尾插
		Link<T> newLink = new Link<T>(value);
		if (isEmpty()) {// 如果链表为空
			first = newLink;// 表头指针直接指向新节点
		} else {
			last.next = newLink;// last指向的节点指向新节点
			newLink.pre = last;// 新节点的前驱指向last
		}
		last = newLink;// last指向新节点
	}

	public boolean addBefore(T key, T value) {// 节点前插入
		Link<T> cur = first;
		if (first.next.val == key) {// 第一个节点前插入
			addFirst(value);
			return true;
		} else {
			while (cur.next.val != key) {// 循环查找
				cur = cur.next;
				if (cur == null) {// 找不到
					return false;
				}
			}
			Link<T> newLink = new Link<T>(value);// 实例化插入节点
			newLink.next = cur.next;
			cur.next.pre = newLink;
			newLink.pre = cur;
			cur.next = newLink;
			return true;
		}
	}

	public void addAfter(T key, T value) {
		Link<T> cur = first;
		while (cur.val != key) {// 经过循环，cur指针指向指定节点
			cur = cur.next;
			if (cur == null) {// 找不到该节点
				System.out.println("节点不存在。");
			}
		}
		Link<T> newLink = new Link<T>(value);
		if (cur == last) {// 如果当前节点是尾节点
			newLink.next = null;// 新节点指向null
			last = newLink;// last指针指向新节点
		} else {
			newLink.next = cur.next;// 新节点后继指针指向当前节点的后继
			cur.next.pre = newLink;// 当前节点的前驱指向新节点
		}
		newLink.pre = cur;// 新节点的前驱指向当前节点
		cur.next = newLink;// 当前节点的后继指向新节点
	}

	public void deleteFirst() {
		if (first.next == null) {
			last = null;
		} else {
			first.next.pre = null;
		}
		first = first.next;
	}

	public void deleteLast(T key) {
		if (first.next == null) {
			first = null;
		} else {
			last.pre.next = null;
		}
		last = last.pre;
	}

	public void deleteKey(T key) {
		Link<T> cur = first;
		while (cur.val != key) {
			cur = cur.next;
			if (cur == null) {// 不存在该节点
				System.out.println("节点不存在。");
			}
		}
		if (cur == first) {// 如果first指向节点
			first = cur.next;// first指向后移
		} else {
			cur.pre.next = cur.next;// 前面节点的后继指向当前节点的后一个节点
		}
		if (cur == last) {// 如果当前节点是尾节点
			last = cur.pre;// 尾节点的前驱前移
		} else {
			cur.next.pre = cur.pre;// 后面节点的前驱指向当前节点的前一个节点
		}
	}

	public T queryPre(T value) {
		Link<T> cur = first;
		if (first.val == value) {
			System.out.println("没有找到" + value + "前驱");
		}
		try {
			while (cur.next.val != value) {
				cur = cur.next;
				if (cur.next == null) {
					System.out.print(value + "的前驱节点不存在。");
				}
			}
		} catch (Exception e) {// 取消空指针异常显示
			cur.val = null;
			// e.printStackTrace();
		}
		return cur.val;
	}

	public void displayForward() {// 正向显示
		Link<T> cur = first;
		while (cur != null) {
			cur.displayCurrentNode();
			cur = cur.next;
		}
		System.out.println();
	}

	public void displayBackward() {// 逆向显示
		Link<T> cur = last;
		while (cur != null) {
			cur.displayCurrentNode();
			cur = cur.pre;
		}
		System.out.println();
	}
}

class Link<T> {// 链表类
	public T val;// 结点
	public Link<T> next;// 后继指针
	public Link<T> pre;// 前驱指针

	public Link(T val) {
		this.val = val;
	}

	public void displayCurrentNode() {// 显示当前节点
		System.out.print(val + " ");
	}
}
public class Ex03 {

	public static void main(String[] args) {
		DoublyLinkList<Integer> d = new DoublyLinkList<Integer>();
		d.addFirst(1);// 增加节点
		d.addFirst(1);// 增加节点
		d.addFirst(2);// 增加节点
		d.addFirst(3);// 增加节点
		d.addLast(6);// 增加节点
		d.addFirst(4);// 增加节点
		d.addFirst(5);// 增加节点
		d.addLast(7);// 增加节点
		System.out.println("双向链表如下：");
		d.displayForward();// 正向显示
		System.out.println(4 + "的前驱节点为：" + d.queryPre(4));
		System.out.println(0 + "的前驱节点为：" + d.queryPre(0));
	}

}
