package com.yrdomain.test;

public class FindidFunc1 {

	//field �Ӽ�
	//method ����
	//Ŭ���� Ŭ�������� = new Ŭ����������;
	public static void main(String[] args) {
		
		FindidFunc1 findidfunc = new FindidFunc1();

		String aaaa = findidfunc.findid();
		System.out.println(findidfunc.findid());

	}
	
	
	
	
	public String findid() {
		String[] user = {"leeks8125","leeks8125@naver.com","�̱���"};
		String name = "�̱���";
		String email = "leeks8125@naver.com";
		char[] num = user[0].toCharArray();
		
		
		if(user[2].equals(name) && user[1] == email) {
			
			if(user[0].length()>1 && user[0].length()<100)
				num[3] = '*';
			
			
			System.out.print(user[0]+" ");
			System.out.println( "�Դϴ�");
			
//			System.out.println(email);
		} else {
			System.out.println("fail");
		
		}
		
		return String.valueOf(num); 
	} 
}




