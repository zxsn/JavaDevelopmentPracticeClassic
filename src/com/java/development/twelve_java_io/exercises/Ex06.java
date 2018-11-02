package com.java.development.twelve_java_io.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
    * @ClassName: Ex06
    * @Description: 编写程序，但程序运行后，根据屏幕提示一个数字字符串，
    * 输入后统计有多少个偶数数字和奇数数字
    * @author Administrator
    * @date 2018年11月3日
    *
 */
public class Ex06 {

	public static void main(String[] args) {
		BufferedReader buf = null;
		buf = new BufferedReader(new InputStreamReader(System.in));//实例化BufferedReader
		while(true) {
		System.out.print("请输入一个数字字符串：");
		String str = null;
		try {
			str = buf.readLine();
			if(str.matches("\\d+")) {
				char c[] = str.toCharArray();
				int num = 0;
				for (char temp : c) {
					if(temp%2==0)
						num++;
				}
				System.out.println("输入的数字字符串中，偶数数字有"+num+"个，奇数数字有"+(c.length-num)+"个。");
				break;
			}else {
				System.out.println("格式错误，请重新输入！");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	}

}
