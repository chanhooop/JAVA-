package com.javalec.base;

public class Shop1 extends StoreHq{
	
	//Field
	
	//consttructor

	public Shop1() {
		// TODO Auto-generated constructor stub
	}	
	
	// Method

	@Override
	public void ordrKim() {
		// TODO Auto-generated method stub
		System.out.println("김치찌개 : 4500원");
	}
	
	@Override
	public void ordrBu() {
		// TODO Auto-generated method stub
		System.out.println("부대찌개 : 5000원");
	}
	@Override
	public void ordrSoon() {
		// TODO Auto-generated method stub
		System.out.println("순대국은 판매하지 않습니다.");
	}
	
}
