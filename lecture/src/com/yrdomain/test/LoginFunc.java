package com.yrdomain.test;

public class LoginFunc {

	public static void main(String[] args) {
		LoginFunc loginfunc = new LoginFunc();
		int a = 0;
		
	a = loginfunc.login();
	loginfunc.syso(a);
	
		
	}
	


	public int login() {
		
		String[] user = {"leeks8125","123456"};
				
		String id = "leeks8125";
		String pw = "123456";
			
		int result = 0;
		
		if(user[0] == id && user[1] == pw) {
			result = 1;
		} else {
			result = 0;
		} 
		return result;
	
	}
	
	public void syso (int a) {
		if(a == 1) {
			System.out.println("success");
		} else {
			System.out.println("fail !!");
		}
	}
	
}
	


