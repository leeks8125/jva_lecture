package com.yrdomain.ch05;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		  String indexOfTestOne = "Hello world";
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("java");
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
		System.out.println(strArray[0] );
		System.out.println(indexOfTestOne.indexOf("j") );
	}

}
