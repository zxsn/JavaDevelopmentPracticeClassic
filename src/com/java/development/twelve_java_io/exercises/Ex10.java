package com.java.development.twelve_java_io.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
    * @ClassName: Ex10
    * @Description: 投票系统
    * @author Administrator
    * @date 2018年11月3日
    *
 */

public class Ex10 {
	/*
	 * 
	    * @ClassName: Student
	    * @Description: 学生类
	    * @author Administrator
	    * @date 2018年11月3日
	    *
	 */
	public class Student implements Comparable<Student>{
		private String name;//姓名
		private int stuNo;//代号
		private int ticketNum;//票数
		
		public Student(int stuNo, String name, int ticketNum) {
			this.name = name;
			this.stuNo = stuNo;
			this.ticketNum = ticketNum;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getStuNo() {
			return stuNo;
		}
		public void setStuNo(int stuNo) {
			this.stuNo = stuNo;
		}
		public int getTicketNum() {
			return ticketNum;
		}
		public void setTicketNum(int ticketNum) {
			this.ticketNum = ticketNum;
		}
		@Override
		public int compareTo(Student o) {//实现接口的方法
			if(this.ticketNum < o.ticketNum) {
				return 1;
			}else if(this.ticketNum > o.ticketNum) {
				return -1;
			}else {
				return 0;
			}
		}
	}
	/*
	 * 
	    * @ClassName: InputData
	    * @Description: 输入数据类
	    * @author Administrator
	    * @date 2018年11月3日
	    *
	 */
	public class InputData{
		private BufferedReader buf = null;//接收数据
		public InputData() {
			buf = new BufferedReader(new InputStreamReader(System.in));
		}
		public String getString(String info) {//得到字符串
			String temp = null;
			System.out.print(info);
			try {
				temp = this.buf.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return temp;
		}
		public int getInt(String info, String err) {//得到整型数据
			int temp = 0;
			String str = null;
			boolean flag = true;//定义一个循环标记
			while(flag) {
				str = this.getString(info);
				if(str.matches("\\d+")) {
					temp = Integer.parseInt(str);
					flag = false;//更改标志位，将退出循环
				}else {
					System.out.println(err);
				}
			}
			return temp;
		}
	}
	/*
	 * 
	    * @ClassName: Operate
	    * @Description:操作类
	    * @author Administrator
	    * @date 2018年11月3日
	    *
	 */
	public class Operate{
		private Student stu[] = {new Student(1, "张三", 0),new Student(2, "李四", 0),
				new Student(3, "王五", 0),new Student(4, "赵六", 0),};//候选人信息
		private boolean flag = true;
		public Operate() {
			this.printInfo();//先输出候选人信息
			while(flag) {
				this.vote();//循环调用投票
			}
			this.printInfo();//输出投票之后的候选人信息
			this.getResult();//得到结果
		}
		public void getResult() {//得到最终的投票结果
			java.util.Arrays.sort(this.stu);
			System.out.println("投票最终结果：" + this.stu[0].getName()
					+"同学，最后以"+this.stu[0].getTicketNum()+"票当选班长！") ;
		}
		public void vote() {//投票
			InputData input = new InputData();//输入信息
			int num = input.getInt("请输入班长候选人代号（数字0结束）：", "此选票无效，请输入正确的候选人代号！");
			switch(num) {
				case 0:{
					this.flag = false;//中断循环
					break;
				}
				case 1:{
					this.stu[0].setTicketNum(this.stu[0].getTicketNum()+1);
					break;
				}
				case 2:{
					this.stu[1].setTicketNum(this.stu[1].getTicketNum()+1);
					break;
				}
				case 3:{
					this.stu[2].setTicketNum(this.stu[2].getTicketNum()+1);
					break;
				}
				case 4:{
					this.stu[3].setTicketNum(this.stu[3].getTicketNum()+1);
					break;
				}
				default:{
					System.out.println("此选票无效，请输入正确的候选人代号！");
				}
			}
		}
		public void printInfo() {
			for(int i = 0; i < stu.length; i++) {
				System.out.println(this.stu[i].getStuNo()+"："+this.stu[i].getName()
						+"【"+this.stu[i].getTicketNum()+"】");
			}
		}
	}
	public static void main(String[] args) {
		Ex10 e = new Ex10();
		e.new Operate();

	}

}
