package com.yrdomain.ch06;

public class Car5Example {

	public static void main(String[] args) {
		Car5 myCar = new Car5();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도 :" + speed + "km/h");
		System.out.println(speed);
	}

}
