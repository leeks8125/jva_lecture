package com.yrdomain.ch11;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr ="�ڹٴ� ��ü �������Դϴ�. �ڹٴ� ǳ���� api�� �����մϴ�";
		String newStr = oldStr.replace("�ڹ�", "java");
		System.out.println(oldStr);
		System.out.println(newStr);

	}

}
