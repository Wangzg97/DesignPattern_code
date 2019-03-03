package com.wzg.singleton;
/**
 * 饿汉式单例模式
 * @author wang
 * 问题：
 * 		如果只是加载本类而不是要调用getInstance(),甚至永远也没有调用，，会造成资源浪费。
 */
public class SingletonDemo1 {
	// 类初始化时立即加载这个对象(没有延时加载的优势)。由于加载类时天然的线程安全的。
	private static SingletonDemo1 instance = new SingletonDemo1();  
	// 私有化构造器
	private SingletonDemo1() {}  
	// 方法没有同步调用效率高
	public static SingletonDemo1 getInstance() {
		return instance;
	}
}
