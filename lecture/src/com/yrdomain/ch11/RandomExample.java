package com.yrdomain.ch11;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		int[] selectNumber = new int [6];
		Random random = new Random(3);
		System.out.println("¼±ÅÃ ¹øÈ£:");
		for(int i =0; i<6; i++) {
			selectNumber[i] = random.nextInt(45)+1;
			System.out.println(selectNumber[i] +" ");
		}
		System.out.println();
		
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.println("´çÃ·¹øÈ£:");
		for(int i =0; i<6; i++) {
			winningNumber[i] = random.nextInt(45)+1;
			System.out.println(winningNumber[i] +" ");
		}
		System.out.println();
		
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result= Arrays.equals(selectNumber, winningNumber);
		System.out.println("´çÃ·¿©ºÎ:");
		if(result) {
			System.out.println("´çÃ·µÇ¼Ì½À´Ï´Ù");
		}else {
			System.out.println("´çÃ·x");
		}
		
	}

}
