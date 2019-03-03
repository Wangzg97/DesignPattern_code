package com.wzg.singleton;
/**
 * 静态内部类实现
 * @author wang
 * 	要点：
 * 		外部类没有static属性，则不会像饿汉式那样立即加载对象。
 * 		只有真正调用getInstance()，才会加载静态内部类。加载类时是线程安全的。
 * 	instance是static final类型，保证了内存中只有一个这样的实例存在，而且只能被赋值一次，
 * 	从而保证了线程的安全性。
 * 		兼备了并发高效调用和延迟加载优势
 */
public class SingletonDemo4 {
	private static class SingletonClassInstance{
		private static final SingletonDemo4 instance = new SingletonDemo4();
	}
	// 私有化构造器
	private SingletonDemo4() {}  
	// 
	public static SingletonDemo4 getInstance() {
		return SingletonClassInstance.instance;
	}
}
