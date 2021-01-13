package com.yrdomain.ch07;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Calculator°´Ã¼ÀÇ areacircle() ½ÇÇà");
		return Math.PI*r*r;
	}
}
