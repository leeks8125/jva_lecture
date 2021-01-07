package com.yrdomain.ch06;

public class Calculator1 {
	
	
	int plus(int x , int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result1 = sum /2;
		return result1;
	}
	
	void execute() {
		double result =avg(5,10);
		println("실행결과:" + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}

}
