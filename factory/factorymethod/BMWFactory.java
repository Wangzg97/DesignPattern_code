package com.wzg.factory.factorymethod;

public class BMWFactory implements CarFactory{
	
	@Override
	public Car createCar() {
		return new BMW();
	}
}
