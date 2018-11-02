package com.java.development.fiveteen_reflection.dynaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * 
    * @ClassName: DynaProxyDemo
    * @Description: 动态代理
    * @author Administrator
    * @date 2018年11月11日
    *
 */
public class DynaProxyDemo {
	public static class MyInvocationHandler implements InvocationHandler {// 代理操作类
		private Object obj;// 真实主题

		public Object bind(Object obj) {// 绑定真实操作主题
			this.obj = obj;
			// 取得代理对象
			return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
		}
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {// 动态调用方法
			Object temp = method.invoke(this.obj, args);// 调用方法，传入真实主题和参数
			return temp;
		}

	}

	public interface Subject {// 定义Subject接口
		public String say(String name, int age);// 定义抽象方法say
	}

	public static class RealSubject implements Subject {// 真实实现类

		@Override
		public String say(String name, int age) {
			return "姓名：" + name + "，年龄：" + age;
		}

	}
	public static void main(String[] args) {
		MyInvocationHandler handler = new MyInvocationHandler();// 实例化代理操作类
		Subject sub = (Subject) handler.bind(new RealSubject());// 绑定对象
		String info = sub.say("贾利鑫", 25);// 通过动态代理调用方法
		System.out.println(info);// 信息输出
	}

}
