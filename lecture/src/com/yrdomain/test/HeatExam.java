package com.yrdomain.test;

public class HeatExam {

	public static void main(String[] args) {

			Heater heat = new Heater();
			int a= 0;	
			while(a==0) {
				heat.display();
				heat.up();
				heat.maxup();
				heat.down();
				heat.mindown2();
				//heat.mindown();
				heat.pwoff();
				heat.pwon();
				heat.err();
				//heat.ac(1);
			}	
	}
}