package com.wzg.singleton;
/**
 * 使用枚举实现单例模式
 * @author wang
 * 实现简单。枚举本身就是单例模式。由JVM从根本上提供保障，避免通过反射和反序列化的漏洞。
 * 缺点：无延时加载
 */
public enum SingletonDemo5 {
	// 这个枚举元素本身就是单例对象
	INSTANCE;
	// 添加实际需要的操作
	public void singletonOperation() {
		
	}
}
