package com.yrdomain.ch06;

public class Car4 {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
		}
		System.out.println("gas가 있습니다");
		return true;
	}
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량 :" + gas +")");
				return ;
			}
		}
	}
}
