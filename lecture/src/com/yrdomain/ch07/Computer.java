package com.yrdomain.ch07;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Calculator��ü�� areacircle() ����");
		return Math.PI*r*r;
	}
}
