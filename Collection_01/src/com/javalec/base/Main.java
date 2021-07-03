package com.javalec.base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		//ArrayList
		
		ArrayList<String> arrayList = new ArrayList<String>();    // <> 이괄호는 Generic 이라고 하고 타입을 정하는 역할
		System.out.println("<<<<ArrayList>>>>");
		// ArrayList에 Data추가
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		arrayList.add("str4");	
		System.out.println(arrayList);				// [str1, str2, str3, str4] 이렇게 출력
		System.out.println(arrayList.toString());
		
		// ArrayList의 Data 불러오기
		String str1 = arrayList.get(3);
		System.out.println("Index 3 : " + str1);   //Index 3 : str4   이렇게 출력
	
		
		//ArrayList의 특정 index의 data를 수정하기
		arrayList.set(1, "str222");
		System.out.println(arrayList);   //[str1, str222, str3, str4]  이렇게 출력
		
		//ArrayList의 크기 확인하기
		int size = arrayList.size();
		System.err.println("size : " + size);   //size : 4
		
		//ArrayList의 내용 삭제하기
		arrayList.remove(1);				//번지수로 지우기
		System.out.println(arrayList);     //[str1, str3, str4]
		arrayList.remove("str4");
		System.out.println(arrayList);   // [str1, str3]
		
		//ArrayList의 내용 전부 초기화 하기
		arrayList.clear();
		System.out.println(arrayList);   //  []
		
		// Linked List
		
		LinkedList<String> linkedList = new LinkedList<String>();
		System.out.println(">>> Linked List<<<");
		linkedList.add("str1");
		linkedList.add("str2");
		linkedList.add("str3");
		linkedList.add("str4");
		System.out.println(linkedList);
		
		
		// LinkedList의 Data 불러오기
		String str2 = linkedList.get(3);
		System.out.println("Index 3 : " + str2);   //Index 3 : str4   이렇게 출력
	
		
		//LinkedList의 특정 index의 data를 수정하기
		linkedList.set(1, "str222");
		System.out.println(linkedList);   //[str1, str222, str3, str4]  이렇게 출력
		
		//LinkedList의 크기 확인하기
		int size2 = linkedList.size();
		System.err.println("size : " + size2);   //size : 4
		
		//LinkedList의 내용 삭제하기
		linkedList.remove(1);				//번지수로 지우기
		System.out.println(linkedList);     //[str1, str3, str4]
		linkedList.remove("str4");
		System.out.println(linkedList);   // [str1, str3]
		
		//LinkedList의 내용 전부 초기화 하기
		linkedList.clear();
		System.out.println(linkedList);   //  []
		
		
		
		// Vector				//벡터도 사용하는법이 똑같다d
		
		
		Vector<String> vector = new Vector<String>();
		
		
		// ArrayList
		
	}

}
