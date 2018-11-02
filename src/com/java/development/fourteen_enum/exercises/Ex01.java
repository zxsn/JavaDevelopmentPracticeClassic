package com.java.development.fourteen_enum.exercises;

/*
 * 
    * @ClassName: Ex01
    * @Description: 定义一个品牌计算机的枚举类，其中只有固定的几个计算机品牌
    * @author Administrator
    * @date 2018年11月10日
    *
 */
public class Ex01 {
	public enum Computer {
		HP("暗影精灵 3", 9999), DELL, LENOVO, HASEE("战神", 3999), HUAWEI, XIAOMI;
		private String name;
		private int price;

		private Computer() {

		}
		private Computer(String name, int price) {
			this.setName(name);
			this.setPrice(price);
		}
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String toString() {
			return "品牌：" + name + "；价格：" + price;
		}
	}
	public static void main(String[] args) {
		Computer com = Computer.LENOVO;
		com.setName("拯救者");
		com.setPrice(8999);
		System.out.println(com.name() + com);
		Computer hp = Computer.valueOf("HP");
		System.out.println(hp);
		// 取得所有枚举值
		System.out.println("====所有电脑信息====");
		for (Computer c : Computer.values()) {
			System.out.println(c.name() + c);
		}

	}

}
