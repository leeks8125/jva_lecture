package com.yrdomain.test;
import java.util.Scanner;
public class New {

	public static void main(String[] args) {
		
		String[][] aaa = {{"�� ���� ü���� �̷��� ����ϼ���~~","�������","2020.09.02","253"},
						{"�Ͽ��� ���� 9�� ��� �����մϴ�	","���α�","2020.12.27","33"},
						{ "2020�� 12�� �ű� Ž��븦 �����մϴ�","�������","2020.12.03","54"},
						{ "���α� ���� 15���� �絵�մϴ�	","���α�",	"2020.10.27" ,"246"},
						{ "���α� ��Ʈ Ư�� ����� �����Ǿ����ϴ�","���α�","2020.09.30","262"},
						{ "���� ȸ�� �ʵ����� �Դϴ�	","�������","2020.03.03","1731"},
						{ "�ֽ� �絵 ����		","���α�","2020.07.26","197"},
						{ "�� ī�並 ã�� ���� �е鲲	","���α�","2020.03.25","589"},
						{ "��� �����ϸ� ������ ����	",	"�������","2019.10.31","803"}};
			
		

		  String users = "";
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("ã�³��� :");
		  users = sc.nextLine(); 
		  
		   System.out.println("ã�³��� :");
		   users = sc.nextLine(); 
		   
		   sc.close();
		  
		   for(int i = 0; i < 9; i ++) {
			
			for(int j =0; j<4; j++) {
			
				if(users.equals(aaa[i][j])) {
			System.out.println("ã�� ������" + "aaa["+i+"]["+j+"]�� �ֽ��ϴ�");
				}else {
			System.out.println("�����ϴ�");
				}
			
			}
		}
		
	}
		
}	
			
			
		
		
			
		
		
		
	
	
	




