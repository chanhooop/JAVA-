package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Shop1--------------");
		StoreHq shop1 = new Shop1();
		shop1.ordrKim();
		shop1.ordrBu();
		shop1.ordrBi();
		shop1.ordrSoon();
		shop1.ordrKong();
				
		System.out.println("Shop2--------------");
		StoreHq shop2 = new Shop2();
		shop2.ordrKim();
		shop2.ordrBu();
		shop2.ordrBi();
		shop2.ordrSoon();
		shop2.ordrKong();
		

		System.out.println("Shop3--------------");
		StoreHq shop3 = new Shop3();
		shop3.ordrKim();
		shop3.ordrBu();
		shop3.ordrBi();
		shop3.ordrSoon();
		shop3.ordrKong();

		System.out.println("===============");
		StoreHq[] store = {new StoreHq(), new Shop1(), new Shop2(), new Shop3()};
		for(int i = 0; i<store.length; i++){
			store[i].ordrKim();
			store[i].ordrBu();
			store[i].ordrBi();
			store[i].ordrSoon();
			store[i].ordrKong();
		}
		
			
	}

}
