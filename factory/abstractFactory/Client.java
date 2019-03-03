package com.wzg.factory.abstractFactory;

public class Client {
	public static void main(String[] args) {
		CarFactory factory = new LowCarFactory();
		Engine engine = factory.createEngine();
		engine.run();
		engine.start();
	}
}
