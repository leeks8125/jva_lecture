package com.yrdomain.ch11;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		String regExp="(02|010)-\\d{3,4}-\\d{4}";
		String data= "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다");
		}else {
			System.out.println("정규식과 일치x");
		}

		regExp="\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data="angel@navercom";
		result = Pattern.matches(regExp,  data);
		
		if(result) {
			System.out.println("정규식과 일치합니다");
		}else {
			System.out.println("정규식과 일치x");
		}
	}

}
