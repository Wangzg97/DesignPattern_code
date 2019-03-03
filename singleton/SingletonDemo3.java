package com.wzg.singleton;
/**
 * 双重检测锁式实现
 * @author wang
 * 这个模式将同步内容下放到if内部，提高了执行的效率，
 * 不必每次获取对象时都进行同步，只有第一次才同步，创建以后就没必要了。	
 */
public class SingletonDemo3 {
	private static SingletonDemo3 instance = null;  
	// 私有化构造器
	private SingletonDemo3() {}  
	// 将同步内容下放到if内部
	public static SingletonDemo3 getInstance() {
		if (instance == null) {
			SingletonDemo3 sc;
			synchronized (SingletonDemo3.class) {
				sc = instance;
				if(sc == null) {
					synchronized (SingletonDemo3.class) {
						if(sc == null) {
							sc = new SingletonDemo3();
						}
					}
					instance = sc;
				}
			}
		}
		return instance;
	}
}
