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

	

	public void run() {
		brand = "Rinnai";		
		if(power == true) {
			System.out.println("�귣��:"+brand);
			System.out.println("���� �µ�:"+temp);
			System.out.println("---------");
			System.out.println("1.����  2.����  3.���� ");
			System.out.print("�Է�: ");
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
			System.out.println("�ִ�ġ�Դϴ�. �µ��� ���߼���");
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
		System.out.println("�ּ�ġ�Դϴ�. �µ��� ���̼���");

	}

	

	

	

	public int chekmindown1(int input) {
		int result = 0;
		if(input == 1) {
			result = 1;
		} else {
			result = 0;
		}
		return result;
//		if(temp<-30) {
//			
//			temp++;
//			System.out.println("�ּ�ġ�Դϴ�. �µ��� ���̼���");
//		}
//		return temp;
	}

	

	public void ac(String str) {
		System.out.println(str);
	}

	public void ac(int b) {
		if(b == 1) {
		System.out.println(b);
		} else {
			System.out.println();
		}
	}

	

	int x = chekmindown1(10);
	public int pw() {
		if((power==true)&&(wtemp==1)) {
			System.out.println("������ ���ϴ�");
			System.out.println();
			power = false;
		}else if((power==false)&&(wtemp==1)) {
			System.out.println("������ �մϴ�");
			System.out.println();
			power=true;
		}else {
					//
		}
		return temp;

	}

	public int err() {
			if(wtemp>3) {
				System.out.println();
				System.out.println("�ٸ���ȣ �����ּ���");
				System.out.println();

			}else {
				//
			}
			return temp;
	}

}
