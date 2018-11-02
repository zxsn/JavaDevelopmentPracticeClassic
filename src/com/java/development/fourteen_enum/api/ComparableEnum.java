package com.java.development.fourteen_enum.api;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 
    * @ClassName: ComparableEnum
    * @Description: 验证枚举比较器
    * @author Administrator
    * @date 2018年11月10日
    *
 */
public class ComparableEnum {
	public enum Color {
		RED, GREEN, BLUE;
	}
	public static void main(String[] args) {
		Set<Color> t = new TreeSet<Color>();
		t.add(Color.GREEN);
		t.add(Color.BLUE);
		t.add(Color.RED);
		Iterator<Color> iter = t.iterator();
		int i = 0;
		while (iter.hasNext()) {
			System.out.print(i < t.size() - 1 ? iter.next() + "、" : iter.next());
			i++;
		}
	}

}
