package com.yrdomain.test;

public class FindidFunc {

	public static void main(String[] args) {
		
		FindidFunc findidfunc = new FindidFunc();
		
		String aaaa = findidfunc.findid();
//		System.out.println(findidfunc.findid());	
	
	}
	
	
	public String findid() {
		String[] user = {"leeks8125","leeks8125@naver.com","이교석"};
		String name = "이교석";
		String email = "leeks8125@naver.com";

		
		
		if(user[2] == name && user[1] == email) {
			
			
			System.out.print(user[0].substring(0,4).concat("***5")+" ");
			System.out.println( "입니다");
			
//			System.out.println(email);
		} else {
			System.out.println("fail");
		
		}
		
		return user[0];
	} 
}




