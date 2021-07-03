package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Sumadd;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		int result = 0;
		
		System.out.print("Enter an integer(0~9) : ");
		 input = scanner.nextInt();
		
		Sumadd sumadd = new Sumadd();
		result = sumadd.resultSum(input);
		
		System.out.println("Sum of digits = " + result);
	}

}
