package com.yrdomain.ch06;

public class Car8Example {

	public static void main(String[] args) {
		Car8 myCar = new Car8();
		
		myCar.setSpeed(-50);
		System.out.println("����ӵ� :" + myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("����ӵ� :" + myCar.getSpeed());

	}

}
