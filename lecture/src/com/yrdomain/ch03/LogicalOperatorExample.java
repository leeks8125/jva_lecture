package com.yrdomain.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		
		if( (charCode>=65) & (charCode<=90) ) {
			System.out.println("대문자 이군요");
		}
		
		if( !(charCode<48) & (charCode>57) ) {
			System.out.println("0~9 숫자이군요");
		}
		
		int value = 6;
		
		if( !(value%2==0) | (value%3==0) ) {
			System.out.println("2, 3의 배숫이군요");
		}
		
		if( !(value%2==0) || (value%3==0) ) {
			System.out.println("2, 3의 배숫이군요");
		}

	}

}
