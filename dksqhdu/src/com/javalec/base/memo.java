package com.javalec.base;

import java.util.Scanner;


public class memo {

	public static void main(String[] args) {
		
		//구구단의 짝수따로 홀수따
		
	int danEven = 0;
	int danOdd = 0;
	
	for(int i = 1; i <=9; i++) {
		System.out.println(i%2 != 0 ? danOdd += i : danEven += i);
		
	}
		
	}
}
