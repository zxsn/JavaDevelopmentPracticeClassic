package com.java.development.twelve_java_io.exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 * 
    * @ClassName: Ex08
    * @Description:完成文件复制操作，在程序运行后提示输入源文件路径，然后再输入目标文件路径。
    * @author Administrator
    * @date 2018年11月3日
    *
 */
public class Ex08 {

	public static void main(String[] args) throws Exception{
		BufferedReader buf = null;//声明BufferedReader对象
		buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("=====文件复制系统=====");
		
		while(true) {//获得源文件路径和目标文件路径
			System.out.print("请输入要复制文件的路径：");
			String str = null;
			str = buf.readLine();
			File file = null; 
			File newFile = null;
				file = new File(str);
				if(file.isFile()) {
					
					while(true) {
						System.out.print("请输入目标文件路径：");
						str = buf.readLine();
						newFile = new File(str);
						if(newFile.isFile()) {
							System.out.println("路径都正确！");
							//开始复制
							InputStream input = null;//准备输入流对象，读取源文件
							OutputStream out = null;//准备输出流对象，写入目标文件
							input = new FileInputStream(file);
							out = new FileOutputStream(newFile);
								if(input != null && out != null) {//判断输入或输出是否准备好
									int temp = 0;
									byte data[] = new byte[1024];//每次读取1024字节
							// 将每次读取进来的数据保存在字节数组里面，并且返回读取的个数。
									while((temp = input.read(data)) != -1) {
										out.write(data,0,temp);
									}
									System.out.println("复制完成！");
								}
								//关闭流
								if(input!=null&&out!=null) {
									input.close();
									out.close();
								}
							break;
							}
							newFile.createNewFile();
					}
					break;
				}
		System.out.println("源文件不存在，请重新输入！");
		}
	}

}
