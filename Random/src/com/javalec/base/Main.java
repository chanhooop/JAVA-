package com.javalec.base;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// Random
		
		//옛날 랜덤	
		for(int i=1 ; i<=6; i++){
			double d = Math.random();
			int a = (int)(d*3) + 1;
			System.out.println(a);
		}

		//--------------------------------
		// 요즘 랜덤	
		Random random = new Random();
		int i = random.nextInt(3);
		System.out.println(i);
		
	}

}
