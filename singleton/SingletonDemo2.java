package com.wzg.singleton;
/**
 * 懒汉式单例模式--真正用的时候才加载
 * @author wang
 * 问题：
 * 		资源利用率高了。但是每次调用getInstance()都要同步，并发效率低。
 */
public class SingletonDemo2 {
	// 类初始化时，不能初始化这个对象（延时加载，真正用的时候才创建）
	private static SingletonDemo2 instance;  
	// 私有化构造器
	private SingletonDemo2() {}  
	// 方法同步，调用效率低
	public static synchronized SingletonDemo2 getInstance() {
		if (instance == null) {
			instance = new SingletonDemo2();
		}
		return instance;
	}
}
