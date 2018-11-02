package com.java.development.fiveteen_reflection.factory;

interface Fruit {// 水果接口
	public void eat();
}

class Apple implements Fruit {

	@Override
	public void eat() {
		System.out.println("***吃苹果。");
	}

}

class Orange implements Fruit {

	@Override
	public void eat() {
		System.out.println("***吃橘子。");
	}

}

/*
 * 
 * @ClassName: FactoryDemo01
 * 
 * @Description: 使用反射完成工厂设计
 * 
 * @author Administrator
 * 
 * @date 2018年11月11日
 *
 */
public class FactoryDemo01 {

	public static class Factory {
		@SuppressWarnings("deprecation")
		public static Fruit getInstance(String className) {// 取得接口实例
			Fruit fruit = null;// 定义接口对象
			try {
				fruit = (Fruit) Class.forName(className).newInstance();// 实例化对象
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			}
			return fruit;

		}
	}
	public static void main(String[] args) {
		// 通过工厂类取得接口实例，传入完整的包.类名称
		Fruit f = Factory.getInstance("com.java.development.fiveteen_reflection.factory.Apple");
		if (f != null) {// 判断是否取得接口实例
			f.eat();
		}
	}

}
