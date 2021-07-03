package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student("James", 100));
		arrayList.add(new Student("Roberts", 90));
		arrayList.add(new Student("Cathy", 100));
		
		
		System.out.println(arrayList.get(0));	 			
		System.out.println(arrayList.get(0).getName());
		System.out.println(arrayList.get(0).getScore());
		
		for(int i=0 ; i< arrayList.size();i++) {                 //  ArrayList 는 .size   Array 는 .length
			
			System.out.print(arrayList.get(i).getName()+"\t\t");
			System.out.println(arrayList.get(i).getScore());
		}
		
	}

}
