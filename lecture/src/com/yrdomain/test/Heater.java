package com.yrdomain.test;
import java.util.Scanner;

public class Heater {

	Scanner sc = new Scanner(System.in);
	int upbotton = 0;
	int downbotton = 0;
	boolean power = true;
	String brand = "";
	int temp=-25;
	int wtemp;

	public Heater () {
	}

		public Heater(int temp, int wtemp, int upbotton, int downbotton, boolean power, String brand) {
		this.upbotton = upbotton;
		this.downbotton = downbotton;
		this.power = power;
		this.brand = brand;
		this.temp = temp;
		this.wtemp = wtemp;
	}

	

	public void display() {
		brand = "Rinnai";		
		if(power == true) {
			System.out.println("브랜드:"+brand);
			System.out.println("현재 온도:"+temp);
			System.out.println("---------");
			System.out.println("1.전원  2.증가  3.감소 ");
			System.out.print("입력: ");
		}
			wtemp = sc.nextInt();
			System.out.println();

	}
	public int up() {
		upbotton = 2;
		if((power==true)&&(upbotton==wtemp)) {
			temp++;
		}else {
			//
		}		
		return temp;
	}

	public int maxup() {
		if(temp>50) {
			System.out.println("최대치입니다. 온도를 낮추세요");
			System.out.println();
			temp--;
		}else {
			//
		}
		return temp;
	}

	public int down() {
			downbotton = 3;
			if((power==true)&&(wtemp==downbotton)){
				temp--;
			}else {
				//
			}
			return temp;
	}
	
	public boolean mindown2( ) {
		return true;
	}

	

	public void mindown() {
		System.out.println("최소치입니다. 온도를 높이세요");

	}

	public int chekmindown1(int input) {
		int result = 0;
		if(input == -30) {
			result = 1;
		} else {
			result = 0;
		}
		return result;
//		if(temp<-30) {
//			
//			temp++;
//			System.out.println("최소치입니다. 온도를 높이세요");
//		}
//		return temp;
	}

	public void ac(String str) {
		System.out.println(str);
	}

	public void ac(int x) {
		if(x == 1) {
		System.out.println(x);
		} else {
			System.out.println();
		}
	}

	int x = chekmindown1(10);//0
	
	public boolean pwoff() {
		if((power==true)&&(wtemp==1)) {
			System.out.println("전원을 끕니다");
			System.out.println();
			power = false;
			
		}
		return power;
	}
	
	public boolean pwon() {
		if((power==false)&&(wtemp==1)) {
			System.out.println("전원을 켭니다");
			System.out.println();
			power=true;
		}
		return power;
	}

	public int err() {
			if(wtemp>3) {
				System.out.println();
				System.out.println("다른번호 눌러주세요");
				System.out.println();

			}else {
				//
			}
			return temp;
	}

}
