package com.wzg.factory.abstractFactory;

public interface Engine {
	void run();
	void start();
}

class LuxuryEngine implements Engine{
	@Override
	public void run() {
		System.out.println("好的发动机run");
	}
	
	@Override
	public void start() {
		System.out.println("好的发动机start");
	}
}

class LowEngine implements Engine{
	@Override
	public void run() {
		System.out.println("差的发动机run");
	}
	
	@Override
	public void start() {
		System.out.println("差的发动机start");
	}
}