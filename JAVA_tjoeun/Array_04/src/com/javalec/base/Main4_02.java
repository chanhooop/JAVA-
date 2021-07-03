package com.javalec.base;

import java.util.Scanner;

public class Main4_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] Korea = new int[4];
		int[] English = new int[4];
		int[] Math = new int[4];
		
		int[] koreaGrade = new int[4] ;
		int[] englishGrade = new int[4] ;
		int[] mathGrade = new int[4] ;

 

		for(int i=0 ; i<4 ; i++) {
			if(i == 0) {
				System.out.println("Korea의 성적을 입력 : ");
			}
			
			System.out.print("NO"+ (i+1) + "의 성적은 : " );
			Korea[i] = scan.nextInt();
			koreaGrade[i] = Korea[i];	
		}
	
		
		System.out.println("English의 성적을 입력 : ");
		for(int i=0 ; i<4 ; i++) {
			System.out.print("NO"+ (i+1) + "의 성적은 : " );
			English[i] = scan.nextInt();
			englishGrade[i] = English[i];	

			
		}
		
		System.out.println("Math의 성적을 입력 : ");
		for(int i=0 ; i<4 ; i++) {
			System.out.print("NO"+ (i+1) + "의 성적은 : " );
			Math[i] = scan.nextInt();
			mathGrade[i] = Math[i];	
			
			
		}
		
	System.out.println("\t" + "Korea"+ "\t" + "English" + "\t"+ "Math" + "\t" + "Total" +"\t"+ "average");	
	
	for (int i=0 ; i<4 ; i++) {
		System.out.println("No"+ (i+1) + "\t" + koreaGrade[i] + "\t" + englishGrade[i] + "\t" + mathGrade[i] +  "\t" + (koreaGrade[i] + englishGrade[i]+mathGrade[i]) + "\t" + ((koreaGrade[i] + englishGrade[i]+mathGrade[i])/3));
			
	        }		   
	
	
		}


	}

