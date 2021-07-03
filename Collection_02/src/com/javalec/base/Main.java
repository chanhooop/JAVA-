package com.javalec.base;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// HasyMap
		HashMap<Integer, String> hasyMap = new HashMap<Integer, String>();  
		
		hasyMap.put(10, "str0");
		hasyMap.put(11, "str1");
		hasyMap.put(21, "str2");
		hasyMap.put(31, "str3");
		
		System.out.println(hasyMap);
		System.out.println(hasyMap.get(11));
		
		HashMap<String, String> hashMap2 = new HashMap<String, String>();
		hashMap2.put("a", "apple");
		hashMap2.put("b", "banana");
		hashMap2.put("c", "coke");
		System.out.println(hashMap2);
		System.out.println(hashMap2.get("c"));
		
		hashMap2.remove("a");
		System.out.println(hashMap2);
		
		hashMap2.clear();

	}

}
