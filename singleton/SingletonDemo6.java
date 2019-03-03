package com.wzg.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 懒汉式单例模式--如何防止反射和反序列化漏洞
 * @author wang
 
 */
public class SingletonDemo6 implements Serializable{
	// 类初始化时，不能初始化这个对象（延时加载，真正用的时候才创建）
	private static SingletonDemo6 instance;  
	// 私有化构造器
	private SingletonDemo6() {
		// 防止反射漏洞
		if(instance!=null) {
			throw new RuntimeException();
		}
	}  
	// 方法同步，调用效率低
	public static synchronized SingletonDemo6 getInstance() {
		if (instance == null) {
			instance = new SingletonDemo6();
		}
		return instance;
	}
	
	// 反序列化时，如果定义了readResolve()方法则直接返回此方法指定的对象，而不需要单独再创建新对象。
	// 实际上是一种回调
	private Object readResolve() throws ObjectStreamException {
		return instance;
	}
}
