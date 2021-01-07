package com.yrdomain.test;

public class HeatExam {

	public static void main(String[] args) {

			Heater heat = new Heater();
			int a= 0;	
			while(a==0) {
				heat.run();
				heat.up();
				heat.maxup();
				heat.down();
				heat.mindown2();
				heat.mindown();
				heat.pw();
				heat.err();

			}	
	}
}