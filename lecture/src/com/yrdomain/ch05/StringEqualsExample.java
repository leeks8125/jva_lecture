package com.yrdomain.ch05;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		
		if(strVar1 == strVar2) {
			System.out.println("srtVar1�� srtVar2�������� ����");
		}else {
			System.out.println("srtVar1�� srtVar2�������� �ٸ�");
		}
		
		if(strVar1.equals(strVar2)){
			System.out.println("srtVar1�� srtVar2�� ���ڿ��� ����");
		}
		
		String strVar3 = new String("�Ź�ö");
		String strVar4 = new String("�Ź�ö");
		
		if(strVar3 == strVar4) {
			System.out.println("srtVar3�� srtVar4�������� ����");
		}else {
			System.out.println("srtVar3�� srtVar4�������� �ٸ�");
		}
		
		if(strVar3.equals(strVar4)){
			System.out.println("srtVar3�� srtVar4�� ���ڿ��� ����");
		}

	}
	    
}
