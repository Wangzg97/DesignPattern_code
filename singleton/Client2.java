package com.wzg.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 测试反射和反序列化破解
 * @author wang
 *
 */
public class Client2 {
	
	public static void main(String[] args) throws Exception{
		SingletonDemo6 s1 = SingletonDemo6.getInstance();
		SingletonDemo6 s2 = SingletonDemo6.getInstance();
		// 下面两行输出显示为同一个对象
		System.out.println(s1);
		System.out.println(s2);
		
//		// 通过反射直接调用私有构造器
//		Class<SingletonDemo6> clazz = (Class<SingletonDemo6>) Class.forName("com.wzg.singleton.SingletonDemo6");
//		Constructor<SingletonDemo6> c = clazz.getDeclaredConstructor(null);
//		// 跳过权限检查，访问私有属性
//		c.setAccessible(true);
//		SingletonDemo6 s3 = c.newInstance();
//		SingletonDemo6 s4 = c.newInstance();
//		// 下面两行输出显示两个不同的新对象
//		System.out.println(s3);
//		System.out.println(s4);
		
		//通过反序列化的方式构造多个对象
		FileOutputStream fos = new FileOutputStream("result.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result.txt"));
		SingletonDemo6 s3 = (SingletonDemo6) ois.readObject();
		// 下面输出显示一个新对象
		System.out.println(s3);
	}
	
}
