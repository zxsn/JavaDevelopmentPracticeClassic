package com.java.development.fourteen_enum.other;

/*
 * 
    * @ClassName: InterfaceEnumDemo
    * @Description: 让枚举类实现一个接口
    * @author Administrator
    * @date 2018年11月10日
    *
 */
public class InterfaceEnumDemo {
	public interface Print {// 定义Print接口
		public String getColor();// 定义抽象方法
	}

	public enum Color implements Print {
		RED {
			public String getColor() {// 枚举对象实现抽象方法
				return "红色";
			}
		},
		GREEN {
			public String getColor() {
				return "绿色";
			}
		},
		BLUE {
			public String getColor() {
				return "蓝色";
			}
		};

		;

	}
	public static void main(String[] args) {
		int i = 0;
		for (Color c : Color.values()) {
			System.out.print(i < Color.values().length - 1 ? c.getColor() + "、" : c.getColor());
			i++;
		}

	}

}
