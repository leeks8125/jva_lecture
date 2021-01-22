package com.yrdomain.ch11;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] scores= {99,98,97};
		Arrays.sort(scores);
		for(int i =0; i<scores.length; i++) {
			
			System.out.println("scores["+i+"]=" +scores[i]);
		}
		System.out.println();
		
		String[] names= {"ȫ�浿","�ڵ���","��μ�"};
		Arrays.sort(names);
		for(int i=0; i<names.length; i++) {
			System.out.println("names["+i+"]="+names[i]);
		}
		System.out.println();
		
		Member3 m1 = new Member3("ȫ�浿");
		Member3 m2 = new Member3("�ڵ���");
		Member3 m3 = new Member3("��μ�");
		Member3[] members = { m1, m2, m3 };
		Arrays.sort(members);
		for(int i=0; i<names.length; i++) {
			System.out.println("members["+i+"].name="+members[i].name);
		}
	}

}
