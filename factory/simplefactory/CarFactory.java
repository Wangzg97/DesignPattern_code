package com.wzg.factory.simplefactory;
/**
 * 
 * @author wang
 * 小问题：
 * 		增加新功能时要修改原来的代码，比如下面增加新的车辆，要继续增加else if 等，
 * 		这样就违反了开闭原则。
 */
public class CarFactory { //创建者
	
	public static Car createCar(String type) {
		if ("奥迪".equals(type)) {
			return new Audi();
		} else if ("宝马".equals(type)) {
			return new BMW();
		} else {
			return null;
		}
	}
	
//	// 另一种实现方式
//	public static Car createAudi() {
//		return new Audi();
//	}
//	public static Car createBMW() {
//		return new BMW();
//	}
}
