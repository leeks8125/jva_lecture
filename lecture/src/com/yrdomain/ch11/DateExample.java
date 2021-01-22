package com.yrdomain.ch11;

import java.util.Date;
import java.text.SimpleDateFormat;


public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy년MM월dd일hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);

	}

}
