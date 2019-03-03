package com.wzg.factory.abstractFactory;

public interface Seat {
	void massage();
}

class LuxurySeat implements Seat{
	
	@Override
	public void massage() {
		System.out.println("高端座椅");
	}
}

class LowSeat implements Seat{
	
	@Override
	public void massage() {
		System.out.println("低端座椅");
	}
}
