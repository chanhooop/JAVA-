package com.javalec.base;

import java.util.Scanner;

public class Exercise_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int inputCount = 0;
		
		System.out.print("입력할 숫자의 갯수? :");
		inputCount = scanner.nextInt();

		System.out.print(inputCount + "개의 숫자를 입력하세요!:");
		
	}

}
