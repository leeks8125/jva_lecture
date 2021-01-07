package com.yrdomain.test;

public class Computer {
	String brand ="조립컴퓨터";
	//String startbutton;
	//String moniter;
	//String mobiterBrand;
	//String mainBoard;
	//String mainBoardBrand;
	//String cpu;
	//String gpu;
	//String others;
	/*public int[] power () {
		//파워 만들기 500짜리 5칸	
			int[]result = new int[5];
			for(int i = 0 ; i < result.length;i++) {
				result[i] += 500;
				System.out.println(result[i]);
			}
			return result;
		}*/
	int[] use;
	int result;
	int a;
	int b;
	int c;
	
	public Computer () {
	}

	public Computer(int[] use,int result,int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.use = use;
		this.result = result;
		
	}
	
	
	
	public void moniter (int b) {
		int[] use = {140};
		int result;
		for(int i=0; i < 2; i++) {
			if(use[0] < b ) {
				result = b - use[0];
				System.out.println("사용전력"+use[0]+"모니터 전력공급..."+"남는량"+ result);
				break;
			}else {
			}
		}
	}
	public int mainboardpower (int a) {
		
		int add = startbuttonworking(a);
		int[] use = {100};
		int result;
		
			if(use[0] < a) {
				result = a - use[0];
				System.out.println("사용전력"+use[0]+"메인보드 전력공급..."+"남는량"+ result);
			
			}else {
				System.out.println("======-----전력부족-----======");
				result = c - use[0];
				System.out.println("부족한 전력: " + result);
				
			}
		
		return 0;
	}
	public int startbuttonworking (int a) {
			int[] use = {330};
			int result;
			int i = 0;
			
				if(330 <= a) {
					System.out.println("======-----스타트중-----======");
						result = a - use[0];
					System.out.println("사용전력 "+use[0]+"\t"+(i+1)+"번째 에 남은전력: " + result);
				}else{
					System.out.println("======-----전력부족-----======");
						result = a - use[0];
					System.out.println("부족한 전력: " +"\t"+(i+1)+"번째의 값 "+result);	
					System.out.println(result);
				}
			
		return  a;
	}
public static void main(String[] args) {
	
		Computer computer = new Computer();
		
			computer.startbuttonworking(1000);
			computer.mainboardpower(100);
			//computer.moniter(powerW);
		}
}