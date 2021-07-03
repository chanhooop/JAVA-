package com.javalec.base;

public class Main {

	public static void main(String[] args) {

	LaunchMenu child1 = new Child1(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANAN, PriceTable.MILK,PriceTable.ALMOND);
	LaunchMenu child2 = new Child2(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANAN, PriceTable.MILK,PriceTable.ALMOND);
			
	System.out.println("Child1의 식대 :" + child1.calc());
	System.out.println("Child2의 식대 :" + child2.calc());

	}

}
