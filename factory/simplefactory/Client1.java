package com.wzg.factory.simplefactory;
/**
 * 没有简单工厂模式情况下
 * @author wang
 * 既要知道接口类，又要知道实现类。要进行new创建
 */
public class Client1 { // 调用者
	public static void main(String[] args) {
		Car c1 = new Audi();
		Car c2 = new BMW();
		
		c1.run();
		c2.run();
	}
}
