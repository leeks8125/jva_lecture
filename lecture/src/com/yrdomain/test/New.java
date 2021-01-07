package com.yrdomain.test;
import java.util.Scanner;
public class New {

	public static void main(String[] args) {
		
		String[][] aaa = {{"띵스 스톡 체험판 이렇게 사용하세요~~","라온정달","2020.09.02","253"},
						{"일요일 오후 9시 방송 시작합니다	","프로그","2020.12.27","33"},
						{ "2020년 12월 신규 탐험대를 모집합니다","라온정달","2020.12.03","54"},
						{ "프로그 지분 15구좌 양도합니다	","프로그",	"2020.10.27" ,"246"},
						{ "프로그 차트 특허 등록이 결정되었습니다","프로그","2020.09.30","262"},
						{ "신입 회원 필독사항 입니다	","라온정달","2020.03.03","1731"},
						{ "주식 양도 절차		","프로그","2020.07.26","197"},
						{ "이 카페를 찾아 오신 분들께	","프로그","2020.03.25","589"},
						{ "띵글 구매하면 선물이 팡팡	",	"라온정달","2019.10.31","803"}};
			
		

		  String users = "";
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("찾는내용 :");
		  users = sc.nextLine(); 
		  
		   System.out.println("찾는내용 :");
		   users = sc.nextLine(); 
		   
		   sc.close();
		  
		   for(int i = 0; i < 9; i ++) {
			
			for(int j =0; j<4; j++) {
			
				if(users.equals(aaa[i][j])) {
			System.out.println("찾는 내용이" + "aaa["+i+"]["+j+"]에 있습니다");
				}else {
			System.out.println("없습니다");
				}
			
			}
		}
		
	}
		
}	
			
			
		
		
			
		
		
		
	
	
	




