package com.java.development.twelve_java_io.exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/*
 * 
    * @ClassName: Ex09
    * @Description: 编写程序，程序运行时输入目录名称，并把该目录下的所有文件的扩展名修改为.txt
    * @author Administrator
    * @date 2018年11月3日
    *
 */
public class Ex09 {

	public static void main(String[] args) throws Exception {
		BufferedReader buf = null;
		buf = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
		System.out.print("请输入目录名称：");
		String temp = buf.readLine();
		File dir = new File(temp);
			if(dir.isDirectory()) {
				System.out.println(dir+"是目录。");
				File files[] = dir.listFiles();
				for (File file : files) {
					if(file.isFile()) {
						file.renameTo(new File(file.toString().split("\\.")[0]+".txt"));
						//System.out.println(file);
					}
				}
				System.out.println("将此目录中的文件后缀重命名成功！");
				break;
			}
			System.out.println(dir+"不是目录。");
		}
	}

}

