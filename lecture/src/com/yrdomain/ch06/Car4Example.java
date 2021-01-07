package com.yrdomain.ch06;

public class Car4Example {

	public static void main(String[] args) {
		Car4 myCar = new Car4();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("가스를 주입할 필요가 없습니다");
		}else {
			System.out.println("가스를 주입해주세요");
		}

	}

}
