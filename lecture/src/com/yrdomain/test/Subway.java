package com.yrdomain.test;
import java.util.Scanner;
public class Subway {
	Scanner sc = new Scanner(System.in);
	String[][] stationname = {{"����","�̴�","����"},
								{"����","õ��","�ƻ�"}};
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
		System.out.println("��߿��̸��� �˻� �Ͻÿ� :");
		search1 = sc.nextLine(); 
		System.out.println("�������̸��� �˻� �Ͻÿ� :");
		search2 = sc.nextLine();
		System.out.println();
		System.out.println(search1+"-"+search2);	
		
		
		
		
		}
	
		
		
	

}
