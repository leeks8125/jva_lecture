package com.yrdomain.ch06;

public class Car4Example {

	public static void main(String[] args) {
		Car4 myCar = new Car4();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("������ ������ �ʿ䰡 �����ϴ�");
		}else {
			System.out.println("������ �������ּ���");
		}

	}

}
