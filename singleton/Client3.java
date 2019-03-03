package com.wzg.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 单例模式五种实现方式的效率测试
 * @author wang
 *
 */
public class Client3 {
	
	public static void main(String[] args) throws Exception{
		
		long start = System.currentTimeMillis();
		// 开启的线程数
		int threadNum = 10;
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		
		for(int k=0;k<10;k++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					for(int i=0;i<10000;i++) {
//						Object o = SingletonDemo1.getInstance();
//						Object o = SingletonDemo2.getInstance();
//						Object o = SingletonDemo3.getInstance();
//						Object o = SingletonDemo4.getInstance();
						Object o = SingletonDemo5.INSTANCE;
					}
					
					countDownLatch.countDown();
				}
			}).start();
		}
		countDownLatch.await();// main线程阻塞，直到计数器变为0，才会向下执行。
		
		long end = System.currentTimeMillis();
		System.out.println("总耗时"+(end-start)+"ms");
	}
	
}
