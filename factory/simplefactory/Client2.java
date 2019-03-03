package com.wzg.factory.simplefactory;
/**
 * 应用简单工厂模式
 * @author wang
 * 整体关系变复杂了，但是对于调用者来书变简单了。
 */
public class Client2 { // 调用者
	public static void main(String[] args) {
		Car c1 = new CarFactory().createCar("奥迪");
		Car c2 = new CarFactory().createCar("宝马");
		
		c1.run();
		c2.run();
	}
}
