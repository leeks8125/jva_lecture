package com.yrdomain.test;
import java.util.Scanner;
public class Subway {
	Scanner sc = new Scanner(System.in);
	String[][] stationname = {{"신촌","이대","서울"},
								{"서울","천안","아산"}};
	String search1 = "";
	String search2 = "";
	int distance = 0;
	int time = 0;
	int cost = 0;

	public void station() {
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(stationname[i][j]+" ");
			}
			System.out.println();
		}
		

	}
	
	public void searchstation() {
		System.out.println("출발역이름을 검색 하시오 :");
		search1 = sc.nextLine(); 
		System.out.println("도착역이름을 검색 하시오 :");
		search2 = sc.nextLine();
		System.out.println();
		System.out.println(search1+"-"+search2);	
		
		
		
		
		}
	
		
		
	

}
